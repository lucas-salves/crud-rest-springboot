package com.crudrest.crudrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudrest.crudrest.model.Contact;
import com.crudrest.crudrest.repository.ContactRepository;

@Service
public interface ContactService {
	
	List<Contact> findAllContacts();
	
}
