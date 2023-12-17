package com.spboottutorial.xml.config;

public class Location implements Testing{
	private String name;

	public Location(String name) {
		super();
		this.name = name;
	}

	public Location() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Location [name=" + name + "]";
	}

	@Override
	public void go(String name) {
		System.out.println("locaton - go");
		
	}
	

}
