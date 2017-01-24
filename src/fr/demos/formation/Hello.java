package fr.demos.formation;

import org.springframework.stereotype.Component;

@Component("helloId")
public class Hello {

	private String message;
	
	public String sayHello() {
		return "Hello World !";
	}
	
	
}
