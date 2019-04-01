package Controller.Student;

import Model.Student.Student;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

import java.io.IOException;

import static Controller.Student.Controller.Loggedstudent;
import  Controller.Student.Controller;

public class StudentPanelController {
    @FXML
    MenuItem ChangePassWordTextField, ChangeNameTextField;
    @FXML
    TextArea StudentTextArea;
    @FXML
    Button ExitButtum;
    @FXML
    MenuItem
            ChooseClassItem, ClassInformation,ChargYourCredit;

    @FXML
    public void initialize() {
        StudentTextArea.setText(Loggedstudent.toString() + "\n" + Loggedstudent.ShowCredit());
    }

    public void ChangPassWord(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChangePassWordPanel.fxml");
    }

    public void ChangeName(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChangeNamePanel.fxml");
    }

    public void Go_ToEntrance(javafx.event.ActionEvent actionEvent) throws IOException {
        new pageLoader().LoadScene("../Vieww/Entrance/EntrancePanel.fxml");
    }

    public void GOToClasses() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChooseClass.fxml");

    }

    public void Go_TO_Class_Informations() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ClassInfornationPanel.fxml");

    }

    public void GOToChosseFood() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChooseFood.fxml");

    }

    public void GOToWeekFoodSchedule() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChoosenFood.fxml");
    }
    public void GoToChargYourCredit() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/ChargYourCredit.fxml");

    }
}
