package com.platform.todolist.controller;

import com.platform.todolist.model.TodoItem;
import com.platform.todolist.repository.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoItemController {
    private final TodoItemRepository repository;

    @GetMapping
    public List<TodoItem> getAllTodos(){
        return repository.findAll();
    }

    @PostMapping
    public TodoItem createTodo(@RequestBody TodoItem todoItem) {
        return repository.save(todoItem);
    }


    @PutMapping("/{id}")
    public TodoItem updateTodo(@PathVariable Long id, @RequestBody TodoItem todoItem) {
        todoItem.setId(id);
        return repository.save(todoItem);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
