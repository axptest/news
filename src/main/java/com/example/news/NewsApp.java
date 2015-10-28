package com.example.news;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.plugin.EnableSwagger;

/**
 * Main class for running the application.
 *
 */
@SpringBootApplication
@EnableSwagger
@Configuration
@ComponentScan("com.example.news")
@EnableAutoConfiguration
public class NewsApp 
{
	    public static void main(String[] args) throws Exception {
	          ApplicationContext ctx = SpringApplication.run(NewsApp.class, args); 
	        
	    }


}
