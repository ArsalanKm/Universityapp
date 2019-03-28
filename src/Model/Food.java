package Model;

import Model.Student.Student;

import java.util.ArrayList;
import java.util.List;

public class Food {
   private String Food_name;
   private int Food_Price;
   private String Food_Day;
    public static final List<Food> All_FOOD = new ArrayList<>();
    public static List<String> All_FOOD_LIST=new ArrayList<>();
    public String getFood_name() {
        return Food_name;
    }

    public void setFood_name(String food_name) {
        Food_name = food_name;
    }

    public int getFood_Price() {
        return Food_Price;
    }

    public void setFood_Price(int food_Price) {
        Food_Price = food_Price;
    }

    public String getFood_Day() {
        return Food_Day;
    }

    public void setFood_Day(String food_Day) {
        Food_Day = food_Day;
    }
    public String Make_String()
    {
        return "  Food day:  "+this.getFood_Day()+"   Food name:  "+this.getFood_name()+"    Food Price:   "+this.getFood_Price();
    }
}
