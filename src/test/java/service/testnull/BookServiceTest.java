package service.testnull;

import model.Book;
import org.junit.jupiter.api.Test;
import service.BookService;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {
    @Test
    public void assertNullWithNoMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");
        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("3");
        assertNull(actualBook);
    }

    @Test
    void assertNullWithMessage(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");
        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("4");
        assertNull(actualBook,"Book is not null");
    }

    @Test
    void assertNullWithMessageSupplier(){
        BookService bookService = new BookService();
        Book headFirstJavaBook = new Book("1","Head first Java","Wrox");
        Book headFirstDesignBook = new Book("2","Head first Design Pattern","O'Reilly");
        bookService.addBook(headFirstJavaBook);
        bookService.addBook(headFirstDesignBook);

        Book actualBook = bookService.getBookById("4");
        assertNull(actualBook,()->"Book is not null !=>");
    }
}