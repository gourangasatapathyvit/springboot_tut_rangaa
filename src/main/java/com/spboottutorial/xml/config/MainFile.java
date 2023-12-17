package com.spboottutorial.xml.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {

	public static void main(String[] args) {

		var x = new ClassPathXmlApplicationContext("contextConfiguration.xml");
		Arrays.stream(x.getBeanDefinitionNames()).forEach(System.out::println);

		Runner r = (Runner) x.getBean("RunnerConfig");
		r.run();

		x.getBean(Adress.class).go("lo");

	}

}
