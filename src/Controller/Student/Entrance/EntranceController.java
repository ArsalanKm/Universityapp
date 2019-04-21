package Controller.Student.Entrance;

import Model.pageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;


public class EntranceController {
    @FXML
    Button StudentLogin,teacherLogin,adminLogin;


    @FXML
    public void initialize() {
        StudentLogin.setText("Students");
    }

    public void To_Student_Login(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/sample.fxml");
    }

    public void To_Teacher_Login(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherLogIn.fxml");
    }
    public void To_admin_Login(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/adminLoginPanel.fxml");
    }

}
