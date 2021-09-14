package com.sofkau.KataCrudBack.repository;

import com.sofkau.KataCrudBack.Entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
