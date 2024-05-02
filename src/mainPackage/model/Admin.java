package mainPackage.model;
import java.util.Map;
import java.util.HashMap;

public class Admin {

    private Map <Integer,Reservation> reservationsRequest;
    private Map <Integer, Room> rooms;
    private HashMap <String, User> users;

    public Admin() {
        users = new HashMap<>();
    }

    // crreation te3 user
    public User createUser(String fullName, String Password, String email, String telephone) throws Exception {
        if (users.containsKey(email)) {
            throw new Exception("User with this email already exists.");
        } else {
            User newUser = new User(fullName,Password, email,telephone);
            users.put(email, newUser);
            return newUser;
        }
    }

    // log in te3 user
    public User login(String email, String password) throws Exception {
        if (users.containsKey(email)) {
            User user = users.get(email);
            if (user.getPassword().equals(password)) {
                return user;
            } else {
                throw new Exception("Incorrect password.");
            }
        } else {
            throw new Exception("User with this email does not exist.");
        }
    }

    public void addRoom(RoomType typeChambre, Vue vue, Category category){
        Room newRoom = new Room(typeChambre, vue, category);
        rooms.put(newRoom.getNumeroChambre(), newRoom);
    }

    public void removeRoom(int numeroChambre){
        rooms.remove(numeroChambre);
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
