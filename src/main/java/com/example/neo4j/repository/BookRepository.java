package com.example.neo4j.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.example.neo4j.node.Book;

@Repository
public interface BookRepository extends Neo4jRepository<Book, String> {
	Book findOneByTitle(String title);

	List<Book> findAllByYear(Integer year);
	
	Book findByName(String name);
}
