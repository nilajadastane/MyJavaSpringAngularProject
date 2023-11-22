package com.fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication

public class FullstackApplication implements WebMvcConfigurer {
	/*
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**") .allowedOrigins("http://localhost:4200") //
	 * Replace with the allowed origin(s) .allowedMethods("GET", "POST", "PUT",
	 * "DELETE", "OPTIONS") // Replace with the allowed HTTP methods
	 * .allowedHeaders("Content-Type") // Replace with the allowed headers
	 * .allowCredentials(true); // If your requests include cookies, set this to
	 * true }
	 */


	public static void main(String[] args) {

		SpringApplication.run(FullstackApplication.class, args);
	}

}
