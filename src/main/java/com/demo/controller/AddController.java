package com.demo.controller;

import com.demo.model.Nums;
import com.demo.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/add")
public class AddController {

    @Autowired
    AddService addService;

    @PostMapping("/addTwoNumbers")
    public ResponseEntity<Object> addTwoNumbers(@RequestBody Nums nums) {

        Double num3= addService.add(nums.getNum1(), nums.getNum2());

        Map<String, Double> data = new HashMap<>();
        data.put("num1", nums.getNum1());
        data.put("num2", nums.getNum2());
        data.put("ans",num3);

        return new ResponseEntity<Object>(data, HttpStatus.OK);


    }
}
