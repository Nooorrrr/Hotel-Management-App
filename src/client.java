public class Client extends User{

    //jsp wsh nzidolo comme attribut lmouhim extends user w 5las 
    private static int ClientId=0;
    public Client(String Username, String Password) {
        super(Username, Password);
        ClientId++;
       
    }
    
}
