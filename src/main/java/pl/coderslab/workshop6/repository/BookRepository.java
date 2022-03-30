package pl.coderslab.workshop6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.workshop6.entity.Book;

import java.util.Optional;

public interface BookRepository  extends JpaRepository<Book, Long> {


}
