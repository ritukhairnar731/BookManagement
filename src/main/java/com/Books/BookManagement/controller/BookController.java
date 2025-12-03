package com.Books.BookManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Books.BookManagement.entity.Books;
import com.Books.BookManagement.service.BookService;

@RestController
public class BookController {

	@Autowired
	   BookService service;

    
	@PostMapping("/save")   
	   public String saveBook(@RequestBody Books books) {
		
			 String msg = service.saveBook(books);
				return msg;
				
		}
}
