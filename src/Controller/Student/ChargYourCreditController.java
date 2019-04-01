package Controller.Student;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Controller.Student.Controller.Loggedstudent;

public class ChargYourCreditController {
    @FXML
    Button backBtm,ChargeBtm;
    @FXML
    TextField
            CartNumbertextField,MoneyTextField;
    @FXML
    PasswordField PasswordTextField;
    @FXML
    public void Charge() throws IOException {
        if (CartNumbertextField.getText().isEmpty() || MoneyTextField.getText().isEmpty() ||PasswordTextField.getText().isEmpty()) {
            new Alert(Alert.AlertType.ERROR,"Please Complete All Fields").showAndWait();

        }
       else  if(CartNumbertextField.getLength()<=12||CartNumbertextField.getLength()>=16)
        {
            new Alert(Alert.AlertType.ERROR,"Your Cart Number Is not Valid").showAndWait();
        }

        int New_Credit=Integer.parseInt(MoneyTextField.getText());
        Loggedstudent.setCredit(New_Credit+Loggedstudent.credit);
        new Alert(Alert.AlertType.INFORMATION,"Your Credit Charge Successfully");
        new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");

    }
public void back() throws IOException {
    new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");

}
}
