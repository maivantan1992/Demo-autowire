package com.sample.entity;

// Generated Dec 9, 2014 1:42:52 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user")
@DynamicInsert
@DynamicUpdate
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private String employeeEmail;
	private String employeeName;
	private String designation;
	private String section;
	private String department;
	private String groupName;

	public User() {
	}

	public User(int employeeId, String employeeEmail, String employeeName) {
		this.employeeId = employeeId;
		this.employeeEmail = employeeEmail;
		this.employeeName = employeeName;
	}

	public User(int employeeId, String employeeEmail, String employeeName,
			String designation, String section, String department,
			String groupName) {
		this.employeeId = employeeId;
		this.employeeEmail = employeeEmail;
		this.employeeName = employeeName;
		this.designation = designation;
		this.section = section;
		this.department = department;
		this.groupName = groupName;
	}

	@Id
	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "EMPLOYEE_EMAIL", nullable = false, length = 1000)
	public String getEmployeeEmail() {
		return this.employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Column(name = "EMPLOYEE_NAME", nullable = false, length = 1000)
	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Column(name = "DESIGNATION", length = 1000)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Column(name = "SECTION", length = 1000)
	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Column(name = "DEPARTMENT", length = 1000)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "GROUP_NAME", length = 1000)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
