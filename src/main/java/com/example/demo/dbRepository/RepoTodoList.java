package com.example.demo.dbRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TodoList;

@Repository
public class RepoTodoList {
    public interface UserRepository extends MongoRepository<TodoList, String> {
    }
}
