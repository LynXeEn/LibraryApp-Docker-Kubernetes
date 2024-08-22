package mk.ukim.finki.books.repository;

import mk.ukim.finki.books.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
