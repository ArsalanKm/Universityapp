package Controller.Student.admin;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

import java.io.IOException;

import static Controller.Student.admin.adminLoginPanel.LoggedAdmin;

public class adminPanelController {
    @FXML
    MenuItem TeachersListMenuItem,ClassesListMenuItem,StudentsListMenuItem,ChangPassWordMenuItem,ChangeNameMenuItem,LibraryItem;
@FXML
    Button
    ExitBtm;
@FXML
    TextArea TextArea;
public void initialize()
{
    TextArea.setText(LoggedAdmin.toString());
}
    public void Go_To_ClassesList() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/ClassesListPanel.fxml");


    }
    public void Go_TO_TeachersList() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/TeachersListPanel.fxml");

    }
    public void Go_To_Students_List() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/StudentsList.fxml");

    }
    public void Go_To_ChangNamePanel() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/ChangNamePanel.fxml");

    }
    public void Go_To_ChangePassPanel() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/ChangPasswordPanel.fxml");

    }
    public void Go_To_Create_Food() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/CreateWeeklyFoodSchedule.fxml");

    }
    public void Go_TO_Library() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/Creating_Library.fxml");
    }
    public void Go_TO_BooksList() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/LibraryBooksList.fxml");

    }


    public void Exit() throws IOException {
        new pageLoader().LoadScene("../Vieww/Entrance/EntrancePanel.fxml");

    }
}
