package com.sofkau.KataCrudBack.controler;

import com.sofkau.KataCrudBack.Entity.Todo;
import com.sofkau.KataCrudBack.services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    @Autowired
    private TodoServices services;

    @GetMapping(value = "api/todos")
    public Iterable<Todo>list(){
        return services.list();
    }

    @PostMapping(value = "api/todo")
    public Todo save(@RequestBody Todo todo){
        return services.save(todo);
    }

    @PutMapping(value = "api/todo")
    public Todo update(@RequestBody Todo todo){
        if (todo.getId()!=null) {
            return services.save(todo);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "api/{id}todo")
    public void delete(@PathVariable("id") long id){
        services.delete(id);
    }
    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable("id") long id){
        return services.get(id);
    }
}
