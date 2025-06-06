package com.axsosacademy.savetarvel.repositories;

import java.util.List;

import com.axsosacademy.savetarvel.models.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{
    // this method retrieves all the books from the database
    List<Expense> findAll();
}
