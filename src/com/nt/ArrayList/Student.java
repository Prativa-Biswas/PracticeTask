package com.nt.ArrayList;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
	
	private Integer studentId;
	private String studentName;
	private Double  studentFee;
	private Date dateOfAdmission;
	
	private Student()
	{}
	
	public Student(Integer studentId, String studentName, Double studentFee, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject()
	{
		Student std= new Student();
		return new Student(std.studentId,std.studentName,std.studentFee,std.dateOfAdmission);
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}

	
	
	
}
