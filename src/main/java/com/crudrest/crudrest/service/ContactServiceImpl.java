package com.crudrest.crudrest.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.crudrest.crudrest.model.Contact;
import com.crudrest.crudrest.repository.ContactRepository;

public class ContactServiceImpl implements ContactService{

	private ContactRepository contactRepository;
	public ContactServiceImpl(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	@Override
	public List<Contact> findAllContacts() {
		return contactRepository.findAll();
	}

	public ResponseEntity<Contact> findById(long id) {
		return contactRepository.findById(id).map(
					record -> ResponseEntity.ok().body(record)).orElse(ResponseEntity.notFound().build());	
	}

	
	
}
