package muratproject1.simulation;

import java.util.ArrayList;

import muratproject1.products.Movie;
import muratproject1.products.types.Comedy;
import muratproject1.products.types.Drama;
import muratproject1.products.types.Horror;
import muratproject1.products.types.NewRelease;
import muratproject1.products.types.Romance;

public class Simulator {
	
	public Simulator(){
		
	}
	
	public Report runSimulation(int days){
		
		//initialize report
		Report report = new Report();
		
		//initialize the movies with the video store inventory
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		// Add 4 Comedy Movies
		movies.add(new Movie("Airplane!", new Comedy()));
		movies.add(new Movie("Back to the Future", new Comedy()));
		movies.add(new Movie("Monty Python and the Holy Grail", new Comedy()));
		movies.add(new Movie("Pineapple Express", new Comedy()));
		
		// Add 4 Drama Movies
		movies.add(new Movie("The Shawshank Redemption", new Drama()));
		movies.add(new Movie("The Godfather", new Drama()));
		movies.add(new Movie("The Godfather: Part II", new Drama()));
		
		// Add 4 Horror Movies
		movies.add(new Movie("The Hills Have Eyes", new Horror()));
		
		// Add 4 New Release Movies
		
		// Add 4 Romance Movies
		
		// initialize store
		Store store = new Store();
		
		
		
		//run
		for(int i = 0; i < days; i++){
			
			//do sim
			
			// Check for Rental returns
			
			
			// Customers come in
		}
		
		
		return report;
	}
}
