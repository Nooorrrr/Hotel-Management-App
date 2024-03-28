public class client extends User{

    //jsp wsh nzidolo comme attribut lmouhim extends user w 5las 
    private static int ClientId=0;
    public client(String Username, String Password) {
        super(Username, Password);
        ClientId++;
       
    }
    
}
