package com.ntl.topjobs.employeesignuplogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients("com.ntl.topjobs.employeesignuplogin")
//@EnableDiscoveryClient
public class EmployeeSignupLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSignupLoginApplication.class, args);
		
	}
	
}
