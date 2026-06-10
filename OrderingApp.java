import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OrderingApp extends JFrame implements ActionListener{
	JPanel inputPanel, btnPanel;
	JTextArea output;
	JTextField name, quantity;
	JButton btn;
	JComboBox <String> category;

	public OrderingApp() {
		setTitle("Restaurant Ordering System");
		setSize(400, 250);
		setLayout(new BorderLayout());
		
		inputPanel = new JPanel((new GridLayout(3,2)));
		btnPanel = new JPanel();
		output = new JTextArea(4, 30);
		
		name = new JTextField("");
		quantity = new JTextField("");
		btn = new JButton("Calculate Bill");
		category = new JComboBox(new String[] {"Fast Food", "Traditional Food", "Beverage"});
		
		inputPanel.add(new JLabel("Name: "));
		inputPanel.add(name);
		inputPanel.add(new JLabel("Quantity: "));
		inputPanel.add(quantity);
		inputPanel.add(new JLabel("Food Type: "));
		inputPanel.add(category);
		
		btnPanel.add(btn);
		
		add(inputPanel, BorderLayout.NORTH);
		add(btnPanel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		
		btn.addActionListener(this);
        setVisible(true);
		
	}

	public static void main(String[] args) {
		new OrderingApp();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String n = name.getText();
		int q = Integer.parseInt(quantity.getText());
		String type = (String)category.getSelectedItem();
		
		FoodItem_Base obj;
		if(type.equals("Fast Food"))
			obj = new FastFood(n, q);
		else if(type.equals("Traditional Food"))
			obj = new TraditionalFood(n, q);
		else
			obj = new Bevarage(n, q);
		
		double bill = obj.calculateBill();
		output.setText("Item Name: " + n +
				"\nQuantity: " + q +
				"\nType: " + type +
				"\nPrice: " + obj.price +
				"\nDiscount: " + obj.discount +
				"\nTotal Bill: " + bill
				);
		}

}
