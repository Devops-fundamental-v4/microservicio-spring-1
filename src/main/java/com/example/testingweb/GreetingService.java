package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	private String password = "123412";
	public String greet() {
		return "Finaliza el curso DevOps Foundation v4 - Cristóbal Acevedo (alumno)";
	}
}
