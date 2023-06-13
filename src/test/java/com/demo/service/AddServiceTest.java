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

        Double actualSum = addService.add(nums.getNum1(), nums.getNum2());

        assertEquals(expectedSum, actualSum);
    }


}