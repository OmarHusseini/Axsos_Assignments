package com.example.bookclub.bookclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.example.bookclub.bookclub.models.Book;
import com.example.bookclub.bookclub.services.BookService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/books/new")
    public String newbook(@ModelAttribute Book book, HttpSession session) {
        if (session.getAttribute("userId") == null) {
        return "booksNew";
    }else{
        return "redirect:/";
        }
    }
    @PostMapping("/books/new/addBook")
    public String addNewBook(@Valid @ModelAttribute("book") Book book,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "booksNew";
        }
        else {
            bookService.addBook(book);
            return "redirect:/books";
        }

    }

    @GetMapping("/books/{bookId}")
    public String showBook(
            @PathVariable Long bookId,
            Model model,
            HttpSession session
    ) {
        if (session.getAttribute("loggedUser") != null) {
            Book book = bookService.getBookById(bookId);
            model.addAttribute("book", book);
            return "booksShow";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/books/{id}/edit")
    public String editBookForm(@PathVariable Long id, Model model) {
    Book book = bookService.findById(id);
    model.addAttribute("book", book);
    return "editBook"; // Make sure you have a Thymeleaf or JSP view named editBookForm.html
    }

    @PostMapping("/books/{id}/edit")
    public String updateBook(@ModelAttribute("book") Book book) {
        bookService.update(book); // or save
        return "redirect:/books";
    }
    
        



    
    


}
