package com.valuelab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.valuelab.entity.Contact;
import com.valuelab.repository.ContactRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ContactRepositoryTest {
	@Autowired
	private ContactRepository contactRepo;
	@Test
	public void saveOneData() {
		Contact c = new Contact("our services","tom","jerry","tom@gmail.com","value lab","email","india","i want to know your services");
		contactRepo.save(c);
	}

}
