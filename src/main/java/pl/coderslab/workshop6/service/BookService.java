package pl.coderslab.workshop6.service;

import org.springframework.stereotype.Service;
import pl.coderslab.workshop6.entity.Book;
import pl.coderslab.workshop6.repository.BookRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookService implements BookServiceInterface{

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void add(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Optional<Book> get(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteBookById(id);
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }
}
