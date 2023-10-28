package com.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE_MASTER")
public class Course {
	
	@Id
	@Column(name = "COURSE_ID")
	private long id;
	
	@Column(name = "COURSE_DESC")
	private String courseDesc;
	
	@Column(name = "COURSE_TITLE")
	private String courseTitle;

	public Course() {
		
	}
	
	public Course(long id, String courseDesc, String courseTitle) {
		super();
		this.id = id;
		this.courseDesc = courseDesc;
		this.courseTitle = courseTitle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	sdf

}
