package mainPackage.model;

import java.util.Map;
import java.util.HashMap;



public class Hotel {
    public static Map <Integer,Reservation> reservationsRequest = new HashMap<>();
    public static Map <Integer, Room> rooms = new HashMap<>();
    public static HashMap <String, User> users = new HashMap<>();
    User user1 = new User("fullName", "email", "telephone", "password");
    

    public Hotel(){
        users.put(user1.getEmail(), user1);
    }



}
