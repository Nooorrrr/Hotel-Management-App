package mainPackage;
import mainPackage.interfaces_graphiques.Welcome;


public class App {
    Welcome welcome = new Welcome();
    public static void main(String[] args) {
        new Welcome().setVisible(true);
    }
}
