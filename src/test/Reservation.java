package test;

public class Reservation {

    private int id;
    private Chambre chambre;
    public Date dateDebut;
    public Date dateFin;

    public Reservation(int id, Chambre chambre, Date dateDebut, Date dateFin) {
        this.id = id;
        this.chambre = chambre;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public int getId() {
        return id;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }
}