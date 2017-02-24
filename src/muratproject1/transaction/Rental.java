package muratproject1.transaction;

import java.util.ArrayList;

import muratproject1.people.Customer;
import muratproject1.products.Movie;

/**
 * Each time a customer comes into the store, a Rental is created that will
 * keep track of what videos they rented and how many nights they will keep
 * the videos. A customer rents the "group" of videos and returns them all
 * at the same time. They will NOT, for example, rent three videos and then
 * return one after 2 days, the second after 5 days, and the third after
 * seven days. They will instead return all of the videos they rented at the
 * specified time. (That means, for instance, that a customer will never be
 * late in returning their videos.)
 * @author Alex
 *
 */
public class Rental {
	
	private ArrayList<Movie> Movies;
	
	private int daysLeft;
	
	private int daysRented;
	
	private Customer customer;
	
	public Rental(Customer rentingCustomer, ArrayList<Movie> movie, int daysToRent) {
		
		customer = rentingCustomer;
		
		Movies = movie;
		
		daysLeft = daysRented = daysToRent;
	}
	
	public int dayPassedHowManyAreLeft() {
		
		daysLeft--;
		
		return daysLeft;
	}
	
	public int getDaysRented() {
		
		return daysRented;
	}
	
	public ArrayList<Movie> getMovies(){
		return Movies;
	}
	
	@Override
	public String toString(){
		String result = "";
		
		result += "Customer: " + customer.getName();
		
		result += "Movies Rented: ";
		for(Movie each : Movies){
			result += "\n" + each.toString();
		}
		
		return result;
	}
}
