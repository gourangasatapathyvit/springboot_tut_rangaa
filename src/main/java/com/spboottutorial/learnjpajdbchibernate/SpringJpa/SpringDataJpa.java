package com.spboottutorial.learnjpajdbchibernate.SpringJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJpa extends JpaRepository<CourseObjSpJpa, Long> {
//
//	@Query("FROM CourseObjSpJpa c WHERE c.author_name=:author_name")
//	List<CourseObjSpJpa> findByAuthorName(@Param("author_name")String author_name);

}
