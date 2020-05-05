package com.university.management.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.university.management.domain.entity.MamagementUnversity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class CollegeDTO implements Serializable{
	

	private static final long serialVersionUID = 1L;
	

	private long collegeId;

	private String collegeAddress;

	private String collegeCity;

	private String collegeCourseType;

	private String collegeName;

	private BigDecimal collegeSerialNo;

	private String collegeState;

	private String collegeZipCode;

	private List<MamagementUnversity> mamagementUnversities;

}
