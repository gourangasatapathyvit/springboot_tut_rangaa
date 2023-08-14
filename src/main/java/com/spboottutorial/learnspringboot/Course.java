package com.spboottutorial.learnspringboot;

public class Course {
	private Long id;
	private String courseName;

	public Course(Long id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + "]";
	}

}
