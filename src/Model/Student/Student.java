package Model.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {



    public  static  final List<Student> All_Student  = new ArrayList<>();

    public static   List<String> LIST_VIEW = new ArrayList<>();



    private String username ;
    private  String password ;
    private  double credit =  0 ;
    private  int course = 0 ;
    private  double grade = 20 ;

    public  String  getUsername(){
        return  username ;
    }

    public  String getPassword(){
        return password ;
    }

    public double getCredit() {
        return credit;
    }

    public int getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void addCredit(double credit) {
        this.credit += credit;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    public String makeString(){
        return "Username : " +this.getUsername() + "                   " +"Password : "+ this.getPassword();
    }


}
