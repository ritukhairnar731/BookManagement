package com.Books.BookManagement.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Books.BookManagement.entity.Books;

@Repository
public class BookDao {

	
	@Autowired
	SessionFactory factory;
	
	public String saveBook(Books book) {
	Session session = factory.openSession();		
		session.persist(book);
		session.beginTransaction().commit();	
	return "book save successfully";
		
		
}
}