package com.example.neo4j.node;

import org.neo4j.ogm.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node("Book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id
	private String isbn;

	@Property("name")
	private String title;

	private Integer year;

	@Relationship(type = "WRITTEN_BY", direction = Relationship.Direction.OUTGOING)
	private Author author;

}
