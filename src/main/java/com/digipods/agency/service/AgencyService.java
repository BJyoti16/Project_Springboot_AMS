package com.digipods.agency.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digipods.agency.domain.Agency;
import com.digipods.agency.repository.AgencyRepository;


@Service
public class AgencyService {
	@Autowired
	private AgencyRepository repo;
	
	public List<Agency>  listAll() {
		return repo.findAll();
	}
	
	public void save(Agency agency) {
		repo.save(agency);
	}
	
	public Agency get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
	
	
}
