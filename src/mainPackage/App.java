package mainPackage;
import mainPackage.interfaces_graphiques.Welcome;
import mainPackage.model.Hotel;


public class App {
    Hotel hotel =new Hotel();
    Welcome welcome = new Welcome();
    public static void main(String[] args) {
        new Welcome().setVisible(true);
    }
}
