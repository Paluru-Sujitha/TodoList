package com.aits.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aits.todolist.Todo;
import com.aits.todolist.repo.TodoRepository;

@RestController
@RequestMapping("/todos")
public class TodoController {
@Autowired
TodoRepository todoRepository;

@PostMapping
public Todo insert(@RequestBody Todo todo) {
todoRepository.save(todo);
return todo;
}

@GetMapping
public List<Todo> getAllTodos(){

return todoRepository.findAll();

}




}
