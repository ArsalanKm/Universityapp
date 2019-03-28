package Controller.Student.admin;

import Model.pageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Controller.Student.admin.adminLoginPanel.LoggedAdmin;


public class adminChangPasswordController {
    @FXML
    public TextField OldPassWordPassField, NewPassWordPassField;
    @FXML
    public Button ChangButun, BackButtun;

    @FXML
    public void ChangePassWord(ActionEvent actionEvent) throws IOException {
        if (LoggedAdmin.getPassword().equals(OldPassWordPassField.getText())) {

            LoggedAdmin.setPassword(NewPassWordPassField.getText());
            new Alert(Alert.AlertType.INFORMATION, "Your Password chang successfully").showAndWait();

            new pageLoader().LoadScene("../Vieww/admin/adminPanel.fxml");

        } else
            new Alert(Alert.AlertType.ERROR, "wrongPassWord").showAndWait();


    }

    public void Back_Buttom(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/adminPanel.fxml");
    }

}
