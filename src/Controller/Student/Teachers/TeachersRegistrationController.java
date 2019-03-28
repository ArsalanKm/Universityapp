package Controller.Student.Teachers;

import Model.Teacher.Teacher;
import Model.pageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Model.Teacher.Teacher.TEACHERS_LIST;


public class TeachersRegistrationController {
    @FXML
    TextField UserNameTextField;
    @FXML
    PasswordField PassWordTextField;
    @FXML
    Button registerButtom;
    Teacher teacher = new Teacher();

    public void register(ActionEvent actionEvent) throws IOException {
        if (UserNameTextField.getText().isEmpty() || PassWordTextField.getText().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "You have to complete requirements").showAndWait();
        } else {
            teacher.setUsername(UserNameTextField.getText());
            teacher.setPassword(PassWordTextField.getText());

            if (PassWordTextField.getText().length() <= 8)

                new Alert(Alert.AlertType.ERROR, "Your Password must atleast have 8 charecters ").showAndWait();
            else {
                Teacher.All_Teachers.add(teacher);
                TEACHERS_LIST.add(teacher.toString());
                Teacher teacher = new Teacher();
                UserNameTextField.setText("");
                PassWordTextField.setText("");


                new Alert(Alert.AlertType.INFORMATION, "You Successfully registered").showAndWait();
                new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherLogIn.fxml");
            }

        }
    }
}
