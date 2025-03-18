package com.nt.Cab;

import java.util.ArrayList;

public class CabCustomerService {

	private ArrayList<CabCustomer>  CabCustomers;
	
	
	
	public CabCustomerService() {
		super();
		CabCustomers = new ArrayList<CabCustomer>();
	}

	public void addCabCustomer(CabCustomer Customer) 
	{
		CabCustomers.add(Customer);
	}
	
	public boolean isFirstCustomer(String phoneNo)
	{
		for(CabCustomer customer:CabCustomers)
		{
			if(customer.getPhone().equals(phoneNo))
				return false;
		}
		return true;
	}
	public double calculateBill(CabCustomer cabCustomer)
	{		
	     if(isFirstCustomer(cabCustomer.getPhone()))
		  {
	    	 return 0;
		  }
		  else 
		  {
			  if(cabCustomer.getDistance()<=4)
			  {
				  return 80;
			  }
			  else
			  {
				  return 80+((cabCustomer.getDistance()-4)*6);
			  }		  
		  }						
	}
	
	public void printBill(CabCustomer cabCustomer)
	{
		
	   System.out.println(cabCustomer.getCustomerName()+" Please pay your bill of Rs."+calculateBill(cabCustomer));	
	}
	
	
}
