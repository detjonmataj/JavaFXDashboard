package application.javafxdashboard.Utils;

public class User {

    protected long id;
    protected String username;
    protected String firstname;
    protected String lastname;
    protected String password;
    protected int privileges;

    public User(long id, String username, String firstname, String lastname, String password, int privileges) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.privileges = privileges;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPrivileges() {
        return privileges;
    }

    public void setPrivileges(int privileges) {
        this.privileges = privileges;
    }

    public void clear() {
        this.id = -1;
        this.username = "";
        this.firstname = "";
        this.lastname = "";
        this.password = "";
        this.privileges = -1;
    }
}
