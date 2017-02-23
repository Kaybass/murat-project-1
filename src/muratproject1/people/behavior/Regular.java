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
	
	public int moviesToRent(int maxMovies){
		return new Random().nextInt(3) + 1;
	}
}
