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


public class Monthly {

	private JFrame frame;
	private JTextField wagtxt;
	private JTextField billtxt;
	private JTextField addtxt;
	private JTextField banktxt;
	private JTextField taxtxt;
	private JTextField SavingText;
	private JTextField SpendingText;
	private JTextField inputyear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monthly window = new Monthly();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void MonthlyFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monthly window = new Monthly();
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
	public Monthly() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 825, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monthly Wages  :");
		lblNewLabel.setBounds(115, 280, 104, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblBills = new JLabel("                   Bills  :\r\n");
		lblBills.setBounds(115, 331, 93, 49);
		frame.getContentPane().add(lblBills);
		
		JLabel lblAdditionalStorage = new JLabel("Additional Storage:");
		lblAdditionalStorage.setBounds(115, 391, 104, 49);
		frame.getContentPane().add(lblAdditionalStorage);
		
		JLabel lblBankStorage = new JLabel("      Bank Storage :");
		lblBankStorage.setBounds(126, 451, 93, 49);
		frame.getContentPane().add(lblBankStorage);
		
		wagtxt = new JTextField();
		wagtxt.setBounds(229, 290, 224, 29);
		frame.getContentPane().add(wagtxt);
		wagtxt.setColumns(10);
		
		billtxt = new JTextField();
		billtxt.setColumns(10);
		billtxt.setBounds(229, 341, 224, 29);
		frame.getContentPane().add(billtxt);
		
		addtxt = new JTextField();
		addtxt.setColumns(10);
		addtxt.setBounds(229, 401, 224, 29);
		frame.getContentPane().add(addtxt);
		
		banktxt = new JTextField();
		banktxt.setColumns(10);
		banktxt.setBounds(229, 461, 224, 29);
		frame.getContentPane().add(banktxt);
		
		taxtxt = new JTextField();
		taxtxt.setColumns(10);
		taxtxt.setBounds(218, 555, 224, 29);
		frame.getContentPane().add(taxtxt);
		
		JLabel lblTax = new JLabel("               Tax :");
		lblTax.setBounds(115, 545, 93, 49);
		frame.getContentPane().add(lblTax);
		
		JButton btnNewButton = new JButton("Okay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bill=Double.parseDouble(billtxt.getText());
	            double bank=Double.parseDouble(banktxt.getText());
	            double add=Double.parseDouble(addtxt.getText());
	            double wages=Double.parseDouble(wagtxt.getText());
	            
	            double tax=0;
	            double save=(bill+bank+add+tax);
	            double out=(wages-save);
	            if (wages>=100000){
	            	tax=(5*wages)/100;
	            }
	            String Tax=String.format("%.2f",tax);
	            String Save=String.format("%.2f",save);
	            String Out=String.format("%.2f",out);
	            
	            taxtxt.setText(Tax);
	            SavingText.setText(Out);
	            SpendingText.setText(Save);
	            
			}
		});
		btnNewButton.setBounds(640, 494, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblMoneySaving = new JLabel("  Money Saving :");
		lblMoneySaving.setBounds(115, 614, 93, 49);
		frame.getContentPane().add(lblMoneySaving);
		
		JLabel lblMoneySpending = new JLabel("  Money Spending:");
		lblMoneySpending.setBounds(115, 670, 93, 49);
		frame.getContentPane().add(lblMoneySpending);
		
		SavingText = new JTextField();
		SavingText.setColumns(10);
		SavingText.setBounds(218, 624, 224, 29);
		frame.getContentPane().add(SavingText);
		
		SpendingText = new JTextField();
		SpendingText.setColumns(10);
		SpendingText.setBounds(218, 680, 224, 29);
		frame.getContentPane().add(SpendingText);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				HouseSaving h=new HouseSaving();
				h.houseSavingFrame();
			}
		});
		btnBack.setBounds(651, 683, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.GRAY);
		desktopPane.setBounds(10, 11, 790, 258);
		frame.getContentPane().add(desktopPane);
		
		JLabel label = new JLabel("Search Options  :");
		label.setForeground(Color.MAGENTA);
		label.setFont(new Font("FrankRuehl", Font.PLAIN, 33));
		label.setBounds(263, 11, 304, 47);
		desktopPane.add(label);
		
		JLabel label_1 = new JLabel("Enter Month  :");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label_1.setBounds(24, 77, 121, 47);
		desktopPane.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setBounds(155, 86, 200, 32);
		desktopPane.add(comboBox);
		
		JLabel label_2 = new JLabel("Enter Year  :");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label_2.setBounds(24, 142, 121, 47);
		desktopPane.add(label_2);
		
		inputyear = new JTextField();
		inputyear.setColumns(10);
		inputyear.setBounds(155, 153, 200, 28);
		desktopPane.add(inputyear);
		
		JButton btnNewButton_1 = new JButton("     Check data");
		btnNewButton_1.setBounds(34, 200, 321, 23);
		desktopPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = comboBox.getSelectedItem().toString();
				String year=(inputyear.getText());
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
		        
		        double bill=house.getElectric_Bill()+house.getWater_Bill()+house.getGas_Bill();
		        
		        String Bill=String.format("%2f",bill);
		        String tax=String.format("%2f",house.getTax());
		        String wages=String.format("%2f",house.getWages());
		        String add=String.format("%2f",house.getAdditional_Usage());
		        String bank=String.format("%2f",house.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        billtxt.setText(Bill);
		        taxtxt.setText(tax);
		        wagtxt.setText(wages);
		        addtxt.setText(add);
		        banktxt.setText(bank);
		        
			}
		});
	}

}
