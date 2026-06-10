
public class FoodItem_Base {
	protected String itemName;
	public double price;
	protected int quantity;
	public double discount;
	
	public double calculateBill() {
		return 0;
	}

	public FoodItem_Base(String name, int q) {
		itemName = name;
		quantity = q;
	}

	public static void main(String[] args) {
		

	}

}
