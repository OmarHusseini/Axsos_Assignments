package com.example.bookclub.bookclub.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.bookclub.bookclub.models.Book;
import com.example.bookclub.bookclub.models.LoginUser;
import com.example.bookclub.bookclub.models.User;
import com.example.bookclub.bookclub.services.BookService;
import com.example.bookclub.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
    private final UserService userService;
    private final BookService bookService;
    public MainController(UserService userService, BookService bookService) {
        this.userService = userService;
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index";
    }

    @GetMapping("/books")
    public String books(HttpSession session, Model model) {
        if (session.getAttribute("loggedUser") != null) {
            List<Book> books = bookService.allBooks();
            model.addAttribute("books", books);
            return "books";
        } else {
            return "redirect:/";
        }
    }
    

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }


}
