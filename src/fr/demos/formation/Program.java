package fr.demos.formation;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// lance Spring (charge la config de Spring)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"context.xml"});
		// demande à Spring de fournir une instance d'un bean
		Hello hello = (Hello) context.getBean("helloId");
		
		System.out.println(hello.sayHello());
		
		
		context.close();
	}

}
