package Controller.Student.Teachers;

import Model.pageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Controller.Student.Teachers.TeachersLoginController.LoggedTeacher;

public class TeacherChangePassWord {
    @FXML
    public TextField OldPassWordPassField, NewPassWordPassField;
    @FXML
    public Button ChangButun,BackButtun;
    @FXML
    public void ChangePassWord(ActionEvent actionEvent) throws IOException {
        if(LoggedTeacher.getPassword().equals(OldPassWordPassField.getText()))
        {

            LoggedTeacher.setPassword(NewPassWordPassField.getText());
            new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherPanel.fxml");

        }

        else
            new Alert(Alert.AlertType.ERROR, "wrongPassWord").showAndWait();


    }

    public void Back_Buttom(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherPanel.fxml");
    }

}
