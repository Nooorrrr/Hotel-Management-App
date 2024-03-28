public class Reservation{
    private int ClientId;
    private int NumChambre;
    private Date dateDebut;
    private Date dateFin;
    private boolean estAccepter;

    public Reservation(int ClientId, int NumChambre, Date dateDebut, Date dateFin) {
        this.ClientId = ClientId;
        this.NumChambre = NumChambre;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

}