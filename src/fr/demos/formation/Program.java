package fr.demos.formation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// lance Spring (charge la config de Spring)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"context.xml"});
		// demande � Spring de fournir une instance d'un bean
		HelloAnnote hello = (HelloAnnote) context.getBean("helloAnnoteId");
		
		System.out.println(hello.sayHello());
		
		
		context.close();
	}

}
