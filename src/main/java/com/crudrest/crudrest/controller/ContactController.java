package com.crudrest.crudrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudrest.crudrest.model.Contact;
import com.crudrest.crudrest.service.ContactService;
import com.crudrest.crudrest.service.ContactServiceImpl;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	
	@Autowired
	private ContactServiceImpl contactService;
	
	
	@GetMapping
	public List<Contact> findAll(Model model) {
		return contactService.findAllContacts();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Contact> findById(@PathVariable long id){
		return contactService.findById(id);
	}
}
