package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Devicebatteries{
    @Id
    private String id;
    
    private String System; 
    
    private String Subsystem;
    
    private String DeviceId;
    
    private String DeviceType;
    
    private Integer Battery;
    
    public String getId(){
        return id;
    }

    public String getSystem(){
        return System;
    }

    public String getSubsystem(){
        return Subsystem;
    }

    public String getDeviceId(){
        return DeviceId;
    }
    public String getDeviceType(){
        return DeviceType;
    }
    public Integer getBattery(){
        return Battery;
    }


}