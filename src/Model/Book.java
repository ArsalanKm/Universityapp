package Model;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public static final List<Book> All_BOOK = new ArrayList<>();
    public static List<String> All_BOOK_LIST = new ArrayList<>();

    public boolean isChosen() {
        return Chosen;
    }

    public void setChosen(boolean chosen) {
        Chosen = chosen;
    }

    private String BookName;
    private String AuthorName;
    private boolean Chosen=false;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String MakeString() {
        return "BookName: " + this.getBookName() + "Book authorName: " + this.getAuthorName();
    }
}
