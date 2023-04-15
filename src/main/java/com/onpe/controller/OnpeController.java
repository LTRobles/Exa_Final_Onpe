package com.onpe.controller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
@CrossOrigin
@Controller
public class OnpeController extends WebMvcAutoConfiguration{
public void addCorsMappings (CorsRegistry registry) {
	registry.addMapping("/**");
}
	
@GetMapping ("/actas")

public String index() {
	
	return "actas";
}

}



