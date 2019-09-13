import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Notification {

	private JFrame frame;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notification window = new Notification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void NotificationFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notification window = new Notification();
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
	public Notification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calendar mCalendar = Calendar.getInstance();    
		String month = mCalendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		System.out.println(month);
		String l1="You haven't pay your electric bill of "+month;
		String l2="You haven't pay your water bill of "+month;
		String l3="You haven't pay your gas bill of "+month;
		String l4="Haven't save the incoming issues of "+month;
	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 835, 604);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(10, 85, 799, 396);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label1 = new JLabel(l1);
		label1.setFont(new Font("Courier New", Font.BOLD, 24));
		label1.setForeground(Color.RED);
		label1.setBounds(26, 11, 763, 65);
		panel.add(label1);
		
		JLabel label2 = new JLabel(l2);
		label2.setFont(new Font("Courier New", Font.BOLD, 24));
		label2.setForeground(Color.RED);
		label2.setBounds(26, 100, 763, 65);
		panel.add(label2);
		
		JLabel label3 = new JLabel(l3);
		label3.setFont(new Font("Courier New", Font.BOLD, 24));
		label3.setForeground(Color.RED);
		label3.setBounds(26, 188, 763, 75);
		panel.add(label3);
		
		JLabel label4 = new JLabel(l4);
		label4.setFont(new Font("Courier New", Font.BOLD, 24));
		label4.setForeground(Color.RED);
		label4.setBounds(26, 291, 763, 75);
		panel.add(label4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(10, 11, 799, 63);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNotification = new JLabel("Notification");
		lblNotification.setForeground(Color.BLUE);
		lblNotification.setFont(new Font("FrankRuehl", Font.BOLD, 21));
		lblNotification.setBounds(266, 11, 197, 41);
		panel_1.add(lblNotification);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(10, 492, 809, 63);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				NotificationNext n=new NotificationNext();
				n.NotificationNextFrame();
			}
		});
		btnNext.setBounds(633, 11, 149, 41);
		panel_2.add(btnNext);
	}

}
