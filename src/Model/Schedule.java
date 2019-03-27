package Model;

import java.util.Locale;

public class Schedule {
    public static final String FA_DAYS_IN_WEEK[]={
      "شنبه",
      "1شنبه",
      "2شنبه",
      "3شنبه",
      "4شنبه",
    };
    public static final String EN_DAYS_IN_WEEK[]={
            "Saturday",
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday"
    };
    int day;
    int time;

    public Schedule(int day,int time) {
        this.day = day;
        this.time = time;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public String getDay_string(Locale locale) {
        return locale.equals(new Locale("fa"))?FA_DAYS_IN_WEEK[day]:EN_DAYS_IN_WEEK[day];
    }
}
