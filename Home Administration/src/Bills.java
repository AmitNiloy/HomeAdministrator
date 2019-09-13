import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Bills {

	private JFrame frame;
	private JTextField elecTextField;
	private JTextField waterTextField;
	private JTextField gasTextField;
	private JTextField totaltextField;

	/**
	 * Launch the application.
	 */
	public static void billsFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bills window = new Bills();
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
	public Bills() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 711, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblElectricity = new JLabel("Electricity  :");
		lblElectricity.setBounds(67, 87, 67, 43);
		frame.getContentPane().add(lblElectricity);
		
		JLabel lblWater = new JLabel("Water  :\r\n");
		lblWater.setBounds(67, 139, 67, 43);
		frame.getContentPane().add(lblWater);
		
		JLabel lblGas = new JLabel("Gas  :");
		lblGas.setBounds(67, 195, 67, 43);
		frame.getContentPane().add(lblGas);
		
		elecTextField = new JTextField();
		elecTextField.setBounds(144, 83, 200, 50);
		frame.getContentPane().add(elecTextField);
		elecTextField.setColumns(10);
		
		waterTextField = new JTextField();
		waterTextField.setColumns(10);
		waterTextField.setBounds(144, 139, 200, 50);
		frame.getContentPane().add(waterTextField);
		
		gasTextField = new JTextField();
		gasTextField.setColumns(10);
		gasTextField.setBounds(144, 195, 200, 50);
		frame.getContentPane().add(gasTextField);
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double ele=Double.parseDouble(elecTextField.getText());
		          double water=Double.parseDouble(waterTextField.getText());
		            double gas=Double.parseDouble(gasTextField.getText());
		            
		            double total=(ele+water+gas);
		            String Total=String.format("%.2f",total);
		            totaltextField.setText(Total);

		 
			}
		});
		btnOkay.setBounds(481, 254, 89, 23);
		frame.getContentPane().add(btnOkay);
		
		JLabel lblTotal = new JLabel("Total  :");
		lblTotal.setBounds(67, 310, 41, 43);
		frame.getContentPane().add(lblTotal);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainPage main=new MainPage();
				main.mainFrame();
		
			}
		});
		btnBack.setBounds(481, 356, 89, 23);
		frame.getContentPane().add(btnBack);
		
		totaltextField = new JTextField();
		totaltextField.setColumns(10);
		totaltextField.setBounds(114, 303, 200, 50);
		frame.getContentPane().add(totaltextField);
	}

}
