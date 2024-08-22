package mk.ukim.finki.books.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean wirelessAccess = false;

    @OneToMany
    private List<Book> books;

    public Library(String name, boolean wirelessAccess, List<Book> books) {
        this.name = name;
        this.wirelessAccess = wirelessAccess;
        this.books = books;
    }

    public Library() {

    }
}
