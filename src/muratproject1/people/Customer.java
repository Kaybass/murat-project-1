package muratproject1.people;

import muratproject1.people.behavior.Behavior;

public class Customer {
	
	private int activeRentals;
	private String Name;
	private Behavior customerBehavior;
	
	public Customer(String name, Behavior behavior){
		
		activeRentals = 0;
		Name = name;
		customerBehavior = behavior;
	}
	
	public void rentMovie() {
		
		activeRentals++;
	}
	
	public void returnMovie() {
		
		activeRentals--;
	}

	public String getName() {
		
		return Name;
	}
	
	public int numActiveRentals() {
		
		return activeRentals;
	}
	
	public boolean isRenting() {
		
		if(activeRentals > 0)
		{
			return true;
		}
		
		return false;
	}
	
	public int getDaysToRent() {
		return customerBehavior.daysToRent();
	}

}
