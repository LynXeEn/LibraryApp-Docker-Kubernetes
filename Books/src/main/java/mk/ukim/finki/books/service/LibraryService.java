package mk.ukim.finki.books.service;

import mk.ukim.finki.books.model.Book;
import mk.ukim.finki.books.model.Library;

import java.util.List;

public interface LibraryService {
    List<Library> getAllLibraries();
    Library getLibraryById(Long id);
    Library saveLibrary(String name, boolean wirelessAccess, List<Long> bookIds);
    void deleteLibrary(Long id);
}
