package com.crudrest.crudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudrest.crudrest.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
