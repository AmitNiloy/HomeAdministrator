import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HouseSaving {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void houseSavingFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseSaving window = new HouseSaving();
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
	public HouseSaving() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 811, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWhatYouWanted = new JLabel("What you wanted to know ?\r\n");
		lblWhatYouWanted.setForeground(Color.RED);
		lblWhatYouWanted.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblWhatYouWanted.setBackground(Color.GREEN);
		lblWhatYouWanted.setBounds(190, 11, 581, 66);
		frame.getContentPane().add(lblWhatYouWanted);
		
		JButton btnNewButton = new JButton("Monthly");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Monthly mon=new Monthly();
				mon.MonthlyFrame();
				
			}
		});
		btnNewButton.setBounds(221, 118, 225, 87);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAnnual = new JButton("Annual\r\n");
		btnAnnual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Annual anl=new Annual();
				anl.AnnualFrame();
			}
		});
		btnAnnual.setBounds(221, 233, 225, 87);
		frame.getContentPane().add(btnAnnual);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainPage main=new MainPage();
				main.mainFrame();
			}
		});
		btnBack.setBounds(631, 378, 89, 32);
		frame.getContentPane().add(btnBack);
	}

}
