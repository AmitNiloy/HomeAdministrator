import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Search {

	private JFrame frame;
	private JTextField outputelec;
	private JTextField outputwater;
	private JTextField outputgas;
	private JTextField outputwages;
	private JTextField outputtax;
	private JTextField outputadd;
	private JTextField outputbank;
	private JTextField inputdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search window = new Search();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void SearchFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search window = new Search();
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
	public Search() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 826, 705);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblElectricBill = new JLabel("Electric Bill  :\r\n");
		lblElectricBill.setBounds(125, 255, 75, 43);
		frame.getContentPane().add(lblElectricBill);
		
		JLabel lblWaterBill = new JLabel("Water Bill  :");
		lblWaterBill.setBounds(125, 309, 75, 43);
		frame.getContentPane().add(lblWaterBill);
		
		JLabel lblGasBill = new JLabel("Gas Bill  :\r\n");
		lblGasBill.setBounds(125, 363, 75, 43);
		frame.getContentPane().add(lblGasBill);
		
		JLabel lblWages = new JLabel("Wages  :");
		lblWages.setBounds(125, 417, 75, 43);
		frame.getContentPane().add(lblWages);
		
		JLabel lblTax = new JLabel("Tax  :\r\n");
		lblTax.setBounds(125, 471, 75, 43);
		frame.getContentPane().add(lblTax);
		
		JLabel lblAdditionalStorage = new JLabel("Additional Usage :\r\n");
		lblAdditionalStorage.setBounds(96, 525, 107, 43);
		frame.getContentPane().add(lblAdditionalStorage);
		
		JLabel lblBankStorage = new JLabel("Bank Storage :\r\n");
		lblBankStorage.setBounds(96, 579, 94, 43);
		frame.getContentPane().add(lblBankStorage);
		
		outputelec = new JTextField();
		outputelec.setColumns(10);
		outputelec.setBounds(206, 262, 200, 28);
		frame.getContentPane().add(outputelec);
		
		outputwater = new JTextField();
		outputwater.setColumns(10);
		outputwater.setBounds(206, 316, 200, 28);
		frame.getContentPane().add(outputwater);
		
		outputgas = new JTextField();
		outputgas.setColumns(10);
		outputgas.setBounds(206, 370, 200, 28);
		frame.getContentPane().add(outputgas);
		
		outputwages = new JTextField();
		outputwages.setColumns(10);
		outputwages.setBounds(210, 424, 200, 28);
		frame.getContentPane().add(outputwages);
		
		outputtax = new JTextField();
		outputtax.setColumns(10);
		outputtax.setBounds(206, 478, 200, 28);
		frame.getContentPane().add(outputtax);
		
		outputadd = new JTextField();
		outputadd.setColumns(10);
		outputadd.setBounds(206, 532, 200, 28);
		frame.getContentPane().add(outputadd);
		
		outputbank = new JTextField();
		outputbank.setColumns(10);
		outputbank.setBounds(206, 586, 200, 28);
		frame.getContentPane().add(outputbank);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainPage main=new MainPage();
				main.mainFrame();
			}
		});
		btnBack.setBounds(34, 633, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.GRAY);
		desktopPane.setBounds(10, 14, 790, 230);
		frame.getContentPane().add(desktopPane);
		
		JLabel lblSearchOptions = new JLabel("Search Options  :");
		lblSearchOptions.setForeground(Color.MAGENTA);
		lblSearchOptions.setFont(new Font("FrankRuehl", Font.PLAIN, 33));
		lblSearchOptions.setBounds(263, 11, 304, 47);
		desktopPane.add(lblSearchOptions);
		
		JLabel lblEnterMonth = new JLabel("Enter Month  :");
		lblEnterMonth.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEnterMonth.setForeground(Color.BLACK);
		lblEnterMonth.setBounds(24, 77, 121, 47);
		desktopPane.add(lblEnterMonth);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setBounds(155, 86, 200, 32);
		desktopPane.add(comboBox);
		
		JLabel lblEnterYear = new JLabel("Enter Year  :");
		lblEnterYear.setForeground(Color.BLACK);
		lblEnterYear.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEnterYear.setBounds(24, 142, 121, 47);
		desktopPane.add(lblEnterYear);
		
		inputdate = new JTextField();
		inputdate.setColumns(10);
		inputdate.setBounds(155, 153, 200, 28);
		desktopPane.add(inputdate);
		
		JButton btnNewButton = new JButton("Search\r\n");
		btnNewButton.setBounds(544, 179, 89, 23);
		desktopPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				String value = comboBox.getSelectedItem().toString();
				String year=(inputdate.getText());
				String month="Jan";
				if(value=="January"){
		        	month="Jan";
		        }
		        else if(value=="February"){
		        	month="Feb";
		        }
                else if(value=="March"){
                	month="Mar";
		        }
               else if(value=="April"){
            	   month="Apr";
		        }
               else if(value=="May"){
            	   month="May";
		        }
               else if(value=="June"){
            	   month="Jun";
		        }   
               else if(value=="July"){
		        	month="Jul";
		        }   
               else if(value=="August"){
		        	month="Aug";
		        }   
               else if(value=="September"){
		        	month="Sep";
		        }   
               else if(value=="October"){
		        	month="Oct";
		        }   
               else if(value=="November"){
		        	month="Nov";
		        }   
               else if(value=="December"){
		        	month="Dec";
		        }   
				String date=month+"."+year;
				System.out.println(date);
			        HomeDaoImplement home=new HomeDaoImplement();
			        Houseinfo house=(home.selectBydate(date));
			        System.out.println(house.getElectric_Bill());
			        System.out.println(house.getWater_Bill());
			        System.out.println(house.getGas_Bill());
			        System.out.println(house.getTax());
			        System.out.println(house.getWages());
			        System.out.println(house.getAdditional_Usage());
			        System.out.println(house.getBank_Storage());
			        
			        String elecBill=String.format("%2f",house.getElectric_Bill());
			        String waterBill=String.format("%2f",house.getWater_Bill());
			        String gasBill=String.format("%2f",house.getGas_Bill());
			        String tax=String.format("%2f",house.getTax());
			        String wages=String.format("%2f",house.getWages());
			        String add=String.format("%2f",house.getAdditional_Usage());
			        String bank=String.format("%2f",house.getBank_Storage());
			        
			        outputelec.setText(elecBill);
			        outputgas.setText(gasBill);
			        outputwater.setText(waterBill);
			        outputtax.setText(tax);
			        outputwages.setText(wages);
			        outputadd.setText(add);
			        outputbank.setText(bank);
				
				
				
			}
		});
	}
}
