package com.example.bookclub.bookclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bookclub.bookclub.models.LoginUser;
import com.example.bookclub.bookclub.models.User;
import com.example.bookclub.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class RegisterLoginController {
        private final UserService userService;
    public RegisterLoginController(UserService userService) {
        this.userService = userService;
    }


    // Register Controller
    @PostMapping("/register")
    public String registerUser(
            @Valid @ModelAttribute("newUser") User newUser,
            BindingResult bindingResult,
            Model model,
            HttpSession session
    ) {
        User loggedUser = userService.register(newUser, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index";
        }
        else {
            session.setAttribute("loggedUser", loggedUser);
            return "redirect:/books";
        }

    }

    // Login Controller
    @PostMapping("/login")
    public String login(
            @Valid @ModelAttribute("newLogin") LoginUser newLogin,
            BindingResult bindingResult,
            HttpSession session,
            Model model
    ) {
        User loggedUser = userService.login(newLogin, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index";
        }
        else {
            session.setAttribute("loggedUser", loggedUser);
            return "redirect:/books";
        }
    }

}
