package Model.Teacher;

import Model.Student.Student;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String username ;
    private  String password ;

    public  static  final List<Teacher> All_Teachers  = new ArrayList<>();
public static final List<String> TEACHERS_LIST=new ArrayList<>();

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
    public String toString() {
        return "Username : " + this.getUsername() + "                   " + "Password : " + this.getPassword();
    }
}
