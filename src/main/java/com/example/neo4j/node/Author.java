package com.example.neo4j.node;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Node("Author")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
	@Id
	private Long id;

	private String name;

	@Relationship(type = "WRITTEN_BY", direction = Relationship.Direction.INCOMING)
	private List<Book> books;

}
