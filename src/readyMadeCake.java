
public class readyMadeCake extends Cake {

	private double quantity;
	
	public readyMadeCake(String n, double r, double q) {
		super(n, r);
		quantity = q;
	}

	@Override
	public double calcPrice() {
		return rate * quantity;
	}
	
	public String toString() {
		return super.toString() + "\t" + quantity;
	}
}
