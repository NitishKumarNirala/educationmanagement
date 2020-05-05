package com.university.management.heatos;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.university.management.dto.CollegeDTO;
import com.university.management.rest.controller.UniversityController;

public class UniversityResourceAssembler extends ResourceAssemblerSupport<CollegeDTO, UniversityResource> {

	public UniversityResourceAssembler() {
	      super(UniversityController.class, UniversityResource.class);
	   }

	   @Override
	   
	   public UniversityResource toResource(CollegeDTO entity) {
	      return new UniversityResource(entity);
	   }
}
