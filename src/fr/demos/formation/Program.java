package fr.demos.formation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// lance Spring (charge la config de Spring)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"context.xml"});
		// demande à Spring de fournir une instance d'un bean
		//HelloAnnote hello = (HelloAnnote) context.getBean("helloAnnoteId");
		
		Hello hello = (Hello) context.getBean("hello");
		
		System.out.println(hello.sayHello());
		
		//Message randMes = (Message) context.getBean("messageId");
		
				
		
		context.close();
	}

}
