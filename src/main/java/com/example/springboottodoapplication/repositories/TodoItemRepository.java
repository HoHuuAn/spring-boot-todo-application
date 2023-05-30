package com.example.springboottodoapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboottodoapplication.models.TodoItem;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long>{
	
}
