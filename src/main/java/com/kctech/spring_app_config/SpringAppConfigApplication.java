package com.kctech.spring_app_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringAppConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppConfigApplication.class, args);
	}

}
