package mainPackage.Controllers;

import mainPackage.interfaces_graphiques.Login;
import mainPackage.interfaces_graphiques.Warning1;
import mainPackage.model.*;

public class Authentification {

    public static void Authentification(Login l, String Email , String Password ) {
        if (Email.isEmpty() || Password.isEmpty()) {
            Warning1 d = new Warning1(l, true, "Please enter all fields");
            d.setVisible(true);
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
    
}
