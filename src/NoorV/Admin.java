package NoorV;
import java.util.Map;

public class Admin extends User {

    private Map <Integer,Reservation> demandeReservations;
    private Map <Integer, Chambre> chambres;
    private Map <Integer, client> clients;
    //private Map <Integer, Reservation> reservations;

    public Admin(String Username, String Password) {
        super(Username, Password);
        //TODO Auto-generated constructor stub
    }
    
    public void AjouterChambre(){
        
       // chambres.put(chambre.getNumeroChambre(), chambre);
    }

    public void SupprimerChambre(int NumChambre){
        chambres.remove(NumChambre);
    }

    public void ChambreVide(){
        for (Map.Entry<Integer, Chambre> entry : chambres.entrySet()) {
            if(entry.getValue().estDisponible()){
                System.out.println("Chambre numero "+entry.getKey()+" est disponible");
            }
        }
    }

    public void ChambreOccupe(){
        for (Map.Entry<Integer, Chambre> entry : chambres.entrySet()) {
            if(!entry.getValue().estDisponible()){
                System.out.println("Chambre numero "+entry.getKey()+" est occupe");
            }
        }
    }

    


    
}
