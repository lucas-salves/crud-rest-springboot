package com.crudrest.crudrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
	
	
	
	public List<Contact> findAll(Model model) {
		return contactService.findAllContacts();
	}
	
}
