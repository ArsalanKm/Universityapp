package Controller.Student;

import Model.Book;
import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

import static Controller.Student.Controller.Loggedstudent;

public class ListofBooksController {
    private static int selectedIndex;
    int x = 0;
    @FXML
    Button backBtm, addBtm;
    @FXML
    ListView<String> BooksList;

    public void initialize() {
        BooksList.getItems().addAll(Book.All_BOOK_LIST);
    }

    public void findIndex(MouseEvent mouseEvent) {

        BooksList.setOnMouseClicked(event -> {
            selectedIndex = BooksList.getSelectionModel().getSelectedIndex();
            System.out.println(selectedIndex);
        });
        System.out.println(selectedIndex);


    }


    public void addBook() throws IOException {


        boolean hasBeenInTheList = false;

        Book tempBook ;
        tempBook = Book.All_BOOK.get(selectedIndex);

        for (int i = 0; i < Loggedstudent.ReservedBooks.size(); i++)
            if (tempBook.MakeString() .equals( Loggedstudent.ReservedBooks.get(i))) {
                hasBeenInTheList = true;
                break;
            }

        if (hasBeenInTheList == true) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "This book is already reserved ");
            alert.showAndWait();
        } else {


                Loggedstudent.ReservedBooks.add(Book.All_BOOK_LIST.get(selectedIndex));
                BooksList.getItems().setAll(Book.All_BOOK_LIST);
                new Alert(Alert.AlertType.INFORMATION, "book reserved").showAndWait();

                new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");


            }


    }


    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");

    }
}
