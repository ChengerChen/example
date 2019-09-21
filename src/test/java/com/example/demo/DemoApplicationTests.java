package com.example.demo;

import com.example.demo.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        logger.info("This is info log。这是info日志打印");
        logger.warn("this is warn log1");
        logger.warn("this is warn log2");
        System.out.println(person);
    }

}
