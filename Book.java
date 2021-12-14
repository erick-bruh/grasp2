import java.util.jar.Attributes.Name;

public class Book {
    private String title;
    private int id = 0;
    boolean isBorrowed;
    private Reader borrower;
    Date dateExpected;
    
    // create new book constructor
    Book(String title) {
        this.title = title;
        id = ++Libsys.bookCount;
        borrower = null;
        isBorrowed = false;
        dateExpected = null;

    }

    String getName() {
        return title;
    }
    // borrow book
    void borrow(Reader borrower) {
        this.borrower = borrower;
        isBorrowed = true;
        dateExpected = new Date(Libsys.dateToday.getDay(), Libsys.dateToday.getMonth() + 1, Libsys.dateToday.getYear());
    }
    //return book
    void Return(){
        borrower = null;
        dateExpected = null;
        isBorrowed = false;
    }

    Date expected(){
        return dateExpected;
    }
}
