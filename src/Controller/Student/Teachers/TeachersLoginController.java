package Controller.Student.Teachers;

import Model.Teacher.Teacher;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Model.Teacher.Teacher.All_Teachers;


public class TeachersLoginController {
    public static Teacher LoggedTeacher = new Teacher();

    @FXML
    TextField UserNameTextField;
    @FXML
    PasswordField PassWordTextField;
    @FXML
    Button LogInButtom, RegisterButtom,ExitBtm;

    public void Login(javafx.event.ActionEvent actionEvent) throws IOException {


        for (int i = 0; i < All_Teachers.size(); i++) {

            LoggedTeacher = All_Teachers.get(i);
            if (UserNameTextField.getText().equals(LoggedTeacher.getUsername()) && (PassWordTextField.getText().equals(LoggedTeacher.getPassword()))) {
                new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherPanel.fxml");
                break;
            }


        }
    }

    public void Register(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/TeachersRegistrationPanel.fxml");

    }
    public void Exit() throws IOException {
        new pageLoader().LoadScene("../Vieww/Entrance/EntrancePanel.fxml");

    }
}
