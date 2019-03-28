package Controller.Student;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;


import java.io.IOException;

import static Controller.Student.Controller.Loggedstudent;
import static Controller.Student.Teachers.TeachersLoginController.LoggedTeacher;
import static Model.Student.Student.classes;

public class StudentPanelController {
    @FXML
    MenuItem ChangePassWordTextField, ChangeNameTextField;
    @FXML
    TextArea StudentTextArea;
    @FXML
    Button ExitButtum;
@FXML MenuItem
        ChooseClassItem,ClassInformation;
@FXML
public void initialize() {
    StudentTextArea.setText(Loggedstudent.toString()+"\n"+Loggedstudent.getAuthors(classes));
}
    public void ChangPassWord(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChangePassWordPanel.fxml");
    }

    public void ChangeName(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChangeNamePanel.fxml");
    }
    public void Go_ToEntrance(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/Entrance/EntrancePanel.fxml");
    }
    public void GOToClasses() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChooseClass.fxml");

    }
    public void Go_TO_Class_Informations() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ClassInfornationPanel.fxml");

    }
}
