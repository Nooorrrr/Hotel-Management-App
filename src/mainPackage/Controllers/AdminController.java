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

    //public static void AcceptUser(int idRequest, User user, int roomNum, HashMap<Integer, Room>){

 //   }

    
}
