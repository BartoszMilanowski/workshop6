package pl.coderslab.workshop6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.workshop6.entity.Book;
import pl.coderslab.workshop6.service.BookService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public String showBooks(Model model){
        List <Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "/books/all";
    }

    @GetMapping("book/{id}")
    public String showBook(Model model, @PathVariable Long id){
        Optional<Book> book = bookService.findById(id);
        if (book.isPresent()) {

            model.addAttribute("book", book);
            return "/books/book";
        } else {
            return "books/nobook";
        }
    }

}
