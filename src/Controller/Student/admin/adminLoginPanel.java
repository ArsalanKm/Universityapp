package Controller.Student.admin;

import Model.admin.admin;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class adminLoginPanel {


    public static admin LoggedAdmin = new admin();
    @FXML
    TextField UserNameTextField;
    @FXML
    PasswordField PassWordTextField;
    @FXML
    Button LogInButtom, RegisterButtom, ExitBtm;

    public void Login(javafx.event.ActionEvent actionEvent) throws IOException {


        if (UserNameTextField.getText().equals(LoggedAdmin.getUsername()) && (PassWordTextField.getText().equals(LoggedAdmin.getPassword()))) {
            new pageLoader().LoadScene("../Vieww/admin/adminPanel.fxml");


        }
    }

    public void Register(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/adminRegistrationPanel.fxml");

    }

    public void Exit() throws IOException {
        new pageLoader().LoadScene("../Vieww/Entrance/EntrancePanel.fxml");

    }


}
