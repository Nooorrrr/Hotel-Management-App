package mainPackage.Controllers;

import mainPackage.interfaces_graphiques.Login;
import mainPackage.interfaces_graphiques.Warning1;
import mainPackage.interfaces_graphiques.Principal_client;
import mainPackage.model.*;
import java.util.HashMap;

public class Authentification {
    
    public static void AuthentificationClient(HashMap users,Login l, String Email , String Password ) {
       
        if (Email.isEmpty() || Password.isEmpty()) {
            Warning1 d = new Warning1(l, true, "Please enter all fields");
            d.setVisible(true);
        } else {
            try {
                User user = Authentification.login(users,Email, Password); // Made the login method static
                l.dispose();
                Principal_client p = new Principal_client(user);
                p.setVisible(true); // Added line to make the Principal_client visible

            } catch (Exception e) {
                System.out.println(e.getMessage());
                Warning1 d = new Warning1(l, true, "Acount does not exist.");
                d.setVisible(true);
            }
        }
       /*else{

           hna diri haka
           lazem tkoun kayna methode li teba3tilha l email w tretournilek l user li 3andou hadak l mail
           (bien sur ida kan y existi sinon tretounilek null)

           User user = new User();
           user = email_exist(Email);
           if (user != null){
                if (user.password.equals(Password)){
                    l.dispose();
                    Principal_client p = new Principal_client(user);
                    p.setVisible(true);
                }
                else{
                         Warning1 d = new Warning1(l, true, "Wrong Password");
                         d.setVisible(true);
                }
           }
           else{
                Warning1 d = new Warning1(l, true, "Create an account ");
                d.setVisible(true);
            }
       }*/
    }
    
     // crreation te3 user
     public User createUser(HashMap users,String fullName, String Password, String email, String telephone) throws Exception {
        if (users.containsKey(email)) {
            throw new Exception("User with this email already exists.");
        } else {
            User newUser = new User(fullName,Password, email,telephone);
            users.put(email, newUser);
            return newUser;
        }
    }

    // log in te3 user
    public static User login(HashMap users,String email, String password) throws Exception {
        if (users.containsKey(email)) {
            System.out.println("User found");
            User user = (User) users.get(email);
            if (user.getPassword().equals(password)) {
                return user;
            } else {
                throw new Exception("Incorrect password.");
            }
        } else {
            throw new Exception("Account does not excist");
        }
    }

}
