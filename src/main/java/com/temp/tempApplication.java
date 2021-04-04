package com.bcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value= {"classpath:application.properties"},encoding="UTF-8")
@SpringBootApplication
public class BackendControlPanelApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendControlPanelApplication.class, args);
	}

}
