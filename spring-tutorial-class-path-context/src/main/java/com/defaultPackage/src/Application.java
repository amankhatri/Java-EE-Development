package com.defaultPackage.src;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/*ApplicationContext is a bean container which can instantiate a class. There are several verson of 
				 * this container, we could have used bean factory , however beanfactory is very low level*/
				/*http://docs.spring.io/spring-framework/docs/2.5.6/api/org/springframework/context/ApplicationContext.html*/
				//ApplicationContext context= new FileSystemXmlApplicationContext("src/main/java/com/defaultPackage/Beans/beans.xml");
				/*since its an xml file and we have to close the container specially since we are using
				 * FileSystemXMLApplication context. Remember Interface Application Context does not have
				 * close method in it so we have to cast context in to FileSystemXmlApplicationContext*/
				//Person person = (Person)context.getBean("person");
				//person.speak();
				//((FileSystemXmlApplicationContext)context).close();
				/*It convenient put xml files like beans.xml in some sub folder. So we are creating a package
				 * to store xml files. so src/main/java/com/defaultPackage/Beans/beans.xm is a relative class path, relative
				 * to or project. So now we can change this to: */
		ApplicationContext context= new ClassPathXmlApplicationContext("com/defaultPackage/Beans/beans.xml"); //put name according to package in which
		//the xml beans is.
		Person person = (Person)context.getBean("person");
		person.speak();
		System.out.println("Person: " +person);
		((ClassPathXmlApplicationContext)context).close();
	}
}
