package com.crudrest.crudrest.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.crudrest.crudrest.model.Contact;
import com.crudrest.crudrest.repository.ContactRepository;

@Service
public interface ContactService {
	
	List<Contact> findAllContacts();
	ResponseEntity<Contact> findById(long id);
	Contact create(Contact contact);
}
