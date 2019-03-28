package Controller.Student.Teachers;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

import static Model.Teacher.TeacherClass.CLASS_LIST;


public class ClassListController {
    @FXML
    ListView <String> ClassesList;
    @FXML
    Button BackBtm;

    public void initialize() {
        ClassesList.getItems().addAll(CLASS_LIST);
    }
    public void back () throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherPanel.fxml");

    }
}
