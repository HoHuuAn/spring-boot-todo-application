package com.example.springboottodoapplication.services;

import java.time.Instant;
import java.util.Objects;
import java.util.Optional;

import com.example.springboottodoapplication.models.TodoItem;
import com.example.springboottodoapplication.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoItemService {
	@Autowired
	private TodoItemRepository todoItemRepository;
	
	public Iterable<TodoItem> getAll(){
		return todoItemRepository.findAll();
	}
	
	public Optional<TodoItem> getById(Long id){
		return todoItemRepository.findById(id);	
	}
	
	public TodoItem save(TodoItem todoItem) {
		if (Objects.isNull(todoItem.getId())) {
			todoItem.setCreatedAt(Instant.now());
		}
		
		todoItem.setUpdatedAt(Instant.now());
		return todoItemRepository.save(todoItem);
	}
	
	public void delete(TodoItem todoitem) {
		todoItemRepository.delete(todoitem);
	}
	
}
