package muratproject1.people;

import java.util.ArrayList;

import muratproject1.products.Movie;
import muratproject1.transaction.Rental;

public class Store {
	
	private ArrayList<Movie> Movies;
	
	private ArrayList<Rental> Rentals;
	
	public Store(ArrayList<Movie> movies){
		
		setMovies(movies);
		
		// Initialize Rentals to a new ArrayList
		setRentals(new ArrayList<>());
	}
	
	public int numMovies() {
		
		return Movies.size();
	}
	
	public Movie getMovie(String movieName) {
		
		for(int i = 0; i < Movies.size(); i++) {
			if(Movies.get(i).getName() == movieName) {
				return Movies.get(i);
			}
		}
		
		return null;
	}
	
	public Movie getMovie(int index) {
		
		return Movies.get(index);
	}

	private void setMovies(ArrayList<Movie> movies) {
		Movies = movies;
	}
	
	public int numRentals() {
		
		return Rentals.size();
	}

	public Rental getRental(int index) {
		return Rentals.get(index);
	}
	
	public Rental getRental(String movieName) {
		
		for(int i = 0; i < Rentals.size(); i++) {
			if(Rentals.get(i).rentedMovie.getName() == movieName) {
				return Rentals.get(i);
			}
		}
		
		return null;
			
	}

	public void returnRental(int index) {
		
		Movies.add(Rentals.get(index).rentedMovie);
		
		Rentals.remove(index);
	}

	public void rentMovie(int movieIndex, int daysToRent) {
		
		Rental rental = new Rental(Movies.get(movieIndex), daysToRent);
		
		Rentals.add(rental);
		
		Movies.remove(movieIndex);
	}
	
	private void setRentals(ArrayList<Rental> rentals) {
		Rentals = rentals;
	}
}
