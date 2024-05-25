package mainPackage.Controllers;

import mainPackage.model.*;
import java.util.HashMap;

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
     
}
