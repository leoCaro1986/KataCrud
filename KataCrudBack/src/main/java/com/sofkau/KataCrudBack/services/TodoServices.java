package com.sofkau.KataCrudBack.services;

import com.sofkau.KataCrudBack.Entity.Todo;
import com.sofkau.KataCrudBack.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServices {

    @Autowired
    private TodoRepository repository;

    public Iterable<Todo>list(){
        return repository.findAll();
    }
    public Todo save(Todo todo){
        return repository.save(todo);
    }
    public void delete(long id){
        repository.delete(get(id));
    }
    public Todo get(long id){
        return repository.findById(id).orElseThrow();
    }
}
