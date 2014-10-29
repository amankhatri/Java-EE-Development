package com.aman.spring.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*spring let us use regular java objects and create spring beans*/

		/*To make use to spring we need to have write jars and to acquire those jars we will
		 * use Maven*/
		/*Do do list :
		 * 1) I will create an XML file to instantiate the person class /object in Person.Java Class. 
		 * 2) Then in Application.java I will get the person object (in spring we call it bean) from
		 * spring container and get container from it.*/
		/*Creating xml, right click the project folder go to new > go other>spring> select spring 
		 * bean configuration file. It should be made in root director
		 * To edit the beans.xml file, i will go to beans tab in beans.xml file and add person class to it
		 * now I need some java code to create spring bean container to read beans.xml to instantiate 
		 * Person. To achieve this we do this:*/
		/*ApplicationContext is a bean container which can instantiate a class. There are several verson of 
		 * this container, we could have used bean factory , however beanfactory is very low level*/
		/*http://docs.spring.io/spring-framework/docs/2.5.6/api/org/springframework/context/ApplicationContext.html*/
		ApplicationContext context= new FileSystemXmlApplicationContext("beans.xml");
		Person person = (Person)context.getBean("person");
		person.speak();
	}

}
