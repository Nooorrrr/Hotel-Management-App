package NoorV;


import java.util.ArrayList;
import java.util.List;

public class client extends User{

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String telephone;
    private List<Reservation> reservations;

    public client(String Username, String Password, int id, String nom, String prenom, String email, String adresse, String telephone) {
        super(Username, Password);
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        this.reservations = new ArrayList<>();
    }

    public void reserverChambre(TypeChambre type , String dateDebut, String dateFin){
        Date d = new Date().fromString(dateDebut);
        Date f = new Date().fromString(dateFin);
        Reservation reservation = new Reservation(this.id, d, f, type);
        reservations.add(reservation);
        
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation){
        reservations.remove(reservation);
    }

    public void afficherReservations(){
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    public void demandeReservation(){
        
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getEmail() {
        return email;
    }
    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getId() {
        return id;
    }
}