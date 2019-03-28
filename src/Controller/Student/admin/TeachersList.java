package Controller.Student.admin;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

import static Model.Teacher.Teacher.TEACHERS_LIST;


public class TeachersList {
    @FXML
    ListView TeachersListListView;
    @FXML
    Button backBtm;
public void initialize()
{
    TeachersListListView.getItems().addAll(TEACHERS_LIST);
}
    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/adminPanel.fxml");

    }
}
