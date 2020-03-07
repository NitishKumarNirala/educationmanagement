package com.university.management.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the COLLEGE database table.
 * 
 */
@Entity
@NamedQuery(name="College.findAll", query="SELECT c FROM College c")
public class College implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COLLEGE_ID")
	private long collegeId;

	@Column(name="COLLEGE_ADDRESS")
	private String collegeAddress;

	@Column(name="COLLEGE_CITY")
	private String collegeCity;

	@Column(name="COLLEGE_COURSE_TYPE")
	private String collegeCourseType;

	@Column(name="COLLEGE_NAME")
	private String collegeName;

	@Column(name="COLLEGE_SERIAL_NO")
	private BigDecimal collegeSerialNo;

	@Column(name="COLLEGE_STATE")
	private String collegeState;

	@Column(name="COLLEGE_ZIP_CODE")
	private String collegeZipCode;

	//bi-directional many-to-one association to MamagementUnversity
	@OneToMany(mappedBy="college")
	private List<MamagementUnversity> mamagementUnversities;

	public College() {
	}

	public long getCollegeId() {
		return this.collegeId;
	}

	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeAddress() {
		return this.collegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	public String getCollegeCity() {
		return this.collegeCity;
	}

	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}

	public String getCollegeCourseType() {
		return this.collegeCourseType;
	}

	public void setCollegeCourseType(String collegeCourseType) {
		this.collegeCourseType = collegeCourseType;
	}

	public String getCollegeName() {
		return this.collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public BigDecimal getCollegeSerialNo() {
		return this.collegeSerialNo;
	}

	public void setCollegeSerialNo(BigDecimal collegeSerialNo) {
		this.collegeSerialNo = collegeSerialNo;
	}

	public String getCollegeState() {
		return this.collegeState;
	}

	public void setCollegeState(String collegeState) {
		this.collegeState = collegeState;
	}

	public String getCollegeZipCode() {
		return this.collegeZipCode;
	}

	public void setCollegeZipCode(String collegeZipCode) {
		this.collegeZipCode = collegeZipCode;
	}

	public List<MamagementUnversity> getMamagementUnversities() {
		return this.mamagementUnversities;
	}

	public void setMamagementUnversities(List<MamagementUnversity> mamagementUnversities) {
		this.mamagementUnversities = mamagementUnversities;
	}

	public MamagementUnversity addMamagementUnversity(MamagementUnversity mamagementUnversity) {
		getMamagementUnversities().add(mamagementUnversity);
		mamagementUnversity.setCollege(this);

		return mamagementUnversity;
	}

	public MamagementUnversity removeMamagementUnversity(MamagementUnversity mamagementUnversity) {
		getMamagementUnversities().remove(mamagementUnversity);
		mamagementUnversity.setCollege(null);

		return mamagementUnversity;
	}

}