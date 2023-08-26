package com.example.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class TodoList {
    @Id
    private String userId;
    private String fullName;
    private Integer age;
    private String job;

    public void getUserId(String userId){
        this.userId = userId;

    }

    public void getFullName(String fullName){
        this.fullName = fullName;
    }

    public void getAge(Integer age){
        this.age = age;
    }

    public void getJob(String job){
        this.job = job;
    }
}
