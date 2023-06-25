package com.demo.controller;

import com.demo.model.Nums;
import com.demo.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addTwoNumbers2")
    public ResponseEntity<Object> addTwoNumbers2(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {

        Double num3= addService.add(num1, num2);

        Map<String, Double> data = new HashMap<>();
        data.put("num1", num1);
        data.put("num2", num2);
        data.put("ans",num3);

        return new ResponseEntity<Object>(data, HttpStatus.OK);


    }
}

