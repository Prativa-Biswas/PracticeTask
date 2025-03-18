package hospitalFinderApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HospitalService {
	private static boolean isFirstTime = true;
	private ArrayList<Hospital> listOfHospital;
	
	
	
	public HospitalService() {
		super();
		listOfHospital=new ArrayList<Hospital>();
	}

	public int addHospital(Hospital hospital)
	{
		int code=0;
		if(HospitalService.isFirstTime) {
			HospitalService.isFirstTime=false;
			code=100;			
			}
		else {
			code=101+ new Random().nextInt(900);
			}
		hospital.setHospitalCode(code);
		listOfHospital.add(hospital);
				
		return code;
	}
 
	public Map<Integer,String> getHospitals(){
					 
		 Map<Integer,String> map= new HashMap<Integer, String>();
		 for(Hospital hospital:listOfHospital)
			{
				map.put(hospital.getHospitalCode(), hospital.getHospitalName());
				
			}		
		return map;
		
	}
	
	public Hospital getHospitalDetails(int hospitalCode)
	{
		
	for(Hospital hospital:listOfHospital)
	{
		if(hospital.getHospitalCode()==hospitalCode)
			return hospital;
		
	}
	return null;			
 }
}
