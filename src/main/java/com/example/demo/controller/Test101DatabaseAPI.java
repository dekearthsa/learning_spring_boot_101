package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dbRepository.RepoDevicebatteries;
import com.example.demo.model.Devicebatteries;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Test101DatabaseAPI {

    @Autowired
    private RepoDevicebatteries repoDevicebatteries;
    
    @GetMapping("/demofinddb")
    public ResponseEntity<?> getAllDeviceBattery(){
        List<Devicebatteries> deviceData = repoDevicebatteries.findAll();
        System.out.print("debug ==> "+ deviceData);
        if(deviceData.size() > 0){
            return new ResponseEntity<List<Devicebatteries>>(deviceData, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Not found data device", HttpStatus.NOT_FOUND);
        }   
    }
}
