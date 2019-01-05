
public class cakeTest {
	public static void main(String[] args) {
		Cake[] cakes = new Cake[20];
		for (int i = 0; i < 10; i++)
			cakes[i] = new readyMadeCake("Ready Made Cake " + i, 10, Math.random() * 10);
		for (int i = 0; i < 10; i++)
			cakes[i + 10] = new orderCake("Order Cake " + i, 20, Math.random() * 10);
		double sumTotal = 0, sumReady = 0;
		Cake max = cakes[0];
		for (Cake c : cakes) {
			sumTotal += c.calcPrice();
			if (c instanceof readyMadeCake)
				sumReady += c.calcPrice();
			if (c.calcPrice() > max.calcPrice())
				max = c;
		}
		System.out.println("Total cake price: " + sumTotal);
		System.out.println("Total ready made price: " + sumReady);
		System.out.println("Cake sold for highest price: " + max);
	}
}
