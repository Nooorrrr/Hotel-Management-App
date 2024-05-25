package mainPackage.model;
enum Status{
    ACCEPTED,
    RUFUSED,
    PENDING
}

public class Reservation {
    private static int id = 0;
    private int idReservation;
    private Room chambre;
    private User user;
    private Status status;

    public Reservation(Room chambre, User user) {
        id++;
        this.idReservation = id;
        this.chambre = chambre;
        this.user = user;
        this.status = Status.PENDING;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public Room getChambre() {
        return chambre;
    }

    public void setChambre(Room chambre) {
        this.chambre = chambre;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

  public void modifyReservation()  {}
}
