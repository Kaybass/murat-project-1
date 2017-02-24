package muratproject1.simulation;

import java.util.ArrayList;

import muratproject1.products.Movie;
import muratproject1.transaction.Rental;

public class Report {
	
	private ArrayList<RentalReturnEvent> returnEvents;
	private ArrayList<Rental> FinalOpenRentals;
	private ArrayList<Movie> FinalAvailableInventory;
	
	public Report(ArrayList<RentalReturnEvent> rentalReturnEvents, ArrayList<Rental> finalRentals, ArrayList<Movie> finalMovies){
		
		returnEvents = rentalReturnEvents;
		
		setFinalOpenRentals(finalRentals);
		
		setFinalAvailableInventory(finalMovies);
	}
	
	public void setFinalOpenRentals(ArrayList<Rental> rentals){
		
		FinalOpenRentals = rentals;
	}
	
	public void setFinalAvailableInventory(ArrayList<Movie> movies){
		
		FinalAvailableInventory = movies;
	}
	
	@Override
	public String toString(){
		String result = "";
	}
}
