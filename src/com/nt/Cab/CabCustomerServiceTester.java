package com.nt.Cab;

public class CabCustomerServiceTester {

	public static void main(String[] args) {

		CabCustomerService cabService =new CabCustomerService();
		cabService.addCabCustomer(new CabCustomer(122,"Prativa","Ameerpet","Hitech",4,"9998887771"));
		cabService.addCabCustomer(new CabCustomer(133,"Ankita","Ameerpet","Hitech",6,"7077714363"));
		cabService.addCabCustomer(new CabCustomer(222,"Praveen","Ameerpet","Gacchibowli",8,"8889992223"));
		cabService.addCabCustomer(new CabCustomer(333,"Urvashi","Ameerpet","Madhapur",7,"5554536752"));
		cabService.addCabCustomer(new CabCustomer(444,"Rebika","Ameerpet","Hitech",3,"6664563219"));
		
		CabCustomer cabCustomer = new CabCustomer(445,"Sneha","Ameerpet","Hitech",10,"6664563219");
		if(cabService.isFirstCustomer(cabCustomer.getPhone()))
		{
			System.out.println(cabCustomer.getCustomerName()+" is a first Time Customer");
		}
		else
			System.out.println(cabCustomer.getCustomerName()+" is already a customer");
		
		cabService.printBill(cabCustomer);
	}

}
