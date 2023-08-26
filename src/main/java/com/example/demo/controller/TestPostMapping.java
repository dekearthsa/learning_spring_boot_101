package com.example.demo.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.struct.DetailStruct;
import com.example.demo.struct.StructWarpperAdding;

// import org.json.simple.JSONArray;
import org.json.simple.JSONObject;    

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestPostMapping {

    @SuppressWarnings("unchecked")
    @PostMapping("/adding")
    public JSONObject postMethodName(@RequestBody DetailStruct setData) {
        // datas.put("isErr",false);
        StructWarpperAdding addingWarpper = new StructWarpperAdding("from struct",false, setData.name, setData.age);

        ArrayList<Integer> intArray = new ArrayList();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);

        JSONObject obj=new JSONObject();   
        obj.put("isErr", false);
        obj.put("name", setData.name);
        obj.put("age", setData.age);
        obj.put("array", intArray);
        obj.put("fromStruct", addingWarpper);
        
        System.out.println(obj);
        return  obj;
    }
    
}
