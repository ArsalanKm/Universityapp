package Controller.Student.admin;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Controller.Student.admin.adminLoginPanel.LoggedAdmin;


public class adminRegistrationPanel {
@FXML
    TextField UserNameTextField,PassWordTextField;
@FXML
    Button registerButtom;
public void register() throws IOException {
    if(UserNameTextField.getText().isEmpty()||PassWordTextField.getText().isEmpty())
        new Alert(Alert.AlertType.ERROR,"Fill all the fields");
    else {
        LoggedAdmin.setUsername(UserNameTextField.getText());
        LoggedAdmin.setPassword(PassWordTextField.getText());
        LoggedAdmin.setHave_admin(true);
        new Alert(Alert.AlertType.INFORMATION, "You Successfully registered").showAndWait();
        new pageLoader().LoadScene("../Vieww/admin/adminLoginPanel.fxml");

    }
}
}
