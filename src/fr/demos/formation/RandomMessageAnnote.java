package fr.demos.formation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("messageAnnoteId")
public class RandomMessageAnnote implements Message {

	
	@Override
	public String getText() {
		String[] mesTextes = {"je suis le premier message", "moi, je suis le deuxième"};
		
		int rand = new Random().nextInt(mesTextes.length);
		
		return mesTextes[rand];
	}

}
