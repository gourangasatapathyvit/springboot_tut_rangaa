package com.spboottutorial.test;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.spboottutorial")
public class MainFile {

//	@Bean
//	public Runner runner(Testing t) {
//		System.out.println("q = "+t);
//		return new Runner(t);
//	}

	@Bean
	@Primary
	public Adress adress() {
		return new Adress("qwerty");
	}


	public static void main(String[] args) {

		var x = new AnnotationConfigApplicationContext(MainFile.class);
		
//		Arrays.stream(x.getBeanDefinitionNames()).forEach(System.out::println);
		
		
//		System.out.println(x.getBean(Runner.class).toString());
		System.out.println(x.getBean(Adress.class));
		x.getBean(Runner.class).run();
//		System.out.println(x.getBean("adres"));
		
		
//		different types of dependency injection
	}

}
