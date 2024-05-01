package com.HusainR.Learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name ,int age , Address adress) {};
record Address(String firstLine , String city) {};

@Configuration	
public class HelloWorldConfigaration {

	@Bean
	public String name() {
		return "Husain";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Manas" ,22 , address3());
		return person;
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		System.out.println("Inside address");
		return new Address("sector 17" , "Ggn");
	}
	
	@Bean
	@Qualifier("address3Qualifier")
	public Address address3() {
		return new Address("sector 20" , "Ggn");
	}
	
	// Bean which uses existing bean to store the data (Methode call)
	@Bean
	public Person person2Methodcall() { 
		//name and age
		System.out.println("inside person2Methodcall");
		return new Person(name(), age() , address());
	}
	
	// Bean uses Bean Name as a Parameters 
	@Bean
	public Person person3Parameters(String name, int age , Address address) { 
		//name, age, address used as a parameter
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person4Qualifier(String name, int age , @Qualifier("address3Qualifier")Address address) { 
		//name, age, address used as a parameter
		return new Person(name, age, address);
	}
	  
}
