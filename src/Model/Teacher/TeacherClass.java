package Model.Teacher;

import Model.Schedule;
import Model.Student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TeacherClass {


    private String name;
    public int capacity;
    private String time;
    private String day;
    private int unit;

    public static List<TeacherClass> ALL_CREAT_CLASS = new ArrayList<>(); // list of class refrence
    public static List<String> CLASS_LIST = new ArrayList<>(); // list of class in string type
    //public  List<String> JOINED_STUDENT = new ArrayList<>();


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String makeString() {
        return "Name: " + this.getName() +"  Capacity:   "+this.getCapacity()+ "    " + "Day: " + this.getDay() + " " + "Time: " + this.getTime() + "    " + "Unit: " + this.getUnit();
    }

    public String addStudent(Student student, String ClassName) {
        return "Name: " + student.getUsername() + "     " + "Class: " + ClassName;
    }

}
