package com.adm.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ApiPainelAdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPainelAdmApplication.class, args);
	}

}
