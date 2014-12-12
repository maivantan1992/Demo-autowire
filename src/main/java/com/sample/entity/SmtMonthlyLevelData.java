package com.sample.entity;

// Generated Dec 9, 2014 1:42:52 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SmtMonthlyLevelData generated by hbm2java
 */
@Entity
@Table(name = "smt_monthly_level_data", catalog = "cqp_prime")
public class SmtMonthlyLevelData implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer month;
	private Integer solutionGrpId;
	private Integer feedbackCount;
	private Double costOfProject;
	private Integer noOfAssociatesTagged;

	public SmtMonthlyLevelData() {
	}

	public SmtMonthlyLevelData(Integer month, Integer solutionGrpId,
			Integer feedbackCount, Double costOfProject,
			Integer noOfAssociatesTagged) {
		this.month = month;
		this.solutionGrpId = solutionGrpId;
		this.feedbackCount = feedbackCount;
		this.costOfProject = costOfProject;
		this.noOfAssociatesTagged = noOfAssociatesTagged;
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

	@Column(name = "MONTH")
	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@Column(name = "SOLUTION_GRP_ID")
	public Integer getSolutionGrpId() {
		return this.solutionGrpId;
	}

	public void setSolutionGrpId(Integer solutionGrpId) {
		this.solutionGrpId = solutionGrpId;
	}

	@Column(name = "FEEDBACK_COUNT")
	public Integer getFeedbackCount() {
		return this.feedbackCount;
	}

	public void setFeedbackCount(Integer feedbackCount) {
		this.feedbackCount = feedbackCount;
	}

	@Column(name = "COST_OF_PROJECT", precision = 22, scale = 0)
	public Double getCostOfProject() {
		return this.costOfProject;
	}

	public void setCostOfProject(Double costOfProject) {
		this.costOfProject = costOfProject;
	}

	@Column(name = "NO_OF_ASSOCIATES_TAGGED")
	public Integer getNoOfAssociatesTagged() {
		return this.noOfAssociatesTagged;
	}

	public void setNoOfAssociatesTagged(Integer noOfAssociatesTagged) {
		this.noOfAssociatesTagged = noOfAssociatesTagged;
	}

}
