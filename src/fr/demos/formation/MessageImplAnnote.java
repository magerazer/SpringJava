package fr.demos.formation;

public class MessageImplAnnote implements Message {

	@Override
	public String getText() {
		
		return "Hello injection !";
	}

	
	
}
