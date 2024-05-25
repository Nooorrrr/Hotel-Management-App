package mainPackage;
import mainPackage.interfaces_graphiques.Welcome;
import mainPackage.model.Hotel;


public class App {
    public static void main(String[] args) {
        Hotel hotel =new Hotel();
        new Welcome(hotel).setVisible(true);
    }
}
