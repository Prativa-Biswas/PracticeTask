package hospitalFinderApp;

import java.util.List;

public class HospitalFinder {

	public static void main(String[] args) {
		
		List<String> listOfTreatments= List.of("Cardiology","Gynachology","Pediatric","General","Medicine speicalist","ENT","Pulmanory");
		
		Hospital hsp1= new Hospital("Yosodha", listOfTreatments, "Gaytri", "9087675432", "Hyderabad");
		Hospital hsp2= new Hospital("Bsudha", listOfTreatments, "Anand", "8906543214", "Delhi");
		Hospital hsp3= new Hospital("Go Hosptal", listOfTreatments, "Anita", "7890543219", "Mumbai");
		Hospital hsp4= new Hospital("KIIMS", listOfTreatments, "Ashika", "7077743163", "Hyderabad");
		
		HospitalService hospitaService= new HospitalService();
		
        System.out.println(hospitaService.addHospital(hsp1));
		System.out.println(hospitaService.addHospital(hsp2));
		System.out.println(hospitaService.addHospital(hsp3));
        System.out.println(hospitaService.addHospital(hsp4));
		System.out.println("-------------------------------------------");
        hospitaService.getHospitals().forEach((k,v)->System.out.println("Hospital code:"+k+"  Hospital Nmae: "+v));
       System.out.println("---------------------------------------------");
        System.out.println(hospitaService.getHospitalDetails(200));
        //System.out.println(hospitaService.getHospitalDetails(hospitaService.addHospital(hsp4)));

	}

}
