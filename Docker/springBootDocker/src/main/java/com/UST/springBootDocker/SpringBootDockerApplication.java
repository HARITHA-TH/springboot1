package com.UST.springBootDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {
	@GetMapping("/welcome")
	public String getMapping(){
		return "hy...welcome to UST";
	}
	public static void main(String[] args) {


		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
