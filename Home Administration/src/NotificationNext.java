import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.Color;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotificationNext {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotificationNext window = new NotificationNext();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void NotificationNextFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotificationNext window = new NotificationNext();
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
	public NotificationNext() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Date now=new Date();
	    
		DateFormat df3=DateFormat.getDateInstance(DateFormat.LONG);
		String s3=df3.format(now);
		System.out.println("today is "+s3);
     
		frame = new JFrame();
		frame.setBounds(100, 100, 727, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("If you pay your bills then insert the data to next :");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel.setBounds(25, 234, 472, 78);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Next\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddToDatabase add=new AddToDatabase();
				add.AddToDatabaseFrame();
			}
		});
		btnNewButton.setBounds(530, 258, 135, 38);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("Today is "+s3+" but you haven't pay your bills");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label.setBounds(25, 60, 640, 138);
		frame.getContentPane().add(label);
		
		JLabel lblNorBackTo = new JLabel("Nor back to main menu :");
		lblNorBackTo.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNorBackTo.setBounds(25, 327, 472, 78);
		frame.getContentPane().add(lblNorBackTo);
		
		JButton btnMainMenu = new JButton("Main menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainPage main=new MainPage();
				main.mainFrame();

			}
		});
		btnMainMenu.setBounds(530, 334, 135, 38);
		frame.getContentPane().add(btnMainMenu);
	}

}
