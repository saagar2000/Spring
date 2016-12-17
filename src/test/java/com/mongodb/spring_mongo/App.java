package com.mongodb.spring_mongo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringAppRepoConfig.class)
public class App {

	@Autowired
	IDocumentFileRepository documentFileRepository;

	@Autowired
	IUserRepository userRepository;

	@Test
	public void getDocumentFileUser() {
		DocumentFile docFileUser = documentFileRepository.findOne("doc_user");
		Assert.assertNotNull(docFileUser.getUser());
	}

	@Test
	public void getDocumentFileContact() {
		DocumentFile docFileContact = documentFileRepository.findOne("doc_contact");
		Assert.assertNotNull(docFileContact.getUser());
	}

	@Test
	public void saveDocWithContactRef() {

		final DocumentFile docWithContactRef = new DocumentFile();
		Contact contact = new Contact();
		docWithContactRef.setId("doc_contact");
		contact.setId("contact");
		docWithContactRef.setUser(contact);
		documentFileRepository.save(docWithContactRef);

	}

	@Test
	public void saveDocWithUserRef() {

		final DocumentFile docWithUserRef = new DocumentFile();
		User user = new User();
		docWithUserRef.setId("doc_user");
		user.setId("user");
		docWithUserRef.setUser(user);
		documentFileRepository.save(docWithUserRef);

	}

	@Test
	public void saveUser() {

		User user = new User();
		user.setId("user");
		user.setName("userName");
		userRepository.save(user);

	}

	@Test
	public void saveContact() {

		Contact contact = new Contact();
		contact.setId("contact");
		contact.setAddress("test street");
		contact.setName("contactName");
		userRepository.save(contact);

	}

}
