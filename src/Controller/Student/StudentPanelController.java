package Controller.Student;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

import java.io.IOException;

public class StudentPanelController {
    @FXML
    MenuItem ChangePassWordTextField, ChangeNameTextField;


    public void ChangPassWord(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChangePassWordPanel.fxml");
    }

    public void ChangeName(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChangeNamePanel.fxml");
    }
}
