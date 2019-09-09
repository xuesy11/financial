package com.bawei.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @program: financial
 * @description:
 * @author: Mr.xue
 * @create: 2019-09-07 15:29
 **/
@SpringBootApplication
@EntityScan(basePackages = {"com.bawei.entity"})
public class ManagerApp {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApp.class);
    }
}