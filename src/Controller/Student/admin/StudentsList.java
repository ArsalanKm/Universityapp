package Controller.Student.admin;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

import static Model.Student.Student.LIST_VIEW;


public class StudentsList {
    @FXML
    ListView StudentsListListView;
    @FXML
    Button BackBtm;

    public void initialize() {
        StudentsListListView.getItems().addAll(LIST_VIEW);

    }

    public void Back() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/adminPanel.fxml");

    }
}

