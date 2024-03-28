package NoorV;
public class client extends User{

    //jsp wsh nzidolo comme attribut lmouhim extends user w 5las 
    private static int ClientId=0;
    public client(String Username, String Password) {
        super(Username, Password);
        ClientId++;
       
    }

    public void reserverChambre(int NumChambre, Date dateDebut, Date dateFin) throws Exception{
        if(dateDebut.isAfter(dateFin)){
            throw new Exception("Date debut doit etre avant date fin");
        }
        Reservation reservation = new Reservation(ClientId, NumChambre, dateDebut, dateFin);
       // reservations.put(reservation.getId(), reservation); ki yrezervi lazm tet7at 3nd l admin demande te3 reservation
    }

    public void annulerReservation(int NumChambre){
         //bon hna lazm ncompari la date te3 reservation ta3o w la date actuel since may9drsh yannuli w ki tkon jazet la date te3 debut 
         // lazm n7aws 3la a way njib biha date actuelle without library 
    }
    
}
