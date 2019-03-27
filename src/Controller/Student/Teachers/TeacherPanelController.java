package Controller.Student.Teachers;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

import java.io.IOException;

import static Model.Student.Student.All_Student;
import static Model.Teacher.Teacher.All_Teachers;


public class TeacherPanelController {
    @FXML
    MenuItem ChangePassWordTextField, ChangeNameTextField;
    @FXML
    TextArea StudentTextArea;

    @FXML
    MenuItem ShowStudentsList;
@FXML
    ListView<String>
        studentslist;

    public void initialize() {
        StudentTextArea.setText(All_Teachers.toString());
        studentslist.getItems().add(All_Student.toString());
    }
    public void ChangPassWord(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherChangePassWordPanel.fxml");
    }

    public void ChangeName(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherChangeNamePanel.fxml");
    }
public void ShowStudentsList() throws IOException {
    new pageLoader().LoadScene("../Vieww/TeachersPanel/StudentsListPanel.fxml");

}
}
