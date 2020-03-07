package com.university.management.domain.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DEPARTMENT database table.
 * 
 */
@Entity
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DEP_ID")
	private long depId;

	@Column(name="DEP_NAME")
	private String depName;

	@Column(name="DEP_TYPE")
	private String depType;

	public Department() {
	}

	public long getDepId() {
		return this.depId;
	}

	public void setDepId(long depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepType() {
		return this.depType;
	}

	public void setDepType(String depType) {
		this.depType = depType;
	}

}