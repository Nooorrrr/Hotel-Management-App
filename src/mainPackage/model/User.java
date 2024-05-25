package mainPackage.model;

import java.util.HashMap;

public class User {
    private String fullName;
    private String email;
    private String telephone;
    private String password;
    private HashMap<Integer, ReservationRequest> reservations;

    public User(String fullName, String email, String telephone, String password) {
        this.fullName = fullName;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        reservations = new HashMap<>();
    }

    public String getFullName() {
        return fullName;
    }

public void setFullName(String fullName) {
    this.fullName = fullName;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getTelephone() {
    return telephone;
}

public void setTelephone(String telephone) {
    this.telephone = telephone;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public HashMap getReservations() {
    return reservations;
}

public void setReservations(HashMap reservations) {
    this.reservations = reservations;
}

}
