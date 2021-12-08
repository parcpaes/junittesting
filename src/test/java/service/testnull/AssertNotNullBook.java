package service.testnull;

import model.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertNotNullBook {
    @Test
    public void assertNotNullWithNoMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");
        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("2");
        assertNotNull(actualBook);
    }

    @Test
    void assertNotNullWithMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");
        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("1");
        assertNotNull(actualBook,"Book should not be null");
    }

    @Test
    void assertNotNullWithMessageSupplier(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");
        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("1");
        assertNotNull(actualBook,()->"Book should not be null !=>");
    }
}
