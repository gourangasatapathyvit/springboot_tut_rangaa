package com.spboottutorial.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Runner {
	private Testing test;
	
	public Runner(Testing test) {
		super();
		this.test = test;
	}

	public void run() {
		test.go("nae");
	}

}
