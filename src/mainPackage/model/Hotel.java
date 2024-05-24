package mainPackage.model;

import java.util.Map;
import java.util.HashMap;


public class Hotel {
    public static Map <Integer,Reservation> reservationsRequest = new HashMap<>();
    public static HashMap <Integer, Room> rooms = new HashMap<>();
    public static HashMap <String, User> users = new HashMap<>();
    User user1 = new User("fullName", "email", "telephone", "password");

    Room room1 = new Room(RoomType.Single, Vue.Mountain, Category.Standard, Room_status.Available);
    Room room2 = new Room(RoomType.Double, Vue.Beach, Category.Premium, Room_status.Reserved);
    Room room3 = new Room(RoomType.Triple, Vue.City, Category.Executive, Room_status.Available);
    Room room4 = new Room(RoomType.Quadruple, Vue.Beach, Category.Family, Room_status.Reserved);
    Room room5 = new Room(RoomType.Single, Vue.Mountain, Category.Standard, Room_status.Available);
    Room room6 = new Room(RoomType.Double, Vue.City, Category.Premium, Room_status.Reserved);
    Room room7 = new Room(RoomType.Triple, Vue.Beach, Category.Executive, Room_status.Available);
    Room room8 = new Room(RoomType.Quadruple, Vue.Mountain, Category.Family, Room_status.Reserved);
    Room room9 = new Room(RoomType.Single, Vue.City, Category.Standard, Room_status.Available);
    Room room10 = new Room(RoomType.Double, Vue.Beach, Category.Premium, Room_status.Reserved);
    Room room11 = new Room(RoomType.Triple, Vue.Mountain, Category.Executive, Room_status.Available);
    Room room12 = new Room(RoomType.Quadruple, Vue.City, Category.Family, Room_status.Reserved);
    Room room13 = new Room(RoomType.Single, Vue.Beach, Category.Standard, Room_status.Available);
    Room room14 = new Room(RoomType.Double, Vue.Mountain, Category.Premium, Room_status.Reserved);
    Room room15 = new Room(RoomType.Triple, Vue.City, Category.Executive, Room_status.Available);
    Room room16 = new Room(RoomType.Quadruple, Vue.Beach, Category.Family, Room_status.Reserved);
    Room room17 = new Room(RoomType.Single, Vue.Mountain, Category.Standard, Room_status.Available);
    Room room18 = new Room(RoomType.Double, Vue.City, Category.Premium, Room_status.Reserved);
    Room room19 = new Room(RoomType.Triple, Vue.Beach, Category.Executive, Room_status.Available);
    Room room20 = new Room(RoomType.Quadruple, Vue.Mountain, Category.Family, Room_status.Reserved);
    Room room21 = new Room(RoomType.Single, Vue.City, Category.Standard, Room_status.Available);
    Room room22 = new Room(RoomType.Double, Vue.Beach, Category.Premium, Room_status.Reserved);
    Room room23 = new Room(RoomType.Triple, Vue.Mountain, Category.Executive, Room_status.Available);
    Room room24 = new Room(RoomType.Quadruple, Vue.City, Category.Family, Room_status.Reserved);
    Room room25 = new Room(RoomType.Single, Vue.Beach, Category.Standard, Room_status.Available);
    Room room26 = new Room(RoomType.Double, Vue.Mountain, Category.Premium, Room_status.Reserved);
    Room room27 = new Room(RoomType.Triple, Vue.City, Category.Executive, Room_status.Available);
    Room room28 = new Room(RoomType.Quadruple, Vue.Beach, Category.Family, Room_status.Reserved);
    Room room29 = new Room(RoomType.Single, Vue.Mountain, Category.Standard, Room_status.Available);
    Room room30 = new Room(RoomType.Double, Vue.City, Category.Premium, Room_status.Reserved);




