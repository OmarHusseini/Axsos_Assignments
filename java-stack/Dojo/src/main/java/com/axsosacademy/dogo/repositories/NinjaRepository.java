package com.axsosacademy.dogo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.axsosacademy.dogo.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List <Ninja> findAll();

}
