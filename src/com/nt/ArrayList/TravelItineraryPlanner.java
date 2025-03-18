package com.nt.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*record Activity(String name,String schedule)
{
	
}*/
class Activity{
	private String name;
	private String schedule;
	public Activity(String name, String schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the schedule
	 */
	public String getSchedule() {
		return schedule;
	}
	@Override
	public String toString() {
		return "- Visit " + name + " at " + schedule+"\n";
	}
	
	
}

class Destination{
	private String name;
	private List<Activity> activites;
	
	public Destination(String name) {
		super();
		this.name = name;
		this.activites = new ArrayList<Activity>();
	}
	
	public void addActivities(Activity activity)
	{
		activites.add(activity);
	}
	public void printListOfActivities() 
	{
		activites.forEach(System.out::println);
	}
	
	@Override
	public String toString() {
		return "Destination: " + name + "\n" + activites;
	}
		
}

class ItineraryPlanner{
	
   private List<Destination> destinations;

public ItineraryPlanner( ) {
	super();
	this.destinations = new ArrayList<Destination>();
}

public void addDestinations(Destination destination)
{
	destinations.add(destination);
}
  
public void showDestination()
{
	destinations.forEach(destn->System.out.println(destn));
}

}

public class TravelItineraryPlanner {

	public static void main(String[] args) {

		ItineraryPlanner travelPlanner= new ItineraryPlanner();
		
		Destination paris= new Destination("Paris");
		Destination london= new Destination("London");
		
		paris.addActivities(new Activity("Eiffel Tower","Morning"));
		paris.addActivities(new Activity("Louvre Museum ","Afternoon"));
		
		london.addActivities(new Activity("British Museum ","Afternoon"));
		london.addActivities(new Activity("London Eye ","Afternoon"));
		
		travelPlanner.addDestinations(paris);
		travelPlanner.addDestinations(london);
		travelPlanner.showDestination();
		
		
		
		
		
	}

}
