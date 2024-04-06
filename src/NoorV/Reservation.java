package NoorV;

enum TypeChambre{
    SIMPLE,
    DOUBLE,
    SUITE
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
    
    public Reservation(int clientid){
        this(0, null, null, null);
        this.ClientId = clientid;
    }
    public Reservation(int ClientId, Date dateDebut, Date dateFin, TypeChambre typeChambre) {
        this.ClientId = ClientId;
        this.NumChambre =0;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.typeChambre = typeChambre;
        this.status = Status.EN_ATTENTE;
    }

    
    public Reservation(int i, Object object, Object object2, Object object3) {
        //TODO Auto-generated constructor stub
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

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin){
        this.dateFin = dateFin;
    }

    public void setNumChambre(int numChambre) {
        NumChambre = numChambre;
    }

    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }
  
}