package Controller.Student;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

import static Model.Food.All_FOOD_LIST;
import static Model.Teacher.TeacherClass.CLASS_LIST;

public class ChooseFood {
    @FXML
    Button BackBtm,addBtm;
    @FXML
    ListView listView;
    @FXML
    public void initialize()
    {
        listView.getItems().addAll(All_FOOD_LIST);

    }
    @FXML
    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");

    }@FXML
    public void add()
    {

    }

}
