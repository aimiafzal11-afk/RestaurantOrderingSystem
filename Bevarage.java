
public class Bevarage extends FoodItem_Base{

	public Bevarage(String name, int q) {
		super(name, q);
		price = 200;
		discount = 5;
	}
	
@Override
public double calculateBill() {
	discount = price * 0.5;   //5% discount on beverages
	double bill = (price*quantity) - discount;
	return bill;
}
}
