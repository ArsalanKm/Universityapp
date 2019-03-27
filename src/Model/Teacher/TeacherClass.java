package Model.Teacher;

import Model.Schedule;

import java.util.Locale;

public class TeacherClass {
    String name;
    float s;
    int capcity;
    Schedule[] schedules;

    public TeacherClass() {

    }


    public Schedule[] getSchedules() {
            return schedules;
    }

    public void setSchedules(Schedule[] schedules) {
        this.schedules = schedules;
    }
}
