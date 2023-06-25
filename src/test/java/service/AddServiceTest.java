package com.demo.service;

import com.demo.model.Nums;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




@RunWith(SpringRunner.class)
@SpringBootTest
public class AddServiceTest extends TestCase {

    @Autowired
    private AddService addService;

    //test method
    @Test
    public void testAdd() {
        Nums nums = new Nums();
        nums.setNum1(5.0);
        nums.setNum2(10.0);

        Double expectedSum = 15.0;

        Double actualSum = addService.add(5.0, 10.0);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testAdd_Invalid() {
        Nums nums = new Nums();
        nums.setNum1(3.0);
        nums.setNum2(10.0);

        Double expectedSum = 20.0;

        Double actualSum = addService.add(3.0, 10.0);

        assertNotSame(expectedSum, actualSum);
    }


}