package com.example.neo4j.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.neo4j.node.Book;
import com.example.neo4j.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository repository;

	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return repository.save(book);
	}

	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return (List<Book>) repository.findAll();
	}

	@GetMapping("/getBook/{name}")
	public Book getBook(@PathVariable String name) {
		return repository.findByName(name);
	}

	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable String id) {
		repository.deleteById(id);
		return "Book deleted with id : " + id;
	}

}
