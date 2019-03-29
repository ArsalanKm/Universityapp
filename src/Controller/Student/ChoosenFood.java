package Controller.Student;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

import static Controller.Student.Controller.Loggedstudent;



public class ChoosenFood {
    @FXML
    Button Back;
    @FXML
    ListView listView;
    public void initialize() {
listView.getItems().addAll(Loggedstudent.getAuthors(Loggedstudent.FoodsInWeek));
    }
    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");

    }

}
