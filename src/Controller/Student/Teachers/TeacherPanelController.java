package Controller.Student.Teachers;

import Model.Teacher.TeacherClass;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

import java.io.IOException;

import static Controller.Student.Teachers.TeachersLoginController.LoggedTeacher;
import static Model.Student.Student.LIST_VIEW;
import static Model.Teacher.Teacher.All_Teachers;


public class TeacherPanelController {
    @FXML
    MenuItem ChangePassWordTextField, ChangeNameTextField;
    @FXML
    TextArea StudentTextArea;

    @FXML
    MenuItem ShowStudentsList, CreateClass,ClassesList;
    @FXML
    ListView<String>
            studentslist;
    @FXML
    Button Exit;

    public void initialize() {
        StudentTextArea.setText(LoggedTeacher.toString());
        studentslist.getItems().addAll(LIST_VIEW);
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

    public void GoToCreate() throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/CreatingClassPanel.fxml");

    }
    public void ClassesList() throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/ClassesList.fxml");



    }
    public void Exit(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/Entrance/EntrancePanel.fxml");
    }
}
