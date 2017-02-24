package muratproject1.people;

import java.util.ArrayList;

import muratproject1.products.Movie;
import muratproject1.transaction.Rental;

public class Store {
	
	// Initialize Inventory
	private ArrayList<Movie> Movies;
	
	// Initialize a Rental list
	private ArrayList<Rental> Rentals;

	// Initialize Customer List
	ArrayList<Customer> Customers = new ArrayList<>();
	
	// Public Constructor
	public Store(ArrayList<Movie> movies, ArrayList<Customer> customers){
		
		setMovies(movies);

		setCustomers(customers);
		
		// Initialize Rentals to a new ArrayList
		Rentals = new ArrayList<>();
	}
	
	public int numMovies() {
		
		return Movies.size();
	}
	
	public Movie getMovie(int index) {
		
		return Movies.get(index);
	}
	
	public ArrayList<Movie> getMovies() {
		return Movies;
	}

	private void setMovies(ArrayList<Movie> movies) {
		Movies = movies;
	}
	
	private void setCustomers(ArrayList<Customer> customers) {
		Customers = customers;
	}
	
	public Customer getCustomer(int index) {
		return Customers.get(index);
	}
	
	public int numRentals() {
		
		return Rentals.size();
	}
	
	public ArrayList<Rental> getRentals() {
		return Rentals;
	}

	public Rental getRental(int index) {
		return Rentals.get(index);
	}
	
	/**
	 * When a Movie is rented, it must be
	 * 		- Added to Rentals
	 * 		- Removed from Movies
	 * 
	 */
	public void rentMovie(int customerIndex, int movieIndex, int daysToRent) {
		
		Rental rental = new Rental(
				Customers.get(customerIndex), 
				Movies.get(movieIndex), 
				daysToRent);
		
		Rentals.add(rental);
		
		Customers.get(customerIndex).rentMovie();
		
		Movies.remove(movieIndex);
	}
	
	/**
	 * When a Movie is returned, it must be
	 * 		- Removed from Rentals
	 * 		- Added to Movies
	 */
	public void returnRental(int index) {
		
		Movies.add(Rentals.get(index).rentedMovie);
		
		Rentals.get(index).customer.returnMovie();
		
		Rentals.remove(index);
	}
}
