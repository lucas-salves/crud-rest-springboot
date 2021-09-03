package com.crudrest.crudrest.service;

import java.util.List;

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

}
