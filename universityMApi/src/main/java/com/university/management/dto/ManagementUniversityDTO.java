package com.university.management.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.university.management.domain.entity.College;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ManagementUniversityDTO implements Serializable{
	

	private static final long serialVersionUID = 1L;

	private long unversityId;

	private Date addmissionDate;

	private String unversityCourse;

	private BigDecimal unversityCourseAmount;

	private BigDecimal unversityNo;

	private String unversitySerialNo;

	private College college;

}
