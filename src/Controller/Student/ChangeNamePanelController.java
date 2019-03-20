package Controller.Student;

import Model.Student.Student;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Controller.Student.Controller.Loggedstudent;


public class ChangeNamePanelController {
    @FXML
    public TextField OldnameTextField, NewnameTextField;
    @FXML
    Button changeButtun,BackButtun;


    public void ChangeName() throws IOException {
        if (Loggedstudent.getUsername().equals(OldnameTextField.getText())) {
            Loggedstudent.setUsername(NewnameTextField.getText());
            new Alert(Alert.AlertType.INFORMATION, "Your name changed successfully").showAndWait();
            new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");

        } else new Alert(Alert.AlertType.ERROR, "Name Was Wrong");
    }
    public void Back_Buttom(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");
    }

}
