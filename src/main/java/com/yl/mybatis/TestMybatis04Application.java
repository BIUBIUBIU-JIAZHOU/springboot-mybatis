package com.yl.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.yl.mybatis.mapper")
@SpringBootApplication
public class TestMybatis04Application {

	public static void main(String[] args) {
		SpringApplication.run(TestMybatis04Application.class, args);
	}

}
