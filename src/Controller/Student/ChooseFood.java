package Controller.Student;

import Model.Food;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

import static Controller.Student.Controller.Loggedstudent;
import static Model.Food.All_FOOD;
import static Model.Food.All_FOOD_LIST;

public class ChooseFood {
    private static int selectedIndex;
    @FXML
    Button BackBtm, addBtm;
    @FXML
    ListView listView;

    @FXML
    public void initialize() {
        listView.getItems().addAll(All_FOOD_LIST);

    }

    @FXML
    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");

    }

    @FXML
    public void findIndex(MouseEvent mouseEvent) {

        listView.setOnMouseClicked(event -> {
            selectedIndex = listView.getSelectionModel().getSelectedIndex();
            System.out.println(selectedIndex);
        });
        System.out.println(selectedIndex);


    }

    public void add() {
        boolean hasBeenInTheList = false;

        Food tempFood = new Food();
        tempFood = All_FOOD.get(selectedIndex);
        if (All_FOOD.get(selectedIndex).getFood_Price() > Loggedstudent.credit) {
            new Alert(Alert.AlertType.ERROR, "Your credit is not enough For this food \n Go and Charge your Credit").showAndWait();
        } else {
            Loggedstudent.credit -= All_FOOD.get(selectedIndex).getFood_Price();
            Loggedstudent.FoodsInWeek.add(All_FOOD_LIST.get(selectedIndex));

            listView.getItems().setAll(All_FOOD_LIST);
            new Alert(Alert.AlertType.INFORMATION, "This Food Successfully added to your Food Schedule").showAndWait();

        }
    }

}
