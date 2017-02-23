package muratproject1.people.behavior;

public class Hoarder extends Behavior{
	
	private final int moviesRentalSize = 3;
	
	public Hoarder(){
		
	}
	
	public int getMinDays(){
		return 7;
	}
	public int getMaxDays(){
		return 7;
	}
	
	public int moviesToRent(int maxMovies){
		if(maxMovies >= moviesRentalSize){
			return moviesRentalSize;
		}
		else{
			return 0;
		}
	}
}
