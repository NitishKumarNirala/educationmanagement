package com.university.management.domain.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COURSE database table.
 * 
 */
@Entity
@NamedQuery(name="Course.findAll", query="SELECT c FROM Course c")
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COURSE_ID")
	private long courseId;

	@Column(name="COLLEGE_COURSE_TYPE")
	private String collegeCourseType;

	@Column(name="COURSE_NAME")
	private String courseName;

	public Course() {
	}

	public long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCollegeCourseType() {
		return this.collegeCourseType;
	}

	public void setCollegeCourseType(String collegeCourseType) {
		this.collegeCourseType = collegeCourseType;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}