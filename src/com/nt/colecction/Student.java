package com.nt.colecction;


import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student {
	private Integer studentId;
	private String studentName;
    private Double studentFees;
    private Date dateOfAdmission ;
    
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
    
    public static Student getStudentObject()
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter student id");
    	int id=sc.nextInt();
    	System.out.println("Enter Student Name");
    	String name=sc.nextLine();
    	sc.nextLine();
    	System.out.println("Enter student fees");
    	double fees=sc.nextDouble();
    	sc.nextLine();
    	
    	Date date = null;
		/*while (date == null) {
		    System.out.print("Enter Date of Admission (yyyy-MM-dd): ");
		    String dateStr = sc.nextLine().trim();
		    if (!dateStr.isEmpty()) {
		        try {
		            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
		        } catch (ParseException e) {
		            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
		        }
		    } else {
		        System.out.println("Date cannot be empty. Please try again.");
		    }
		}*/
    	if(date==null)
    	{
    		System.out.println("\"Enter Date of Admission (yyyy-MM-dd): ");
    		String dateStr=sc.nextLine().trim();
    		if(!dateStr.isEmpty())
    		{
    			try {
					date=new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
				} catch (ParseException e) {
		            System.err.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
				}
    		}
    		
    	}
    	else 
	        System.out.println("Date cannot be empty. Please try again.");
	        
    	
    	return new Student(id,name,fees,date);
 
    }

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}

    
}
