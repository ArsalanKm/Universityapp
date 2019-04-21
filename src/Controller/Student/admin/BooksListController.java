package Controller.Student.admin;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

import static Model.Book.All_BOOK_LIST;

public class BooksListController {
    @FXML
    ListView<String> Bookslist;
    @FXML
    Button backBtm;
    public void initialize()
    {
        Bookslist.getItems().addAll(All_BOOK_LIST);
    }
    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/adminPanel.fxml");

    }
}
