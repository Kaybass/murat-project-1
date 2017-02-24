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
	public Store(ArrayList<Movie> movies, ArrayList<Customer> customers) {
		
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
	public void newRental(Customer customer, ArrayList<Movie> movies, int daysToRent) {
		
		// Create a new Rental
		Rental rental = new Rental(customer, movies, daysToRent);
		
		// Add the new Rental to Rentals
		Rentals.add(rental);
		
		// Update the renting customer
		for(Customer match : Customers) {
			
			if (match == customer) {
				customer.newRental(movies.size());
			}
		}
		
		// Remove the rented movies from the inventory list.
		for(Movie movie : movies) {
			Movies.remove(movie);
		}
	}
	
	/**
	 * When a Movie is returned, it must be
	 * 		- Removed from Rentals
	 * 		- Added to Movies
	 */
	public void returnRental(int rentalIndex) {
		
		// Update the renting customer
		Rentals.get(rentalIndex).getCustomer().returnRental(Rentals.get(rentalIndex).getMovies().size());
		
		// Add the returned videos to Movies
		for(Movie movie : Rentals.get(rentalIndex).getMovies()) {
			Movies.add(movie);
		}
		
		// Remove the Rental from Rentals
		Rentals.remove(rentalIndex);
	}
}
