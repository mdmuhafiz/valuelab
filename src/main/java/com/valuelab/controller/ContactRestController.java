package com.valuelab.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valuelab.entity.Contact;
import com.valuelab.repository.ContactRepository;

@RestController
public class ContactRestController {
	@Autowired
	private ContactRepository contactRepo;
	@RequestMapping("contact/{id}")
	public Contact getContact(@PathVariable("id") long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
