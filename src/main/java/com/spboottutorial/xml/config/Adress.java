package com.spboottutorial.xml.config;


public class Adress implements Testing{
	private String name;

	public Adress(String name) {
		super();
		this.name = name;
	}

	public Adress() {
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Adress [name=" + name + "]";
	}

	@Override
	public void go(String name) {
		System.out.println("adress lorem = "+name);
		
	}
	

}
