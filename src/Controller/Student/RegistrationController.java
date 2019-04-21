package Controller.Student;

import Model.Student.Student;
import Model.pageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

import static Controller.Student.Controller.Loggedstudent;
import static Model.Student.Student.LIST_VIEW;

public class RegistrationController {

    @FXML
    ListView<String> studentslist;
    @FXML
    TextField NameTextField;
    @FXML
    Button CreateAnAccount;
    @FXML
    PasswordField PassWord, RepeatedPassWord;
    private Student student = new Student();

    public void register(ActionEvent actionEvent) throws IOException {
        if (NameTextField.getText().isEmpty()  || PassWord.getText().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "You have to complete requirements").showAndWait();
        } else {
            student.setUsername(NameTextField.getText());
            student.setPassword(PassWord.getText());
            if (PassWord.getText().length() <= 8)
             new Alert(Alert.AlertType.ERROR, "Your Password must atleast have 8 charecters ").showAndWait();
else
            if (!PassWord.getText().equals(RepeatedPassWord.getText()))
                new Alert(Alert.AlertType.ERROR, "Your repeated password is not correct ").showAndWait();
            else {

                Student.All_Student.add(student);
                LIST_VIEW.add(student.toString());
                Student student = new Student();
                NameTextField.setText("");
                PassWord.setText("");
                RepeatedPassWord.setText("");

                new Alert(Alert.AlertType.INFORMATION, "You Successfully registered").showAndWait();
                new pageLoader().LoadScene("../Vieww/sample.fxml");
            }
        }

    }
}
