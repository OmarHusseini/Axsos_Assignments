package com.axsosacademy.dogo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsosacademy.dogo.models.Dojo;
import com.axsosacademy.dogo.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojorepo;
	
	public Dojo createDojo(Dojo dojo) {
		return dojorepo.save(dojo);	
	}
	
	public Dojo findDojo(Long id) {
		return dojorepo.findById(id).orElse(null);
	}
	
	public List<Dojo> findAllDojos(){
		return dojorepo.findAll();
		}
	

}
