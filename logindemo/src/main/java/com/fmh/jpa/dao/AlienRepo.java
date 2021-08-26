package com.fmh.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.fmh.jpa.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{

	
}
