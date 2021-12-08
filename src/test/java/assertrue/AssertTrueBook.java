package assertrue;

import model.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueBook {

    @Test
    void assertTrueWithNOMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        bookService.addBook(headFirstJavaBook);
        List<Book> books = bookService.books();

        assertTrue(books.isEmpty());
    }

    @Test
    void assertTrueWithMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        bookService.addBook(headFirstJavaBook);
        List<Book> books = bookService.books();
        assertTrue(books.isEmpty(),"List of Books is not empty");
    }

    @Test
    void assertTrueWithMessageSupplier(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        bookService.addBook(headFirstJavaBook);
        List<Book> books = bookService.books();
        assertTrue(books.isEmpty(),()->"List of Books is not empty");
    }

    @Test
    void assertTrueWithBooleanSupplierAndMessageSupplier(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        List<Book> books = bookService.books();
        assertTrue(()->books.isEmpty(),()->"List of Books is not empty");
    }
}
