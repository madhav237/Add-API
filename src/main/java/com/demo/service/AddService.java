package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {

    public Double add(Double num1, Double num2)
    {
        return num1+num2;
    }

}
