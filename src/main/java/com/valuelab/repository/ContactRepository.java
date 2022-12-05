package com.valuelab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valuelab.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
