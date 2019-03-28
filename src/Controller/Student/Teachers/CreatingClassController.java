package Controller.Student.Teachers;

import Model.Teacher.TeacherClass;
import Model.pageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Model.Teacher.TeacherClass.CLASS_LIST;


public class CreatingClassController {
    public TeacherClass Tclass = new TeacherClass(); // the class that we want to creat
    @FXML
    MenuItem Saturday, Sunday, Monday, Tuesday, Wedensday, FirstTime, SecondTime, ThirdTime, FourthTime, TwoVahed, ThreeVahed, FourVahed;
    @FXML
    TextField ClassNameField, ClassCapacityField;
    @FXML
    Button
            CreateBtm, BackBtm;

    public void SaturdayFunction() {
        Tclass.setDay("Saturday");

    }

    public void SundayFunction() {
        Tclass.setDay("Sunday");

    }

    public void MondayFunction() {
        Tclass.setDay("Monday");

    }

    public void TuesdayFunction() {
        Tclass.setDay("Tuesday");

    }

    public void WedensdayFunction() {
        Tclass.setDay("Wedensday");

    }

    public void FirstTimeFunction() {
        Tclass.setTime("8-10");

    }

    public void SecondTimeFunction() {
        Tclass.setTime("10-12");

    }

    public void ThirdTimeFunction() {
        Tclass.setTime("14-16");


    }

    public void FourthTimeFunction() {
        Tclass.setTime("16-18");

    }

    public void TwoVahedFunction() {
        Tclass.setUnit(2);

    }

    public void ThreeVahedFunction() {
        Tclass.setUnit(3);

    }

    public void FourVahedFunction() {
        Tclass.setUnit(4);
    }

    public void Create(ActionEvent actionEvent) throws IOException {
        Tclass.setName(ClassNameField.getText());
        int Capacity = Integer.parseInt(ClassCapacityField.getText());
        Tclass.setCapacity(Capacity);
        TeacherClass.ALL_CREAT_CLASS.add(Tclass);
        CLASS_LIST.add(Tclass.makeString());

        TeacherClass Tclass = new TeacherClass();
        Tclass.setTime("");
        Tclass.setDay("");
        new Alert(Alert.AlertType.INFORMATION, "You Create a new Class").showAndWait();

    }

    public void Back() throws IOException {
        new pageLoader().LoadScene("../Vieww/TeachersPanel/TeacherPanel.fxml");

    }
}

