package com.app.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "com.app" })
@EntityScan( basePackages = {"com.app.models"} )
@EnableJpaRepositories(basePackages = "com.app.repository")
@SpringBootApplication
public class SprinbootMavenStarterApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SprinbootMavenStarterApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SprinbootMavenStarterApplication.class);
	}
}
