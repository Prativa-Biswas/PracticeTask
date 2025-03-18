package com.nt.colecction;

import java.util.ArrayList;

public class Test3 {
	public static void main(String argv[])
	 {
   	 
			/*	ArrayList list = new ArrayList(); 
				ArrayList listStr = list; 
				ArrayList listBuf = list; 
				listStr.add(0, "Hello"); 
			StringBuffer buff =(StringBuffer) listBuf.get(0); 
			//	StringBuffer buff = listBuf.get(0); 
			   System.out.println(buff.toString());*/
		ArrayList obj = new ArrayList();
        obj.add("A");
        obj.set(0, "B");
        System.out.println(obj.size());
    
   }

}
