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
		
		return "--END OF SIMULATION--\n" +
				moviesCurrentlyInStore() +
				moneyMade() +
				completedRentals() +
				activeRentals();
	}
	
	String moviesCurrentlyInStore() {
		
		String string = "There are currently " + FinalAvailableInventory.size() + " movies in the store's inventory.\n"
				+ "Movies remaining in inventory are as follows:\n";
		
		for (int i=0; i < FinalAvailableInventory.size(); i++) {
			string += "\tMovie Name: " + FinalAvailableInventory.get(i).getName() + ", which is a " + FinalAvailableInventory.get(i).getType() + " movie.\n\n";
		}
		
		return string;
	}
	
	String moneyMade() {
		
		double money = 0;
		
		for(int i=0; i < returnEvents.size(); i++) {
			
			money += returnEvents.get(i).getMoneyMade();
		}
		
		return "In total, the store had made $" + money + " since this software started tracking transactions.\n\n";
	}
	
	String completedRentals() {
		
		String string = "Every rental transaction that has occured is as follows: \n";
		
		for(int i=0; i < returnEvents.size(); i++) {
			
			string += "\tMovie Name: " + returnEvents.get(i).getMovieRented() + "\n" +
					"\t\tDays Rented: " + returnEvents.get(i).getDaysRented() + "\n" +
					"\t\tTotal Amount for Rental: " + returnEvents.get(i).getMoneyMade() + "\n\n";
		}
		
		return string;
	}
	
	String activeRentals() {
		
		String string = "There are currently " + FinalOpenRentals.size() + " rentals out from the store.\n"
				+ "Rentals currently taken out are as follows:\n";
		
		for (int i=0; i < FinalOpenRentals.size(); i++) {
			string += "\tMovie Name: " + FinalOpenRentals.get(i).rentedMovie.getName() + "\n" +
					"\t\tDays Rented" + FinalOpenRentals.get(i).getDaysRented() + "\n" +
					"\t\tTotal Amount for Rental: " + FinalOpenRentals.get(i).rentedMovie.getMoneyDue(FinalOpenRentals.get(i).getDaysRented()) + "\n\n";
		}
		
		return string;
	}
}
