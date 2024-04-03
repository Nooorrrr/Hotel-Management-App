package NoorV;


import java.util.ArrayList;
import java.util.List;

public class client extends User{

    //jsp wsh nzidolo comme attribut lmouhim extends user w 5las 
    private static int ClientId=0;
    private List <Reservation> reservations = new ArrayList<>();

    public client(String Username, String Password) {
        super(Username, Password);
        ClientId++;
       
    }

        public void reserverChambre(int NumChambre, Date dateDebut, Date dateFin) throws Exception{
            if(dateDebut.isAfter(dateFin)){
                throw new Exception("Date debut doit etre avant date fin");
            }
          //  Reservation reservation = new Reservation(ClientId, NumChambre, dateDebut, dateFin);
           // reservations.put(reservation.getId(), reservation); ki yrezervi lazm tet7at 3nd l admin demande te3 reservation
        }

        public void annulerReservation(int NumChambre){
           //  if (reservation.getDateDebut().isAfter(LocalDate.now())){
             //   throw new Exception("Vous ne pouvez pas annuler une reservation qui est deja passee");
             
       // }
        //else{
            //reservations.remove(reservation.getId());
        //}
        
    }
}