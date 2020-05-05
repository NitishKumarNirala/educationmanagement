package com.university.management.heatos;

import org.springframework.hateoas.ResourceSupport;

import com.university.management.dto.CollegeDTO;

import lombok.Getter;

@Getter
public class UniversityResource extends ResourceSupport{

	 private final CollegeDTO collegeDTO;
	  public UniversityResource(CollegeDTO  collegeDTO) {
	      super();
	      this.collegeDTO = collegeDTO;
	     // add(linkTo(UniversityController.class).withRel("templates"));
	   }
}
