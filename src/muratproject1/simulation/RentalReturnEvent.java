package muratproject1.simulation;

import java.util.ArrayList;

public class RentalReturnEvent {
	
	private ArrayList<String> moviesRented;
	private int daysRented;
	private double moneyMade;
	
	public RentalReturnEvent(ArrayList<String> moviesRented,int daysRented,double moneyMade){
		this.moviesRented = moviesRented;
		this.daysRented = daysRented;
		this.moneyMade = moneyMade;
	}
	
	public double getMoney(){
		return moneyMade;
	}
	
	@Override
	public String toString(){
		String result = "\n";
		
		for (String movieName : moviesRented) {
			result += "Movies Rented:   " + movieName + "\n";
		}
		
		result += "Days for Rental: " + Integer.toString(daysRented) + "\n";
		result += "Money Made:      " + Double.toString(moneyMade) + "\n";

		return result;
	}
}
