package com.example.news;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.news.endpoints.NewsController;

/**
 * Main class for running the application.
 *
 */
@SpringBootApplication
public class NewsApp 
{
	    public static void main(String[] args) throws Exception {
	          ApplicationContext ctx = SpringApplication.run(NewsApp.class, args);

	            System.out.println("Let's inspect the beans provided by Spring Boot:");

	            String[] beanNames = ctx.getBeanDefinitionNames();
	            Arrays.sort(beanNames);
	            for (String beanName : beanNames) {
	                System.out.println(beanName);
	            }
	        
	    }


}
