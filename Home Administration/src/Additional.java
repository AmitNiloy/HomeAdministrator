import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Additional {

	private JFrame frame;
	private JTextField shoppingtxt;
	private JTextField cartxt;
	private JTextField extratxt;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void additionalFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Additional window = new Additional();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Additional() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Car fuel  :\r\n");
		lblNewLabel.setBounds(64, 176, 78, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblShoppingList = new JLabel("Shopping list  :");
		lblShoppingList.setBounds(45, 123, 97, 42);
		frame.getContentPane().add(lblShoppingList);
		
		JLabel lblExtra = new JLabel("Extra   :\r\n\r\n");
		lblExtra.setBounds(64, 229, 78, 42);
		frame.getContentPane().add(lblExtra);
		
		shoppingtxt = new JTextField();
		shoppingtxt.setBounds(152, 123, 200, 42);
		frame.getContentPane().add(shoppingtxt);
		shoppingtxt.setColumns(10);
		
		cartxt = new JTextField();
		cartxt.setColumns(10);
		cartxt.setBounds(152, 176, 200, 42);
		frame.getContentPane().add(cartxt);
		
		extratxt = new JTextField();
		extratxt.setColumns(10);
		extratxt.setBounds(152, 229, 200, 42);
		frame.getContentPane().add(extratxt);
		
		JButton btnNewButton = new JButton("Okay\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Sh=Double.parseDouble(shoppingtxt.getText());
	            double Cf=Double.parseDouble(cartxt.getText());
	            double x=Double.parseDouble(extratxt.getText());
	            
	            double total=(Sh+Cf+x);
	            String Total=String.format("%.2f",total);
	            result.setText(Total);
			
			
			
			
			}
		});
		btnNewButton.setBounds(515, 279, 114, 47);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblTotal = new JLabel("Total   :\r\n\r\n");
		lblTotal.setBounds(78, 337, 45, 42);
		frame.getContentPane().add(lblTotal);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainPage main=new MainPage();
				main.mainFrame();
			}
		});
		btnNewButton_1.setBounds(515, 389, 114, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 11, 769, 80);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAdditionalUsage = new JLabel("Additional Usage");
		lblAdditionalUsage.setForeground(Color.BLUE);
		lblAdditionalUsage.setFont(new Font("Trebuchet MS", Font.PLAIN, 29));
		lblAdditionalUsage.setBounds(254, 11, 424, 58);
		panel.add(lblAdditionalUsage);
		
		result = new JTextField();
		result.setColumns(10);
		result.setBounds(125, 337, 200, 42);
		frame.getContentPane().add(result);
	}

}
