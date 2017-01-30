package fr.demos.formation;

import java.util.Random;

public class RandomMessage implements Message {

	
	@Override
	public final String getText() {
		String[] mesTextes = {"je suis le premier message", "moi, je suis le deuxième"};
		
		int rand = new Random().nextInt(mesTextes.length);
		System.out.println("A l'intérieur");
		
		return mesTextes[rand];
	}

}
