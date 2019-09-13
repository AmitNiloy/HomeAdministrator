import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class AddToDatabase {

	private JFrame frame;
	private JTextField electext;
	private JTextField watertext;
	private JTextField gastext;
	private JTextField wagestext;
	private JTextField banktext;
	private JTextField addtext;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddToDatabase window = new AddToDatabase();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void AddToDatabaseFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddToDatabase window = new AddToDatabase();
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
	public AddToDatabase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblElectricBill = new JLabel("Electric Bill  :\r\n");
		lblElectricBill.setBounds(123, 101, 100, 35);
		frame.getContentPane().add(lblElectricBill);
		
		JLabel lblWaterBill = new JLabel("Water Bill  :\r\n");
		lblWaterBill.setBounds(123, 151, 100, 35);
		frame.getContentPane().add(lblWaterBill);
		
		JLabel lblGasBill = new JLabel("Gas Bill  :");
		lblGasBill.setBounds(123, 208, 100, 35);
		frame.getContentPane().add(lblGasBill);
		
		JLabel lblTax = new JLabel("Wages  :");
		lblTax.setBounds(123, 254, 100, 35);
		frame.getContentPane().add(lblTax);
		
		JLabel lblAdditionalUsage = new JLabel("Additional Usage :\r\n");
		lblAdditionalUsage.setBounds(123, 355, 100, 35);
		frame.getContentPane().add(lblAdditionalUsage);
		
		JLabel lblBankStorage = new JLabel("Bank Storage  :");
		lblBankStorage.setBounds(123, 401, 100, 35);
		frame.getContentPane().add(lblBankStorage);
		
		electext = new JTextField();
		electext.setColumns(10);
		electext.setBounds(231, 101, 200, 35);
		frame.getContentPane().add(electext);
		
		watertext = new JTextField();
		watertext.setColumns(10);
		watertext.setBounds(231, 151, 200, 35);
		frame.getContentPane().add(watertext);
		
		gastext = new JTextField();
		gastext.setColumns(10);
		gastext.setBounds(229, 208, 200, 35);
		frame.getContentPane().add(gastext);
		
		wagestext = new JTextField();
		wagestext.setColumns(10);
		wagestext.setBounds(229, 254, 200, 35);
		frame.getContentPane().add(wagestext);
		
		banktext = new JTextField();
		banktext.setColumns(10);
		banktext.setBounds(229, 401, 200, 35);
		frame.getContentPane().add(banktext);
		
		addtext = new JTextField();
		addtext.setColumns(10);
		addtext.setBounds(229, 355, 200, 35);
		frame.getContentPane().add(addtext);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Calendar mCalendar = Calendar.getInstance();    
				String mth = mCalendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
				try {
					File file=new File("sakib.txt");
					PrintWriter output = new PrintWriter(file);

					output.println(mth);
					output.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				/**************database********************/
				Calendar cal = Calendar.getInstance();
		           String month=new SimpleDateFormat("MMM").format(cal.getTime());
		           String year=new SimpleDateFormat("YYYY").format(cal.getTime());
		           String date=month+"."+year;
				//String date =(datetext.getText());
			       double electric_bill=Double.parseDouble(electext.getText());;
			       double water_bill=Double.parseDouble(watertext.getText());;
			       double gas_bill=Double.parseDouble(gastext.getText());;
			       double tax = 0;
			       double wages =Double.parseDouble(wagestext.getText());;
			       double addition=Double.parseDouble(addtext.getText());
			       double bank=Double.parseDouble(banktext.getText());;
			       if (wages>=100000){
		            	tax=(5*wages)/100;
		            }
			       
			       Houseinfo hhh = new Houseinfo(date,electric_bill,water_bill,gas_bill,tax,wages, addition,bank);       
			       HomeDaoImplement d=new HomeDaoImplement();
			       d.insert(hhh);
		}
		});
		btnNewButton.setBounds(602, 475, 100, 35);
		frame.getContentPane().add(btnNewButton);
		
		btnBack = new JButton("Back\r\n");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainPage main=new MainPage();
				main.mainFrame();
			}
		});
		btnBack.setBounds(73, 475, 100, 35);
		frame.getContentPane().add(btnBack);
	}

}
