package Controller.Student;

import Model.Student.Student;
import Model.Teacher.TeacherClass;
import Model.pageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Controller.Student.Controller.Loggedstudent;


public class StudentsChooseClassController {
    private static int selectedIndex;
    @FXML
    ListView<String> classeslist;
    @FXML
    Button BackBtm, JoinBtm;
    TeacherClass tempClass = new TeacherClass();
    private List<String> personalList = new ArrayList<>();
    @FXML
    private ListView<String> listView;

    public void initialize() {
        classeslist.getItems().addAll(TeacherClass.CLASS_LIST);
    }

    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");

    }


    public void findIndex(MouseEvent mouseEvent) {

        classeslist.setOnMouseClicked(event -> {
            selectedIndex = classeslist.getSelectionModel().getSelectedIndex();
            System.out.println(selectedIndex);
        });
        System.out.println(selectedIndex);


    }


    public void join(ActionEvent actionEvent) {
        boolean hasBeenInTheList = false;

        TeacherClass tempJoinClass = new TeacherClass();
        tempJoinClass = TeacherClass.ALL_CREAT_CLASS.get(selectedIndex);


        for (int i = 0; i < Loggedstudent.classes.size(); i++)
            if (tempJoinClass.makeString().equalsIgnoreCase(Loggedstudent.classes.get(i))) {
                hasBeenInTheList = true;
                break;
            }

        if (hasBeenInTheList == true) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "You have already joined this class .1.. ");
            alert.showAndWait();
        } else {

            if (tempJoinClass.getCapacity() > 0) {

                Loggedstudent.classes.add(TeacherClass.CLASS_LIST.get(selectedIndex));
                tempJoinClass.capacity--;
                classeslist.getItems().setAll(TeacherClass.CLASS_LIST);


            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "The class capacity is fulL");
                alert.showAndWait();
            }
        }
        System.out.println(tempJoinClass.getCapacity());

    }
}


