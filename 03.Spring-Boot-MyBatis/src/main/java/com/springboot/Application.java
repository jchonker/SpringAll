package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 进入druid连接池的web页面地址: http://localhost:8080/web/druid/datasource.html
 * (其中web是配置了server.context-path属性)
 */
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
}
