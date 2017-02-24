package muratproject1.products;

import muratproject1.products.types.Type;

public class Movie {
	
	private Type movieType;
	
	private String Name;
	
	public Movie(String name, Type type){
		movieType = type;
		Name = name;
	}
	
	public double getMoneyDue(int daysRented){
		return movieType.calculatePrice(daysRented);
	}
	
	public String getName(){
		return Name;
	}
	
	public void changeType(Type type){
		movieType = type;
	}
	
	@Override
	public String toString(){
		return "\t- " + Name + " (" + movieType.toString() + ")\n";
	}
}
