package com.HusainR.Learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class app01HelloWorldSpring {

	public static void main(String[] args) {
		
		//1.  launch a spring context. 
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(HelloWorldConfigaration.class);
		
		//2. configure that thing that we want a spring to manage -
		//   HelloWorldCOnfigaration with - @Configaration 
		// 	@Bean - name;
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("person"));
		
		// this is the one way to retrieve the function of bean
		System.out.println(context.getBean("address2"));
		
		//this is the 2nd way to call the bean!
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("person2Methodcall"));
		
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean("person4Qualifier"));
		
		
		context.close();
	}
}
