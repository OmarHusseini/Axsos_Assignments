package com.example.bookclub.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bookclub.bookclub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
} 


