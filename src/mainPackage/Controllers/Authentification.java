package mainPackage.Controllers;

import mainPackage.interfaces_graphiques.Login;
import mainPackage.interfaces_graphiques.Signup;
import mainPackage.interfaces_graphiques.Warning;
import mainPackage.interfaces_graphiques.Principal_client;
import mainPackage.interfaces_graphiques.Principal_Admin;
import mainPackage.interfaces_graphiques.Login_Admin;
import mainPackage.model.*;
import java.util.HashMap;

public class Authentification {
    
    public static String getAdPassword(){
        Admin admin = new Admin();
        return admin.getAdminPassword();
    }

    public static void AuthentificationPassword(Login_Admin l,String pswd){
        if (!pswd.equals(getAdPassword()) ){
            Warning d = new Warning(null, true, "Wrong Password");
            //System.out.println("The password uve entered is wrong and it was : "+ pswd); for testing purposes
            d.setVisible(true);
        }else{
            l.dispose();
            Principal_Admin p = new Principal_Admin();
            p.setVisible(true);

        }
    }
    
    public static void AuthentificationClient(HashMap users,Login l, String Email , String Password ) {
        if (Email.isEmpty() || Password.isEmpty()) {
            Warning d = new Warning(l, true, "Please enter all fields");
            d.setVisible(true);
        } else {
            try {
                User user = Authentification.login(users,Email, Password); // Made the login method static
                l.dispose();
                Principal_client p = new Principal_client(user);
                p.setVisible(true); // Added line to make the Principal_client visible

            } catch (Exception e) {
                System.out.println(e.getMessage());
                Warning d = new Warning(l, true, e.getMessage());
                d.setVisible(true);
            }
        }
    }

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
            throw new Exception("Account does not exist");
        }
    }

    public static void registerUser(Signup s,String firstName, String Phone, String Email, String password) {
        if (firstName.isEmpty() || Phone.isEmpty() || Email.isEmpty() || password.isEmpty()){
            Warning d = new Warning(s , true,"Enter all fields");
            d.setVisible(true);
        }
       else{
           try {
               User user = Authentification.createUser(new Hotel().users,firstName, password, Email, Phone);
               s.dispose();
               Principal_client p = new Principal_client(user);
               p.setVisible(true);
           } catch (Exception e) {
               Warning d = new Warning(s, true, e.getMessage());
               d.setVisible(true);
           }
       }
    }
     // creation te3 user
     public static User createUser(HashMap users,String fullName, String Password, String email, String telephone) throws Exception {
        if (users.containsKey(email)) {
            throw new Exception("this email already exists.");
        } else {
            User newUser = new User(fullName,telephone, email,Password);
            users.put(email, newUser);
            return newUser;
        }
    }
    // log in te3 user

}
