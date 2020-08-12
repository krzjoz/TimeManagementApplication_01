package com.jk.TimeManagmentApp.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="task_list")
public class ToDoListEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")	
	private Long id;
	
	@Column(name="taskname")
	private String taskName;
	
	@Column(name="category")
	private String category;
	
	@Column(name="taskdescription")
	private String taskDescription;
	
	@Column(name="taskstatus")
	private String taskStatus;
	
	@Column(name="taskadddate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date taskAddDate;
	
	@Column(name="taskfromdate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date taskFromDate;
	
	@Column(name="tasktodate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date taskToDate;
	
	@Column(name="userid")
	private int userId;
	
	public ToDoListEntity(String taskName, String category, String taskDescription, String taskStatus 
			//,Date taskAddDate,
			//Date taskFromDate, 
			//Date taskToDate
			) {
		this.taskName = taskName;
		this.category = category;
		this.taskDescription = taskDescription;
		//this.taskStatus = taskStatus;
		//this.taskFromDate = taskFromDate;
		//this.taskToDate = taskToDate;
	}
	
	// ta zmienna automatycznie bedzie wypelniona nowa data
	@PrePersist
	protected void onCreate () {
		taskAddDate = new Date();
	}
}