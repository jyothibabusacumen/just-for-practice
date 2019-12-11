package com.restapi.task2.load_testonrestapiconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadTestonrestapiconceptsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LoadTestonrestapiconceptsApplication.class, args);
    }
    @Autowired
    EmployeeService k;
    private static Logger logger = LoggerFactory.getLogger(LoadTestonrestapiconceptsApplication.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info("Starting Load test");
        logger.info("all details are"+k.getall());
        k.post(new
                Employee("chinna","chinna@gmail.com",43386773L));
        logger.info("after post employee details are"+k.getall());
        k.delete("chinna");
        logger.info("after delete operation employee details are"+k.getall());
    }
}

