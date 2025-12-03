package com.Books.BookManagement.service;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Books.BookManagement.Dao.BookDao;
import com.Books.BookManagement.entity.Books;

@Service
public class BookService {

	@Autowired
	BookDao dao;
	
	     public String saveBook(Books book) {
	  Long id = System.currentTimeMillis();
	    	System.out.println(id);
	   book.setId(id);
		 String msg = dao.saveBook(book);
			return msg;
			
	}
}
