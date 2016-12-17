package com.mongodb.spring_mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DocumentFile")
public class DocumentFile {

	@Id
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	@DBRef
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
