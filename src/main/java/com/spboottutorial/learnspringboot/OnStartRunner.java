package com.spboottutorial.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spboottutorial.learnjpajdbchibernate.SpringJpa.CourseObjSpJpa;
import com.spboottutorial.learnjpajdbchibernate.SpringJpa.SpringDataJpa;
import com.spboottutorial.learnjpajdbchibernate.jdbc.CourseObj;
import com.spboottutorial.learnjpajdbchibernate.jdbc.JdbcRepo;
import com.spboottutorial.learnjpajdbchibernate.jpa.CourseObjJpa;
import com.spboottutorial.learnjpajdbchibernate.jpa.JpaConnector;

@Component
public class OnStartRunner implements CommandLineRunner {

	@Autowired
	private JdbcRepo jdbcRepo;

	@Autowired
	private JpaConnector jc;

	@Autowired
	private SpringDataJpa spj;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("lorem");
//		jdbcRepo.insert();

		// System.out.println("lorem");
		jdbcRepo.insertByClass(new CourseObj((long) 1, "l1", "lokixxxxx1"));
//		jdbcRepo.insertByClass(new CourseObj((long) 2, "l2", "lokdggi1"));
//		jdbcRepo.insertByClass(new CourseObj((long) 3, "l3", "lokiddf1"));

		jc.insert(new CourseObjJpa((long) 1, "l1", "lokixxxxx1"));
		jc.insert(new CourseObjJpa((long) 2, "l2jpa", "lokdggi1"));
		jc.insert(new CourseObjJpa((long) 3, "l3", "lokiddf1"));
//		System.out.println(jc.finadById(2));

		spj.save(new CourseObjSpJpa((long) 1, "l1", "lokixxxxx1"));
		spj.save(new CourseObjSpJpa((long) 2, "l2jpa", "lokdggi1"));
		spj.save(new CourseObjSpJpa((long) 3, "l3", "lokiddf1"));
//		System.out.println(spj.finadById(2));
	}

}
