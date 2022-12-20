package com.yc.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.base.dao")
public class SssmBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SssmBaseApplication.class, args);
	}

}
