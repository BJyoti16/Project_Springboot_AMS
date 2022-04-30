package com.digipods.agency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.digipods.agency.domain.Agency;
import com.digipods.agency.service.AgencyService;




@RestController
public class AgencyController {
	@Autowired 
	
	private AgencyService service;
	
	@GetMapping("/agency")                               
	public List<Agency> viewData(){
		return service.listAll();	
	}
	@GetMapping("/agency/{id}") 
	public Agency getAgency(@PathVariable int id)             
	{                                                     
		return service.get(id);	                          
	}
	
	@PutMapping(value="/agency/{id}")
	public ResponseEntity<?> editAgencyDetailsPage(@RequestBody Agency newtask , @PathVariable int id) {
		try {
			Agency existingtask= service.get(id);
			existingtask.setAgencyname(newtask.getAgencyname());
			existingtask.setAgencytype(newtask.getAgencytype());
			existingtask.setAgencyaddress(newtask.getAgencyaddress());
			existingtask.setAgencydesc(newtask.getAgencydesc());
		    existingtask.setModifieddate(java.time.LocalDateTime.now());
            service.save(existingtask);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception exp) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/agency")
	public void add(@RequestBody Agency agency) {
		agency.setCreateddate(java.time.LocalDateTime.now());
		agency.setModifieddate(java.time.LocalDateTime.now());
		service.save(agency);
	}
	
	
	/*
	 * @DeleteMapping("/agency/{id}") public void delete(@PathVariable int id) {
	 * service.delete(id); }
	 */
	
	@DeleteMapping("/agency/{id}")
	public ResponseEntity<?> delete(@PathVariable int id)
	{
		try {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception exp) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
