package com.university.management.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.university.management.constant.CommonConstant;
import com.university.management.dto.CollegeDTO;
import com.university.management.heatos.UniversityResource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin
@RestController(CommonConstant.API_URL_BASE)
public class UniversityController {
	
	
	@GetMapping("/")
	public String getLink() {
		return "Start  Application";
	}
	
	   // --------------------------------------------------------------------------------------------------------------
	   //
	   // POST Methods
	   //
	   // --------------------------------------------------------------------------------------------------------------

	   @PostMapping(path = CommonConstant.API_URL_BASE + "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	   @ApiOperation(value = "Create a college", notes = ".", response = UniversityResource.class)
	   @ApiResponses({ @ApiResponse(code = 201, message = "Created", response = UniversityResource.class), @ApiResponse(code = 400, message = "Bad Request"),
	   @ApiResponse(code = 401, message = "Unauthorized") })
	   public ResponseEntity<UniversityResource> createStudentAddmission(@ApiParam(required = true, name = "college", value = "The college creation form") @RequestBody CollegeDTO collegeForm){
		
		   return null;
		   
	   }

}
