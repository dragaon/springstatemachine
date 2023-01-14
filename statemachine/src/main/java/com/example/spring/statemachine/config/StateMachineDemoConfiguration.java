package com.example.spring.statemachine.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;

import lombok.extern.slf4j.Slf4j;

@Configuration 
@Slf4j
public class StateMachineDemoConfiguration {
	@Autowired
	private StateMachine<String, String> stateMachine;

	private void initializeStateMachine() {
		stateMachine.start();
	}
	
	private void sendEvent(String event) {
		stateMachine.sendEvent(event);
	}
	
	private void printState() {
		State<String, String> currentState = stateMachine.getState();
		
	}
}
