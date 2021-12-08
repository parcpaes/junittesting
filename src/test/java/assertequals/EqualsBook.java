package assertequals;

import model.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EqualsBook {
    @Test
    void assertEqualsWithNoMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("1");

        assertEquals("1",actualBook.getBookId());
        assertEquals("Head first Java",actualBook.getTitle());
    }

    @Test
    void assertEqualsWithMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");
        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("1");
        assertEquals("1",actualBook.getBookId());
        assertEquals("Head first",actualBook.getTitle(),"Book title didn't match");
    }

    @Test
    void assertEqualsWithMessageSupplier(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");
        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("1");
        assertEquals("1",actualBook.getBookId());
        assertEquals("Head first Java",actualBook.getTitle(),()-> "Book title didn't match");
    }
}
