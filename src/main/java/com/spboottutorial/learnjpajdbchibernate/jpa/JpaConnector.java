package com.spboottutorial.learnjpajdbchibernate.jpa;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JpaConnector {

	@PersistenceContext
	private EntityManager eManager;

	public void insert(CourseObjJpa c) {
		eManager.merge(c);

	}

	public CourseObjJpa finadById(long id) {
		return eManager.find(CourseObjJpa.class, id);
	}

}