    public Hotel(){
        users.put(user1.getEmail(), user1);
        users.put("john.doe@example.com", new User("John Doe", "john.doe@example.com", "1234567890", "password123"));
        users.put("jane.smith@example.com", new User("Jane Smith", "jane.smith@example.com", "0987654321", "password456"));
        users.put("robert.johnson@example.com", new User("Robert Johnson", "robert.johnson@example.com", "9876543210", "password789"));
        users.put("lisa.wong@example.com", new User("Lisa Wong", "lisa.wong@example.com", "0123456789", "passwordabc"));
        users.put("michael.brown@example.com", new User("Michael Brown", "michael.brown@example.com", "5555555555", "passworddef"));
        users.put("maria.garcia@example.com", new User("Maria Garcia", "maria.garcia@example.com", "6666666666", "passwordghi"));
        users.put("david.wilson@example.com", new User("David Wilson", "david.wilson@example.com", "7777777777", "passwordjkl"));
        users.put("emily.martinez@example.com", new User("Emily Martinez", "emily.martinez@example.com", "8888888888", "passwordmno"));
        users.put("james.taylor@example.com", new User("James Taylor", "james.taylor@example.com", "9999999999", "passwordpqr"));
        users.put("sarah.anderson@example.com", new User("Sarah Anderson", "sarah.anderson@example.com", "1111111111", "passwordstu"));
        users.put("daniel.thomas@example.com", new User("Daniel Thomas", "daniel.thomas@example.com", "2222222222", "passwordvwx"));
        users.put("jennifer.hernandez@example.com", new User("Jennifer Hernandez", "jennifer.hernandez@example.com", "3333333333", "passwordyz1"));
        users.put("matthew.martinez@example.com", new User("Matthew Martinez", "matthew.martinez@example.com", "4444444444", "password234"));
        users.put("ashley.johnson@example.com", new User("Ashley Johnson", "ashley.johnson@example.com", "5555555555", "password567"));
        users.put("christopher.smith@example.com", new User("Christopher Smith", "christopher.smith@example.com", "6666666666", "password890"));
        users.put("amanda.martin@example.com", new User("Amanda Martin", "amanda.martin@example.com", "7777777777", "password901"));
        users.put("jessica.rodriguez@example.com", new User("Jessica Rodriguez", "jessica.rodrz@example.com", "8888888888", "password234"));
        users.put("ryan.lee@example.com", new User("Ryan Lee", "ryan.lee@example.com", "9999999999", "password567"));
        users.put("michelle.chavez@example.com", new User("Michelle Chavez", "michelle.chavez@example.com", "1111111111", "password890"));
        users.put("justin.wright@example.com", new User("Justin Wright", "justin.wright@example.com", "2222222222", "password123"));
        users.put("tiffany.nguyen@example.com", new User("Tiffany Nguyen", "tiffany.nguyen@example.com", "3333333333", "password456"));
        users.put("juan.gonzalez@example.com", new User("Juan Gonzalez", "juan.gonzalez@example.com", "4444444444", "password789"));
        users.put("melissa.yang@example.com", new User("Melissa Yang", "melissa.yang@example.com", "5555555555", "passwordabc"));

        rooms.put(room1.getID_Room(), room1);
        rooms.put(room2.getID_Room(), room2);
        rooms.put(room3.getID_Room(), room3);
        rooms.put(room4.getID_Room(), room4);
        rooms.put(room5.getID_Room(), room5);
        rooms.put(room6.getID_Room(), room6);
        rooms.put(room7.getID_Room(), room7);
        rooms.put(room8.getID_Room(), room8);
        rooms.put(room9.getID_Room(), room9);
        rooms.put(room10.getID_Room(), room10);
        rooms.put(room11.getID_Room(), room11);
        rooms.put(room12.getID_Room(), room12);
        rooms.put(room13.getID_Room(), room13);
        rooms.put(room14.getID_Room(), room14);
        rooms.put(room15.getID_Room(), room15);
        rooms.put(room16.getID_Room(), room16);
        rooms.put(room17.getID_Room(), room17);
        rooms.put(room18.getID_Room(), room18);
        rooms.put(room19.getID_Room(), room19);
        rooms.put(room20.getID_Room(), room20);
        rooms.put(room21.getID_Room(), room21);
        rooms.put(room22.getID_Room(), room22);
        rooms.put(room23.getID_Room(), room23);
        rooms.put(room24.getID_Room(), room24);
        rooms.put(room25.getID_Room(), room25);
        rooms.put(room26.getID_Room(), room26);
        rooms.put(room27.getID_Room(), room27);
        rooms.put(room28.getID_Room(), room28);
        rooms.put(room29.getID_Room(), room29);
        rooms.put(room30.getID_Room(), room30);

    }



}
