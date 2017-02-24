package muratproject1.products.types;

public class NewRelease extends Type {
	
	public NewRelease(){
		
	}
	
	public double getMultiplier(){
		return 7.0;
	}
	
	@Override
	public String toString() {
		return "New Release";
	}
}
