package com.defaultPackage.src;

public class Person {
	private int id;
	private String name;
	
	public Person() {
		
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}


	public void speak(){
		System.out.println("Hello I am a person.");
	}
	
	
	
}
