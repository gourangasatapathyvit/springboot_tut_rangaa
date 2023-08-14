package com.spboottutorial.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CurrencyGetter currencyGetter;

	@RequestMapping("/courses")
	public List<Course> retriveAllCourse() {

		return Arrays.asList(new Course((long) 1, "lorem"), new Course((long) 2, "seeaszxzasa"));
	}

	@RequestMapping("/getAllCurrency")
	public CurrencyGetter retriveAllCurrency() {
		
		return currencyGetter;
	}

}
