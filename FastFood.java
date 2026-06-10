
public class FastFood extends FoodItem_Base{

	public FastFood(String name, int q) {
		super(name, q);
		price = 2000;
		discount = 10;
	}
	@Override
	public double calculateBill() {
		discount = price * 0.10;   //10% discount on fast food
		double bill = (price*quantity) - discount;
		return bill;
	}
}
