package fr.demos.formation;

import org.springframework.stereotype.Component;

@Component("helloId")
public class Hello {

	private Message message;
	
	public String sayHello() {
		return message.getText();
	}

	
	
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
	
	
}
