
public class TraditionalFood extends FoodItem_Base{

	public TraditionalFood(String name, int q) {
		super(name, q);
		price = 1000;
		discount = 15;
	}
	@Override
	public double calculateBill() {
		discount = price * 0.15;   //15% discount on traditional food
		double bill = (price*quantity) - discount;
		return bill;
	}
}
