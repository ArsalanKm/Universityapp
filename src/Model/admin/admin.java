package Model.admin;

public class admin {
    private String username;
    private String password;
    private boolean have_admin=false;

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
    @Override
    public String toString()
    {
        return "Username:  "+this.username+" \n \nPassWord:  "+this.password;

    }

    public boolean isHave_admin() {
        return have_admin;
    }

    public void setHave_admin(boolean have_admin) {
        this.have_admin = have_admin;
    }
}
