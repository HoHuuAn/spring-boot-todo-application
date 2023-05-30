package com.example.springboottodoapplication.models;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@Table(name = "todo_items")
@Entity
public class TodoItem implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String description;
	
	private Boolean isComplete;
	
	private Instant createdAt;
	
	private Instant updatedAt;
	
	@Override
	public String toString() {
		return String.format("TodoItem{id=%id, description='%s', isComplete='%s, createdAt='%s', updatedAt='%s'}",
				id, description, isComplete, createdAt, updatedAt);
	}
}
