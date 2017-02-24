package muratproject1.simulation;

import java.util.ArrayList;

import muratproject1.people.Customer;

public class RentalReturnEvent {
	
	private ArrayList<String> moviesRented;
	private Customer customer;
	private int daysRented;
	private double moneyMade;
	
	public RentalReturnEvent(ArrayList<String> moviesRented,Customer customer,int daysRented,double moneyMade){
		this.moviesRented = moviesRented;
		this.customer = customer;
		this.daysRented = daysRented;
		this.moneyMade = moneyMade;
	}
	
	public double getMoney(){
		return moneyMade;
	}
	
	@Override
	public String toString() {
		String result = "\nRental Log: New Rental\n" + 
				"Customer: " + customer.toString() +
				"Movies Rented:\n";
		
		for (String movieName : moviesRented) {
			result += "\t- " + movieName + "\n";
		}
		
		result += "Days for Rental: " + Integer.toString(daysRented) + "\n";
		result += "Money Made:      " + Double.toString(moneyMade) + "\n";

		return result;
	}
}
