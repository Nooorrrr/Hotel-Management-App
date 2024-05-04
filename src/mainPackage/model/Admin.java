package mainPackage.model;
import java.util.Map;
import java.util.HashMap;

public class Admin {

    private String adminPassword="admin1234";
    private Map <Integer,Reservation> reservationsRequest;
    private Map <Integer, Room> rooms;
    private HashMap <String, User> users;

    public Admin() {
        users = new HashMap<>();
        reservationsRequest = new HashMap<>();
        rooms = new HashMap<>();
    }

    public void addRoom(RoomType typeChambre, Vue vue, Category category){
        Room newRoom = new Room(typeChambre, vue, category);
        rooms.put(newRoom.getNumeroChambre(), newRoom);
    }

    public void removeRoom(int numeroChambre){
        rooms.remove(numeroChambre);
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public Room getRoomByNumber(int numeroChambre){
        return rooms.get(numeroChambre);
    }

    public Map<Integer, Reservation> getReservationsRequest() {
        return reservationsRequest;
    }

    public Map<Integer, Room> getRooms() {
        return rooms;
    }

    public HashMap<String, User> getUsers() {
        return users;
    }

    public void handleReservationRequest(Reservation reservation, Status status){
        reservation.setStatus(status);
        if (status == Status.ACCEPTED){
            reservation.getChambre().setAvailability(false);
        }
    }


    


    
}
