package muratproject1.people.behavior;

import java.util.Random;

public class Regular extends Behavior{
	
	public Regular(){
		
	}
	
	public int getMinDays(){
		return 3;
	}
	public int getMaxDays(){
		return 5;
	}
	
	public int moviesToRent(int maxMovies) {
		int moviesRentalSize = new Random().nextInt(maxMovies + 1);
		if(maxMovies >= moviesRentalSize){
			return moviesRentalSize;
		}
		else{
			return 0;
		}
	}
}
