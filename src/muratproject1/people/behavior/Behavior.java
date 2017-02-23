package muratproject1.people.behavior;

import java.util.Random;

public abstract class Behavior {
	
	public Behavior(){
		
	}
	
	public abstract int getMinDays();
	public abstract int getMaxDays();
	
	public abstract int moviesToRent(int maxMovies);
	
	public int daysToRent(){
		
		if(getMinDays() == getMaxDays()){
			return getMaxDays();
		}
		else{
			return new Random().nextInt(getMaxDays() - getMinDays() + 1) + getMaxDays();
		}
	}
}
