package muratproject1.simulation;

public class RentalReturnEvent {
	
	private String moviesRented;
	private int daysRented;
	private double moneyMade;
	
	public RentalReturnEvent(String moviesRented,int daysRented,double moneyMade){
		this.moviesRented = moviesRented;
		this.daysRented = daysRented;
		this.moneyMade = moneyMade;
	}
	
	@Override
	public String toString(){
		String result = "\n";
		
		result += "Movies Rented:   " + moviesRented + "\n";
		result += "Days for Rental: " + Integer.toString(daysRented) + "\n";
		result += "Money Made:      " + Double.toString(moneyMade) + "\n";

		return result;
	}
}
