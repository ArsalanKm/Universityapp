package Controller.Student.Teachers;

import Model.Teacher.TeacherClass;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;


import java.io.IOException;

import static Controller.Student.Teachers.TeachersLoginController.LoggedTeacher;
import static Model.Student.Student.All_Student;
import static Model.Student.Student.LIST_VIEW;
import static Model.Teacher.Teacher.All_Teachers;

public class StudentsListController {
    private int selectedIndex;
    @FXML
    ListView<String> StudentsList;
    @FXML
    Button Back_Btm,Exit_Btm;
    public void initialize() {

        StudentsList.getItems().addAll(LIST_VIEW);

    }
    public void Exit() throws IOException {
        new pageLoader().LoadScene("../Vieww/Entrance/EntrancePanel.fxml");

    }
    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherPanel.fxml");

    }
    public void findIndex(){
        ;
        StudentsList.setOnMouseClicked(event -> {
            selectedIndex = StudentsList.getSelectionModel().getSelectedIndex();
            System.out.println(selectedIndex);
        });
        System.out.println(selectedIndex);

    }
    public void SetGrade()
    {

    }
}
