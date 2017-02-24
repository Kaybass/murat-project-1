package muratproject1.people.behavior;

import java.util.Random;

//Cheesy Breezy make it Fast and Easy
public class Breezy extends Behavior{
	
	
	
	public Breezy(){
		
	}
	
	public int getMinDays(){
		return 1;
	}
	public int getMaxDays(){
		return 2;
	}
	
	public int moviesToRent(int maxMovies){
		int moviesRentalSize = new Random().nextInt(2 + 1);
		if(maxMovies >= moviesRentalSize){
			return moviesRentalSize;
		}
		else{
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Breezy";
	}
}
