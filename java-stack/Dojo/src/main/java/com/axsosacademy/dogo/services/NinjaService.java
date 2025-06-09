package com.axsosacademy.dogo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsosacademy.dogo.models.Ninja;
import com.axsosacademy.dogo.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	public NinjaRepository ninjarepo;
	
	public Ninja createninja(Ninja ninja) {
		return ninjarepo.save(ninja);
	}
	public Ninja findNinja(Long id) {
		return ninjarepo.findById(id).orElse(null);
	}
	
	public List<Ninja> findAllNinjas(){
		return ninjarepo.findAll()	;
	}

}
