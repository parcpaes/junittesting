package assertthrows;

import exception.BookNotFoundException;
import model.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookAssertThrow {
    @Test
    void assertThrowsWithNoMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        BookNotFoundException notFoundException = assertThrows(BookNotFoundException.class,()-> bookService.getBookByTitle("Head First Spring"));
        assertEquals("Book not found in Bookstore!",notFoundException.getMessage());
    }

    @Test
    void assertThrowsWithMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");

        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        assertThrows(NullPointerException.class,()-> bookService.getBookByTitle("Head First Spring"),()->"Different exception thrown!");
    }
}
