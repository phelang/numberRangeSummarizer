package com.test.numberRangeSummarizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@ComponentScan({
		"com.test.numberRangeSummarizer.summarizer", "com.test.numberRangeSummarizer.service",
		"com.test.numberRangeSummarizer.api"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
