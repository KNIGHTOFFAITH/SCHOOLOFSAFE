package com.sg.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Record8011
 *
 * @author Hao
 * @since 2023/12/29 15:24
 */
@SpringBootApplication
@MapperScan("com.sg.cloud.mapper")
public class Record8011 {
    public static void main(String[] args) {
        System.out.println("hello");
        SpringApplication.run(Record8011.class, args);
    }
}
