package fr.demos.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("helloAnnoteId")
public class HelloAnnote {
	@Autowired
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
