
public class orderCake extends Cake {

	private double weight;

	public orderCake(String n, double r, double w) {
		super(n, r);
		weight = w;
	}

	@Override
	public double calcPrice() {
		return rate * weight;
	}
	
	public String toString() {
		return super.toString() + "\t" + weight;
	}
}
