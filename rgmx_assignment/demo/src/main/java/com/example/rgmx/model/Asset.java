package com.example.rgmx.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "weabcd")
public class Asset {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "purchaseDate")
	private Date purchaseDate;
	@Column(name = "condition Note")
	private String condition_note;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getCondition_note() {
		return condition_note;
	}
	public void setCondition_note(String condition_note) {
		this.condition_note = condition_note;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAssignmentStatus() {
		return assignmentStatus;
	}
	public void setAssignmentStatus(String assignmentStatus) {
		this.assignmentStatus = assignmentStatus;
	}
	@Column(name = "category")
	private String category;
	@Column(name = "assignmentStatus")
	private String assignmentStatus;
	
}
