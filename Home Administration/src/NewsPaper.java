import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;


public class NewsPaper {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewsPaper window = new NewsPaper();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void NewspaperFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewsPaper window = new NewsPaper();
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
	public NewsPaper() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 763, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Prothom Alo", "The Bangladesh Today", "The Observer", "The Daily Star", "The Independent"}));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBounds(152, 77, 402, 50);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = comboBox.getSelectedItem().toString();
				Paper p=new Paper();
		        if(value=="Prothom Alo"){
		        	p.prothom();
		        }
		        else if(value=="The Bangladesh Today"){
		        	p.today();
		        }
                else if(value=="The Observer"){
                	p.observer();
		        }
               else if(value=="The Daily Star"){
		        	p.star();
		        }
               else if(value=="The Independent"){
		        	p.independent();
		        }
				
			}
		});
		btnNewButton.setBounds(262, 184, 191, 105);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainPage main=new MainPage();
				main.mainFrame();
			
			}
		});
		btnNewButton_1.setBounds(580, 364, 132, 30);
		frame.getContentPane().add(btnNewButton_1);
	}

}
