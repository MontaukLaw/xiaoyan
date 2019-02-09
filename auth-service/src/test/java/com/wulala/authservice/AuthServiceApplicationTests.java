package com.wulala.authservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthServiceApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(1549597348-(new Date().getTime()/1000));
    }

}

