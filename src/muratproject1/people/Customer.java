package muratproject1.people;

import muratproject1.people.behavior.Behavior;
import muratproject1.transaction.Rental;

public class Customer {
	
	private Rental activeRental;
	private String Name;
	private Behavior customerBehavior;
	private boolean isRenting;
	
	public Customer(Rental rental, String name, Behavior behavior){
		activeRental = rental;
		Name = name;
		customerBehavior = behavior;
		isRenting = false;
	}

}
