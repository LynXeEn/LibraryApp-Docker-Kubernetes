package mk.ukim.finki.books.repository;

import mk.ukim.finki.books.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
