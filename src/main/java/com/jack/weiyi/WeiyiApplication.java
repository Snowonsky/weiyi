package com.jack.weiyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jack.weiyi.mapper")
public class WeiyiApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeiyiApplication.class, args);
	}

}
