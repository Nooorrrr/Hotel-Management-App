public class User {
    private String Username;
    private String Password;

    public User(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void login(String Username, String Password) {
        if (this.Username.equals(Username) && this.Password.equals(Password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Username or password incorrect");
        }
    }


}
