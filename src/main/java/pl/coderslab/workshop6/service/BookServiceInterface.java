package pl.coderslab.workshop6.service;

import pl.coderslab.workshop6.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookServiceInterface {

    List<Book> getBooks();

    void add(Book book);

    Optional<Book> get(Long id);

    void delete(Long id);

    void update(Book book);
}
