package com.spboottutorial.xml.config;

public class Runner {
	private Testing test;
	
	public Runner(Testing test) {
		super();
		this.test = test;
	}

	public void run() {
		test.go("adress run");
	}

}
