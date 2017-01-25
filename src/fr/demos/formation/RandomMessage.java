package fr.demos.formation;

import java.util.Random;

public class RandomMessage implements Message {

	
	@Override
	public String getText() {
		String[] mesTextes = {"je suis le premier message", "moi, je suis le deuxième"};
		
		int rand = new Random().nextInt(mesTextes.length);
		
		return mesTextes[rand];
	}

}
