package pl.coderslab.workshop6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.workshop6.entity.Book;
import pl.coderslab.workshop6.service.BookService;

import javax.validation.Valid;
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

    @GetMapping("book/add")
    public String addBookForm(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "/books/addForm";
    }

    @PostMapping("book/add")
    public String addBook(@Valid Book book, BindingResult result){
        if (result.hasErrors()){
            return "redirect:/book/add";
        } else {
            bookService.add(book);
            return "redirect:/";
        }
    }

    @GetMapping("book/{id}")
    public String showBook(Model model, @PathVariable Long id){
        Optional<Book> book = bookService.get(id);
        if (book.isPresent()){
            model.addAttribute("book", book.get());
            return "/books/book";
        } else {
            model.addAttribute("id", id);
            return "/books/empty";
        }
    }

    @GetMapping("book/delete/{id}")
    public String deleteBook(Model model, @PathVariable Long id){
        Optional<Book> book = bookService.get(id);
        if (book.isPresent()){
            bookService.delete(id);
            return "redirect:/";
        } else {
            model.addAttribute("id", id);
            return "/books/empty";
        }
    }

    @GetMapping("book/edit/{id}")
    public String editBookForm(Model model, @PathVariable Long id){
        Optional<Book> book = bookService.get(id);
        if (book.isPresent()){
            model.addAttribute("book", book.get());
            return "/books/editForm";
        } else {
            model.addAttribute("id", id);
            return "/books/empty";
        }
    }

    @PostMapping("book/edit")
    public String editBook(@Valid Book book, BindingResult result){
        if (result.hasErrors()){
            return "redirect:/book/edit/${book.id}";
        } else {
            bookService.update(book);
            return "redirect:/";
        }
    }
}
