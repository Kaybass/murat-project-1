package muratproject1.simulation;

public class RentalReturnEvent {
	
	private String movieRented;
	private int daysRented;
	private double moneyMade;
	
	public RentalReturnEvent(String movieRented,int daysRented,double moneyMade){
		this.movieRented = movieRented;
		this.daysRented = daysRented;
		this.moneyMade = moneyMade;
	}
	
	public String getMovieRented(){
		return movieRented;
	}
	
	public int getDaysRented(){
		return daysRented;
	}
	
	public double getMoneyMade(){
		return moneyMade;
	}
}
