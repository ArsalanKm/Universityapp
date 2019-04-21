package Controller.Student.admin;

import Model.Book;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Model.Book.All_BOOK;
import static Model.Book.All_BOOK_LIST;

public class Library {
    public Book Tbook = new Book();
    @FXML
    Button CreateBtm, backBtm;
    @FXML
    TextField
            BooknameTextField, BookAuthorTextField;

    public void create() throws IOException {
        Tbook.setBookName(BooknameTextField.getText());
        Tbook.setAuthorName(BookAuthorTextField.getText());
        All_BOOK.add(Tbook);
        All_BOOK_LIST.add(Tbook.MakeString());
        new Alert(Alert.AlertType.INFORMATION,"Book added to the library").showAndWait();
        new pageLoader().LoadScene("../Vieww/admin/adminPanel.fxml");

    }

    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/adminPanel.fxml");

    }
}
