package com.sample.entity;

// Generated Dec 9, 2014 1:42:52 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserLog generated by hbm2java
 */
@Entity
@Table(name = "user_log", catalog = "cqp_prime")
public class UserLog implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private int employeeId;
	private Date logInTime;
	private Date logOutTime;
	private String logOutMethod;

	public UserLog() {
	}

	public UserLog(int employeeId, Date logInTime) {
		this.employeeId = employeeId;
		this.logInTime = logInTime;
	}

	public UserLog(int employeeId, Date logInTime, Date logOutTime,
			String logOutMethod) {
		this.employeeId = employeeId;
		this.logInTime = logInTime;
		this.logOutTime = logOutTime;
		this.logOutMethod = logOutMethod;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "EMPLOYEE_ID", nullable = false)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOG_IN_TIME", nullable = false, length = 0)
	public Date getLogInTime() {
		return this.logInTime;
	}

	public void setLogInTime(Date logInTime) {
		this.logInTime = logInTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOG_OUT_TIME", length = 0)
	public Date getLogOutTime() {
		return this.logOutTime;
	}

	public void setLogOutTime(Date logOutTime) {
		this.logOutTime = logOutTime;
	}

	@Column(name = "LOG_OUT_METHOD", length = 1000)
	public String getLogOutMethod() {
		return this.logOutMethod;
	}

	public void setLogOutMethod(String logOutMethod) {
		this.logOutMethod = logOutMethod;
	}

}
