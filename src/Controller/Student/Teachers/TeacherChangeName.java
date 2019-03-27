package Controller.Student.Teachers;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Controller.Student.Teachers.TeachersLoginController.LoggedTeacher;

public class TeacherChangeName {
    @FXML
    public TextField OldnameTextField, NewnameTextField;
    @FXML
    Button changeButtun,BackButtun;


    public void ChangeName() throws IOException {
        if (LoggedTeacher.getUsername().equals(OldnameTextField.getText())) {
            LoggedTeacher.setUsername(NewnameTextField.getText());
            new Alert(Alert.AlertType.INFORMATION, "Your name changed successfully").showAndWait();
            new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherPanel.fxml");

        } else new Alert(Alert.AlertType.ERROR, "Name Was Wrong");
    }
    public void Back_Buttom(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherPanel.fxml");
    }

}
