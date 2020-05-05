package com.university.management.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;

	private long courseId;

	private String collegeCourseType;

	private String courseName;

}
