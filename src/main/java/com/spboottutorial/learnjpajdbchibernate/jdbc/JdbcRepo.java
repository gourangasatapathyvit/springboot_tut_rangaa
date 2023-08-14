package com.spboottutorial.learnjpajdbchibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private String INSERT_QUERY = """
				INSERT INTO course (id, course_name, author_name) VALUES
				(1, 'Introduction to SQL', 'John Doe'),
				(2, 'Python for Beginners', 'Jane Doe'),
				(3, 'JavaScript for Dummies', 'Bill Smith'),
				(4, 'HTML and CSS', 'Susan Jones'),
				(5, 'React.js', 'David Williams'),
				(6, 'Angular.js', 'Mary Johnson'),
				(7, 'Vue.js', 'Peter Brown'),
				(8, 'Node.js', 'Sally Green'),
				(9, 'Django', 'Michael White'),
				(10, 'Flask', 'Jennifer Black'),
				(11, 'Ruby on Rails', 'Chris Brown'),
				(12, 'Laravel', 'Sarah Green'),
				(13, 'Spring Boot', 'Tom White'),
				(14, 'Hibernate', 'Lily Black'),
				(15, 'Spring Security', 'Peter Brown')
			""";

	private String INSERT_QUERY_OBJ = """
				INSERT INTO course (id, course_name, author_name) VALUES
				(?, ?,?);
			""";

	private String SELECT_QUERY_BY_ID = """
				SELECT * FROM course where id=?
			""";

	public void insert() {
		jdbcTemplate.update(INSERT_QUERY);
	}

	public void insertByClass(CourseObj course) {
		jdbcTemplate.update(INSERT_QUERY_OBJ, course.getId(), course.getCourse_name(), course.getAuthor_name());
	}

	public CourseObj findById(long id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY_BY_ID, new BeanPropertyRowMapper<>(CourseObj.class),id);
	}
}
