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

	public ArrayList<Rental> getRentals() {
		return Rentals;
	}

	public void addRental(Rental rental) {
		Rentals.add(rental);
	}
}
