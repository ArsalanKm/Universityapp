package Controller.Student.admin;

import Model.Food;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

import java.io.IOException;

import static Model.Food.All_FOOD;
import static Model.Food.All_FOOD_LIST;

public class MakingFoodSchedule {
    @FXML
    MenuItem Food_1, Food_2, Food_3, Food_4, Food_5, Food_6, Day_1, Day_2, Day_3, Day_4, Day_5;
    Food Temp_Food = new Food();
@FXML
    Button back,create;
    public void Food_1ّFunction() {
        Temp_Food.setFood_name("قورمه سیزی ");
        Temp_Food.setFood_Price(2000);
    }

    public void Food_2Function() {
        Temp_Food.setFood_name("چلو کباب");
        Temp_Food.setFood_Price(2500);
    }

    public void Food_3Function() {
        Temp_Food.setFood_name("جوجه کباب");
        Temp_Food.setFood_Price(3000);
    }

    public void Food_4Function() {
        Temp_Food.setFood_name("خورشت قیمه");
        Temp_Food.setFood_Price(1500);
    }

    public void Food_5Function() {
        Temp_Food.setFood_name("چلو برگ");
        Temp_Food.setFood_Price(3500);
    }

    public void Food_6Function() {
        Temp_Food.setFood_name("چلوماهی");
        Temp_Food.setFood_Price(2000);
    }

    public void Day_1Function() {
        Temp_Food.setFood_Day("Saturday");
    }

    public void Day_2Function() {
        Temp_Food.setFood_Day("Sunday");

    }

    public void Day_3Function() {
        Temp_Food.setFood_Day("Monday");

    }

    public void Day_4Function() {
        Temp_Food.setFood_Day("Tuesday");

    }

    public void Day_5Function() {
        Temp_Food.setFood_Day("Wedensday");

    }
    public void create()

    {
        All_FOOD.add(Temp_Food);
        All_FOOD_LIST.add(Temp_Food.Make_String());
        Food Temp_Food = new Food();
        Temp_Food.setFood_Day("");
        Temp_Food.setFood_name("");


        new Alert(Alert.AlertType.INFORMATION,"برنامه ثبت شد.").showAndWait();
    }
    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/adminPanel.fxml");

    }
}
