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
 * Timesheet generated by hbm2java
 */
@Entity
@Table(name = "timesheet", catalog = "cqp_prime")
public class Timesheet implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String ne;
	private String section;
	private String department;
	private String groupName;
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private Date timesheetDate;
	private Date extractedOnDate;
	private float dayProjectEffortSavedSubmitted;
	private float dayNonProjectEffortSavedSubmitted;
	private String timesheetManagerName;
	private String timesheetManagerMail;
	private String employeeLeaveIndication;
	private String insertedBy;
	private Date insertedDate;
	private String updatedBy;
	private Date updatedDate;
	private String isWeekend;
	private String isOnleave;
	private String isEffortAvailable;
	private Date extractedOnTimestamp;
	private String isHoliday;
	private Float approvedEffort;
	private Date approvedTime;
	private Date dateOfJoining;

	public Timesheet() {
	}

	public Timesheet(String ne, String section, String department,
			String groupName, int employeeId, String employeeName,
			Date timesheetDate, Date extractedOnDate,
			float dayProjectEffortSavedSubmitted,
			float dayNonProjectEffortSavedSubmitted, String insertedBy,
			Date insertedDate, String updatedBy, Date updatedDate,
			String isWeekend, String isOnleave, String isEffortAvailable,
			String isHoliday) {
		this.ne = ne;
		this.section = section;
		this.department = department;
		this.groupName = groupName;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.timesheetDate = timesheetDate;
		this.extractedOnDate = extractedOnDate;
		this.dayProjectEffortSavedSubmitted = dayProjectEffortSavedSubmitted;
		this.dayNonProjectEffortSavedSubmitted = dayNonProjectEffortSavedSubmitted;
		this.insertedBy = insertedBy;
		this.insertedDate = insertedDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.isWeekend = isWeekend;
		this.isOnleave = isOnleave;
		this.isEffortAvailable = isEffortAvailable;
		this.isHoliday = isHoliday;
	}

	public Timesheet(String ne, String section, String department,
			String groupName, int employeeId, String employeeName,
			String employeeEmail, Date timesheetDate, Date extractedOnDate,
			float dayProjectEffortSavedSubmitted,
			float dayNonProjectEffortSavedSubmitted,
			String timesheetManagerName, String timesheetManagerMail,
			String employeeLeaveIndication, String insertedBy,
			Date insertedDate, String updatedBy, Date updatedDate,
			String isWeekend, String isOnleave, String isEffortAvailable,
			Date extractedOnTimestamp, String isHoliday, Float approvedEffort,
			Date approvedTime, Date dateOfJoining) {
		this.ne = ne;
		this.section = section;
		this.department = department;
		this.groupName = groupName;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.timesheetDate = timesheetDate;
		this.extractedOnDate = extractedOnDate;
		this.dayProjectEffortSavedSubmitted = dayProjectEffortSavedSubmitted;
		this.dayNonProjectEffortSavedSubmitted = dayNonProjectEffortSavedSubmitted;
		this.timesheetManagerName = timesheetManagerName;
		this.timesheetManagerMail = timesheetManagerMail;
		this.employeeLeaveIndication = employeeLeaveIndication;
		this.insertedBy = insertedBy;
		this.insertedDate = insertedDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.isWeekend = isWeekend;
		this.isOnleave = isOnleave;
		this.isEffortAvailable = isEffortAvailable;
		this.extractedOnTimestamp = extractedOnTimestamp;
		this.isHoliday = isHoliday;
		this.approvedEffort = approvedEffort;
		this.approvedTime = approvedTime;
		this.dateOfJoining = dateOfJoining;
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

	@Column(name = "NE", nullable = false, length = 45)
	public String getNe() {
		return this.ne;
	}

	public void setNe(String ne) {
		this.ne = ne;
	}

	@Column(name = "SECTION", nullable = false, length = 45)
	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Column(name = "DEPARTMENT", nullable = false, length = 45)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "GROUP_NAME", nullable = false, length = 45)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Column(name = "Employee_ID", nullable = false)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "Employee_Name", nullable = false, length = 1000)
	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Column(name = "Employee_EMail", length = 1500)
	public String getEmployeeEmail() {
		return this.employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Timesheet_Date", nullable = false, length = 0)
	public Date getTimesheetDate() {
		return this.timesheetDate;
	}

	public void setTimesheetDate(Date timesheetDate) {
		this.timesheetDate = timesheetDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Extracted_On_Date", nullable = false, length = 0)
	public Date getExtractedOnDate() {
		return this.extractedOnDate;
	}

	public void setExtractedOnDate(Date extractedOnDate) {
		this.extractedOnDate = extractedOnDate;
	}

	@Column(name = "Day_Project_Effort_Saved_Submitted", nullable = false, precision = 12, scale = 0)
	public float getDayProjectEffortSavedSubmitted() {
		return this.dayProjectEffortSavedSubmitted;
	}

	public void setDayProjectEffortSavedSubmitted(
			float dayProjectEffortSavedSubmitted) {
		this.dayProjectEffortSavedSubmitted = dayProjectEffortSavedSubmitted;
	}

	@Column(name = "Day_Non_Project_Effort_Saved_Submitted", nullable = false, precision = 12, scale = 0)
	public float getDayNonProjectEffortSavedSubmitted() {
		return this.dayNonProjectEffortSavedSubmitted;
	}

	public void setDayNonProjectEffortSavedSubmitted(
			float dayNonProjectEffortSavedSubmitted) {
		this.dayNonProjectEffortSavedSubmitted = dayNonProjectEffortSavedSubmitted;
	}

	@Column(name = "Timesheet_Manager_Name", length = 1000)
	public String getTimesheetManagerName() {
		return this.timesheetManagerName;
	}

	public void setTimesheetManagerName(String timesheetManagerName) {
		this.timesheetManagerName = timesheetManagerName;
	}

	@Column(name = "Timesheet_Manager_Mail", length = 1500)
	public String getTimesheetManagerMail() {
		return this.timesheetManagerMail;
	}

	public void setTimesheetManagerMail(String timesheetManagerMail) {
		this.timesheetManagerMail = timesheetManagerMail;
	}

	@Column(name = "Employee_Leave_Indication", length = 1000)
	public String getEmployeeLeaveIndication() {
		return this.employeeLeaveIndication;
	}

	public void setEmployeeLeaveIndication(String employeeLeaveIndication) {
		this.employeeLeaveIndication = employeeLeaveIndication;
	}

	@Column(name = "INSERTED_BY", nullable = false, length = 1000)
	public String getInsertedBy() {
		return this.insertedBy;
	}

	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERTED_DATE", nullable = false, length = 0)
	public Date getInsertedDate() {
		return this.insertedDate;
	}

	public void setInsertedDate(Date insertedDate) {
		this.insertedDate = insertedDate;
	}

	@Column(name = "UPDATED_BY", nullable = false, length = 1000)
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", nullable = false, length = 0)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column(name = "IS_WEEKEND", nullable = false, length = 1)
	public String getIsWeekend() {
		return this.isWeekend;
	}

	public void setIsWeekend(String isWeekend) {
		this.isWeekend = isWeekend;
	}

	@Column(name = "IS_ONLEAVE", nullable = false, length = 1)
	public String getIsOnleave() {
		return this.isOnleave;
	}

	public void setIsOnleave(String isOnleave) {
		this.isOnleave = isOnleave;
	}

	@Column(name = "IS_EFFORT_AVAILABLE", nullable = false, length = 1)
	public String getIsEffortAvailable() {
		return this.isEffortAvailable;
	}

	public void setIsEffortAvailable(String isEffortAvailable) {
		this.isEffortAvailable = isEffortAvailable;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EXTRACTED_ON_TIMESTAMP", length = 0)
	public Date getExtractedOnTimestamp() {
		return this.extractedOnTimestamp;
	}

	public void setExtractedOnTimestamp(Date extractedOnTimestamp) {
		this.extractedOnTimestamp = extractedOnTimestamp;
	}

	@Column(name = "IS_HOLIDAY", nullable = false, length = 1)
	public String getIsHoliday() {
		return this.isHoliday;
	}

	public void setIsHoliday(String isHoliday) {
		this.isHoliday = isHoliday;
	}

	@Column(name = "APPROVED_EFFORT", precision = 12, scale = 0)
	public Float getApprovedEffort() {
		return this.approvedEffort;
	}

	public void setApprovedEffort(Float approvedEffort) {
		this.approvedEffort = approvedEffort;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "APPROVED_TIME", length = 0)
	public Date getApprovedTime() {
		return this.approvedTime;
	}

	public void setApprovedTime(Date approvedTime) {
		this.approvedTime = approvedTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_JOINING", length = 0)
	public Date getDateOfJoining() {
		return this.dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
