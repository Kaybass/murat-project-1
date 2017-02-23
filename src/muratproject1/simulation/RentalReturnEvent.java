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
	
	public ArrayList<String> getMoviesRented(){
		return moviesRented;
	}
	
	public int getDaysRented(){
		return daysRented;
	}
	
	public double getMoneyMade(){
		return moneyMade;
	}
}
