package muratproject1.products.types;

public abstract class Type {
	
	public abstract double getMultiplier();
	
	public double calculatePrice(int daysRented){
		return daysRented * getMultiplier();
	}
	
	@Override
	public abstract String toString();
}
