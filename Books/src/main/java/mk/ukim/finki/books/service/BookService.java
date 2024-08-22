package mk.ukim.finki.books.service;

import mk.ukim.finki.books.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book saveBook(String title, String isbn, int publishedYear, Long authorId);
    void deleteBook(Long id);
}