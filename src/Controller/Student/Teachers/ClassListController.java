package Controller.Student.Teachers;

import Model.Teacher.TeacherClass;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

import static Model.Teacher.TeacherClass.CLASS_LIST;
import static Model.Teacher.Teacher.*;

public class ClassListController {
    private static int selectedIndex;

    @FXML
    ListView <String> ClassesList;
    @FXML
    Button BackBtm,deleteBtm;

    public void initialize() {
        ClassesList.getItems().addAll();
    }
    public void back () throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherPanel.fxml");

    }
    public void findIndex(MouseEvent mouseEvent) {

        ClassesList.setOnMouseClicked(event -> {
            selectedIndex = ClassesList.getSelectionModel().getSelectedIndex();
            System.out.println(selectedIndex);
        });
        System.out.println(selectedIndex);


    }
    public void deleteClass()
    {
        TeacherClass.ALL_CREAT_CLASS.remove(selectedIndex);
        CLASS_LIST.remove(selectedIndex);
        new Alert(Alert.AlertType.INFORMATION,"class deleted successfully");
        ClassesList.getItems().setAll(CLASS_LIST);


    }
}
