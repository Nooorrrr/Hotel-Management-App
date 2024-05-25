
package mainPackage.model;
import mainPackage.model.*;

public class ReservationRequest {
    private static int id = 0;
    private int idReservation;
    private int idroom;
    private Date checkinDate;
    private Date checkoutDate;
    private Vue vue;
    private Category category;
    private RoomType roomType;
    private User user;
    private Status status;

    public ReservationRequest(User user, Date checkinDate, Date checkoutDate,Vue vue, Category category, RoomType roomType) {
        id++;
        this.idReservation = id;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.vue = vue;
        this.category = category;
        this.roomType = roomType;
        this.user = user;
        this.status = Status.PENDING;
        this.idroom = 0;
    }

    public int getIdReservationRequest() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
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

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Vue getVue() {
        return vue;
    }

    public void setVue(Vue vue) {
        this.vue = vue;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

}
