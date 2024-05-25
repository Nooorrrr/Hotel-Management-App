package mainPackage.Controllers;

import mainPackage.model.*;
import java.util.HashMap;
import java.util.Map;

public class AdminController {

    public static void addReservationRequest(HashMap<Integer, ReservationRequest> reservationRequests, ReservationRequest reservationRequest) {
        reservationRequests.put(reservationRequest.getIdReservationRequest(), reservationRequest);
    }

    public static void removeReservationRequest(HashMap<Integer, ReservationRequest> reservationRequests, int idReservationRequest) {
        reservationRequests.remove(idReservationRequest);
    }

    public static void updateReservationRequest(HashMap<Integer, ReservationRequest> reservationRequests, ReservationRequest reservationRequest) {
        reservationRequests.put(reservationRequest.getIdReservationRequest(), reservationRequest);
    }

    public static int checKIfRoomExcist(HashMap<Integer, Room> hash,RoomType t,Category c,Vue v) {
        for (Map.Entry<Integer, Room> entry : hash.entrySet()) {
            Room room= entry.getValue();
            if(room.getTypeChambre()==t && room.getVue()==v && room.getCategory()== c && room.getStatus()==Room_status.Available ){
                return room.getID_Room();
            }
        }
        return -1;

    }

    public static void AcceptUser(int idRequest,String email, int roomNum,Hotel hotel){
       Room r = hotel.rooms.get(roomNum);
       r.setStatus(Room_status.Reserved);
       hotel.rooms.replace(roomNum,r);

       ReservationRequest rsv = hotel.reservationsRequestWaitlist.get(idRequest);
       rsv.setIdroom(roomNum);
       rsv.setStatus(Status.ACCEPTED);
       hotel.reservationsRequestWaitlist.replace(idRequest,rsv);

       hotel.users.get(email).getReservations().replace(idRequest,rsv);


    }

    public static void RefuseUser(int idRequest,String email, int roomNum,Hotel hotel){

        ReservationRequest rsv = hotel.reservationsRequestWaitlist.get(idRequest);
        rsv.setIdroom(roomNum);
        rsv.setStatus(Status.RUFUSED);
        hotel.reservationsRequestWaitlist.replace(idRequest,rsv);

        hotel.users.get(email).getReservations().replace(idRequest,rsv);

    }

    
}
