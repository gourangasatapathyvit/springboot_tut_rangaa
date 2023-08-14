package com.spboottutorial.learnjpajdbchibernate.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "jpa_course")
public class CourseObjJpa {
	
	@Id
	private Long id;
	
	@Column(name = "author_name")
	private String author_name;
		
	@Column(name = "course_name")
	private String course_name;

	public CourseObjJpa(Long id, String author_name, String course_name) {
		super();
		this.id = id;
		this.author_name = author_name;
		this.course_name = course_name;
	}

	public CourseObjJpa() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	@Override
	public String toString() {
		return "CourseObj [id=" + id + ", author_name=" + author_name + ", course_name=" + course_name + "]";
	}

}
