package com.nit.springboot_jenkinstomcat_war_file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringbootJenkinstomcatWarFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinstomcatWarFileApplication.class, args);
	}
	
	@RequestMapping("/test")
	
	public String test() {
		
		return "This is the testing of the jenkins ";
	}
       
	@RequestMapping("/jenkins")
	
	public String jenkins() {
		
		return "<body bgcolor=red>This is the jenkins automation test</body>";
	}
}
