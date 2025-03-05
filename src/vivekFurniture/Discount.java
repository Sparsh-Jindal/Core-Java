package vivekFurniture;

public class Discount {

	public double calculateDiscount(Bero bObj) {
		if(bObj instanceof SteelBero) {
			return (bObj.getPrice()*10)/100;
		}
		if(bObj instanceof WoodenBero) {
			return (bObj.getPrice()*15)/100;
		}
		return 0;
	}
}
