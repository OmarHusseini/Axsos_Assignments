package com.example.bookclub.bookclub.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookclub.bookclub.models.Book;
import com.example.bookclub.bookclub.repositories.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    public Book addBook(Book b) {
        return bookRepository.save(b);
    }
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    public void update(Book book) {
        bookRepository.save(book);
    }
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }


}
