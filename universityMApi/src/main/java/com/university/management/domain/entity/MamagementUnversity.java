package com.university.management.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MAMAGEMENT_UNVERSITY database table.
 * 
 */
@Entity
@Table(name="MAMAGEMENT_UNVERSITY")
@NamedQuery(name="MamagementUnversity.findAll", query="SELECT m FROM MamagementUnversity m")
public class MamagementUnversity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UNVERSITY_ID")
	private long unversityId;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDMISSION_DATE")
	private Date addmissionDate;

	@Column(name="UNVERSITY_COURSE")
	private String unversityCourse;

	@Column(name="UNVERSITY_COURSE_AMOUNT")
	private BigDecimal unversityCourseAmount;

	@Column(name="UNVERSITY_NO")
	private BigDecimal unversityNo;

	@Column(name="UNVERSITY_SERIAL_NO")
	private String unversitySerialNo;

	//bi-directional many-to-one association to College
	@ManyToOne
	@JoinColumn(name="COLLEGE_ID")
	private College college;

	public MamagementUnversity() {
	}

	public long getUnversityId() {
		return this.unversityId;
	}

	public void setUnversityId(long unversityId) {
		this.unversityId = unversityId;
	}

	public Date getAddmissionDate() {
		return this.addmissionDate;
	}

	public void setAddmissionDate(Date addmissionDate) {
		this.addmissionDate = addmissionDate;
	}

	public String getUnversityCourse() {
		return this.unversityCourse;
	}

	public void setUnversityCourse(String unversityCourse) {
		this.unversityCourse = unversityCourse;
	}

	public BigDecimal getUnversityCourseAmount() {
		return this.unversityCourseAmount;
	}

	public void setUnversityCourseAmount(BigDecimal unversityCourseAmount) {
		this.unversityCourseAmount = unversityCourseAmount;
	}

	public BigDecimal getUnversityNo() {
		return this.unversityNo;
	}

	public void setUnversityNo(BigDecimal unversityNo) {
		this.unversityNo = unversityNo;
	}

	public String getUnversitySerialNo() {
		return this.unversitySerialNo;
	}

	public void setUnversitySerialNo(String unversitySerialNo) {
		this.unversitySerialNo = unversitySerialNo;
	}

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

}