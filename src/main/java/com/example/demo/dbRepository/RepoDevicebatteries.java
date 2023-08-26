package com.example.demo.dbRepository;


import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.stereotype.Repository;

import com.example.demo.model.Devicebatteries;

public interface RepoDevicebatteries extends MongoRepository<Devicebatteries, String> {}

