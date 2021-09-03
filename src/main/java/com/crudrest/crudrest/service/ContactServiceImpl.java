package com.crudrest.crudrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.crudrest.crudrest.model.Contact;
import com.crudrest.crudrest.repository.ContactRepository;

@Service
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

	@Override
	public Contact create(Contact contact) {
		return contactRepository.save(contact);		
	}

	@Override
	public Contact update(long id, Contact contact) {
//		return contactRepository.findById(id).map(record -> {
//					record.setEmail(contact.getEmail());
//					record.setName(contact.getName());
//					record.setPhone(contact.getPhone());
//					Contact updatedContact = contactRepository.save(record);
//					return updatedContact;
//				}).orElse(ResponseEntity.notFound().build());
			Optional<Contact> optionalContactToUpdate = contactRepository.findById(id);
			Contact contactToUpdate = optionalContactToUpdate.get();
			
			contactToUpdate.setEmail(contact.getEmail());
			contactToUpdate.setName(contact.getName());
			contactToUpdate.setPhone(contact.getPhone());
			
			return contactRepository.save(contactToUpdate);
				
				
				
	}

	
	
}
