package com.example.spring.statemachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class StatemachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatemachineApplication.class, args);
	}

}
