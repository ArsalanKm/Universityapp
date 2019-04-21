package Model.Student;

import Model.Teacher.TeacherClass;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Student {


    public static final List<Student> All_Student = new ArrayList<>();

    public static List<String> LIST_VIEW = new ArrayList<>();


    public  List  <String> classes=new ArrayList<>();
    public  List  <String> ReservedBooks=new ArrayList<>();

    public static List<ObservableList<String>> ClassInformation;

public  List<String> FoodsInWeek=new ArrayList<>();



    public void setCredit(int credit) {
        this.credit = credit;
    }

    private String username;
    private String password;
    public int credit = 0;
    private int course = 0;
    private double grade = 20;

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

    public int getCredit() {
        return credit;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void addCredit(double credit) {
        this.credit += credit;
    }


    @Override
    public String toString() {
        return "\n"+"Username : " + this.getUsername() + "                   " + "Password : " + this.getPassword()+"\n";
    }
    public static List<String> getAuthors(List<String> authors) {
        List books = new ArrayList<String>();
       books=authors;
        return books;
    }
    public String ShowCredit()
    {
        return "Your Credit is:   "+this.getCredit();
    }
}
