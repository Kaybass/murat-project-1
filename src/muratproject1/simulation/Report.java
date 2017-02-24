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
		double dosh = 0;
		
		result += "Completed Rentals for this period\n";
		for(RentalReturnEvent each : returnEvents){
			dosh += each.getMoney();
			
			result += each.toString();
		}
		result += "\n\nCurrent Open rentals at end of period:\n";
		for(Rental each : FinalOpenRentals){
			result += each.toString();
		}
		result += "\n\nMovies in inventory at end of period\n";
		for(Movie each : FinalAvailableInventory){
			result += each.toString();
		}
		result += "\n\nRental earnings for current period:" + Double.toString(dosh);
		
		return result;
	}
}
