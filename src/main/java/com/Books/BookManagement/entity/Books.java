package com.Books.BookManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

	@Id
	private Long id;
	private String name;
	private int price;
	
	
	
	
}
