import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void mainFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
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
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 827, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("House Saving\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				HouseSaving house=new HouseSaving();
				house.houseSavingFrame();
			}
		});
		btnNewButton.setBounds(76, 117, 191, 62);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewspaper = new JButton("Newspaper\r\n");
		btnNewspaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NewsPaper add=new NewsPaper();
				add.NewspaperFrame();
				
			}
		});
		btnNewspaper.setBounds(76, 213, 191, 62);
		frame.getContentPane().add(btnNewspaper);
		
		JButton btnAdditionalUsage = new JButton("Additional Usage\r\n");
		btnAdditionalUsage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Additional add=new Additional();
				add.additionalFrame();
			}
		});
		btnAdditionalUsage.setBounds(76, 323, 191, 62);
		frame.getContentPane().add(btnAdditionalUsage);
		
		JButton btnBills = new JButton("Bills\r\n");
		btnBills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Bills b=new Bills();
				b.billsFrame();
				
			}
		});
		btnBills.setBounds(524, 117, 191, 62);
		frame.getContentPane().add(btnBills);
		
		JButton btnNotification = new JButton("Search");
		btnNotification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Search s=new Search();
				s.SearchFrame();
			}
		});
		btnNotification.setBounds(524, 323, 191, 62);
		frame.getContentPane().add(btnNotification);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setToolTipText("Household Management\r\n");
		panel.setBackground(Color.BLUE);
		panel.setBounds(10, 11, 791, 82);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblHouseholdManagement = new JLabel("Household management");
		lblHouseholdManagement.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblHouseholdManagement.setBounds(256, 11, 340, 60);
		panel.add(lblHouseholdManagement);
		
		JButton btnTable = new JButton("Table");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				HomeShowTable s=new HomeShowTable();
				s.HomeShowTableFrame();
				
			}
		});
		btnTable.setBounds(524, 213, 191, 62);
		frame.getContentPane().add(btnTable);
	}
}
