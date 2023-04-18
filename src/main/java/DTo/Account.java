package DTo;


public class Account {
    private String username;
    private String password;
    private String access;

    public Account() {
    }

    public Account(String username, String password, String access) {
        this.username = username;
        this.password = password;
        this.access = access;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "username=" + username + ", password=" + password + ", access=" + access + '}';
    }

    
}
