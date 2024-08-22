package mk.ukim.finki.books.service.impl;

import mk.ukim.finki.books.model.Book;
import mk.ukim.finki.books.model.Library;
import mk.ukim.finki.books.repository.BookRepository;
import mk.ukim.finki.books.repository.LibraryRepository;
import mk.ukim.finki.books.service.LibraryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;
    private final BookRepository bookRepository;

    public LibraryServiceImpl(LibraryRepository libraryRepository, BookRepository bookRepository) {
        this.libraryRepository = libraryRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    @Override
    public Library getLibraryById(Long id) {
        return libraryRepository.findById(id).get();
    }

    @Override
    public Library saveLibrary(String name, boolean wirelessAccess, List<Long> bookIds) {
        List<Book> books = bookRepository.findAllById(bookIds);
        Library library = new Library(name, wirelessAccess, books);
        return libraryRepository.save(library);
    }

    @Override
    public void deleteLibrary(Long id) {
        libraryRepository.deleteById(id);
    }
}
