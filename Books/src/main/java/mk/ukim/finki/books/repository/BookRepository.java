package mk.ukim.finki.books.repository;

import mk.ukim.finki.books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
