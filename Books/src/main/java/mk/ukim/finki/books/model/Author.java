package mk.ukim.finki.books.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String biography;
    private String email;


    public Author() {
    }

    public Author(String name, String biography, String email) {
        this.name = name;
        this.biography = biography;
        this.email = email;
    }
}