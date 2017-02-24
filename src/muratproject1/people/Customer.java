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
	
	public int numActiveRentals() {
		
		return activeRentals;
	}

	public String getName() {
		
		return Name;
	}
	
	public int getDaysToRent() {
		return customerBehavior.daysToRent();
	}
	
	public boolean isRenting() {
		
		if(activeRentals > 0)
		{
			return true;
		}
		
		return false;
	}
	
	public int moviesToRent(int moviesAvailable) {
		
		return customerBehavior.moviesToRent(moviesAvailable);
	}
	
	public void newRental(int numMovies) {
		
		activeRentals += numMovies;
	}
	
	public void returnRental(int numMovies) {
		
		activeRentals -= numMovies;
	}

}
