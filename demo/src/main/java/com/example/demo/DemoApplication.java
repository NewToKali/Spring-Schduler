package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(Test.class, args);

		}
	@Scheduled(cron = "* * * * * ?")
	void someJob(){
		System.out.println("hello world");
	}

}
//@Configuration
//@EnableScheduling
//@ConditionalOnProperty(name = "schdeuling.enabled", matchIfMissing = true)
//class SchedulingConfiguration{
//
//}


