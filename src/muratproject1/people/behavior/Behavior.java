package muratproject1.people.behavior;

import java.util.Random;

public abstract class Behavior {
	
	public Behavior(){
		
	}
	
	public abstract int getMin();
	public abstract int getMax();
	
	public int moviesToRent(int maxMovies){
		if(getMax() < maxMovies){
			return new Random().nextInt(getMax() - getMin() + 1) + getMax();
		}
		else if(getMin() > maxMovies){
			return new Random().nextInt(maxMovies - getMin() + 1) + maxMovies;
		}
		else{
			return 0;
		}
	}
}
