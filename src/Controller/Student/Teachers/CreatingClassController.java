package Controller.Student.Teachers;

import Model.Teacher.TeacherClass;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import static Model.Teacher.TeacherClass.ALL_CREAT_CLASS;


public class CreatingClassController {
    public TeacherClass Tclass = new TeacherClass(); // the class that we want to creat
    @FXML
    MenuItem Saturday, Sunday, Monday, Tuesday, Wedensday, FirstTime, SecondTime, ThirdTime, FourthTime, TwoVahed, ThreeVahed, FourVahed;
@FXML
    TextField ClassNameField,ClassCapacityField;
@FXML
    Button
    CreateBtm;

    public Void Create() {
       Tclass.setName(ClassNameField.getText());
       Tclass.setCapacity(ClassCapacityField.getLength());
        if (Saturday.isDisable())
            Tclass.setDay("Saturday");
        else if (Sunday.isDisable())
            Tclass.setDay("Sunday");
        else if (Monday.isDisable())
            Tclass.setDay("Monday");
        else if (Tuesday.isDisable())
            Tclass.setDay("Tuesday");
        else if (Wedensday.isDisable())
            Tclass.setDay("Wedensday");
        if (FirstTime.isDisable())
            Tclass.setTime("8-10");
        else if (SecondTime.isDisable())
            Tclass.setTime("10-12");
        else if (ThirdTime.isDisable())
            Tclass.setTime("14-16");
        else if (FourthTime.isDisable())
            Tclass.setTime("16-18");

        if (TwoVahed.isDisable())
            Tclass.setUnit(2);
        else if (ThreeVahed.isDisable())
            Tclass.setUnit(3);
        else if (FourVahed.isDisable())
            Tclass.setUnit(4);
        TeacherClass.ALL_CREAT_CLASS .add(Tclass);
        TeacherClass Tclass=new TeacherClass();



    }

}
