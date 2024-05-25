package mainPackage.model;


public class ReservationUser extends ReservationRequest {
    private static int id = 0;
    private int idReservation;
    //private Room chambre;
    private User user;
    private Status status;

    public ReservationUser( User user, Date checkinDate, Date checkoutDate, Vue vue, Category category, RoomType roomType) {
        super(user, checkinDate, checkoutDate, vue, category, roomType);
        id++;
        this.idReservation = id;
        
        this.user = user;
        this.status = Status.PENDING;
    }

    public int getIdReservation() {
        return idReservation;
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

}
