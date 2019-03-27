package Controller.Student.Teachers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;


import static Model.Student.Student.All_Student;
import static Model.Teacher.Teacher.All_Teachers;

public class StudentsListController {
    @FXML
    ListView<String> StudentsList;
    public void initialize() {

        StudentsList.getItems().add(All_Student.toString());
    }
}
