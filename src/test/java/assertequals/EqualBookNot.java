package assertequals;

import model.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EqualBookNot {
    @Test
    void assertNotEqualsWithNoMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("1");

        assertNotEquals("3",actualBook.getBookId());
    }

    @Test
    void assertNotEqualsWithMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");
        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("1");
        assertNotEquals("2",actualBook.getBookId(),"Book matches to expected value");
    }

    @Test
    void assertNotEqualsWithMessageSupplier(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");
        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("1");
        assertNotEquals("3",actualBook.getBookId(),()->"Book matches to expected value");
    }
}
