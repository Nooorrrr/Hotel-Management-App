package NoorV;

enum TypeChambre{
    SIMPLE,
    DOUBLE,
    VIP
}

enum Status{
    ACCEPTER,
    RUFUSER,
    EN_ATTENTE
}

public class Reservation{
    private int ClientId;
    private int NumChambre;
    private Date dateDebut;
    private Date dateFin;
    private TypeChambre typeChambre;
    private Status status;
    

    public Reservation(int ClientId, int NumChambre, Date dateDebut, Date dateFin, TypeChambre typeChambre) {
        this.ClientId = ClientId;
        this.NumChambre = NumChambre;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.typeChambre = typeChambre;
        this.status = Status.EN_ATTENTE;
    }

    public int getClientId() {
        return ClientId;
    }

    public int getNumChambre() {
        return NumChambre;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
  
}