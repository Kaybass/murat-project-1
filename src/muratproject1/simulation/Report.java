package muratproject1.simulation;

import java.util.ArrayList;

import muratproject1.products.Movie;
import muratproject1.transaction.Rental;

public class Report {
	
	private ArrayList<RentalReturnEvent> returnEvents;
	private ArrayList<Rental> FinalOpenRentals;
	private ArrayList<Movie> FinalAvailableInventory;
	
	public Report(){
		
	}
	
	public void addRentalReturnEvent(Rental rental){
		
		
	}
	
	public void setFinalOpenRentals(ArrayList<Rental> rentals){
		FinalOpenRentals = rentals;
	}
	
	public void setFinalAvailableInventory(ArrayList<Movie> movies){
		FinalAvailableInventory = movies;
	}
	
	@Override
	public String toString(){
		return "";
	}
}
