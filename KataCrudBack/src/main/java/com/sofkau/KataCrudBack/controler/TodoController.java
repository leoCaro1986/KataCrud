package com.sofkau.KataCrudBack.controler;

import com.sofkau.KataCrudBack.Entity.Todo;
import com.sofkau.KataCrudBack.services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    private TodoServices services;

    @GetMapping(value = "api/todos")
    public Iterable<Todo>list(){
        return services.list();
    }

    public Todo save(Todo todo){
        return services.save(todo);
    }
    public void delete(long id){
        services.delete(id);
    }
    @GetMapping(value = "api/{id}/todo")
    public Todo get(long id){
        return services.get(id);
    }
}
