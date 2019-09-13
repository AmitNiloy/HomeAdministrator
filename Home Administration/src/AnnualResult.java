import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AnnualResult {

	private JFrame frame;
    private static double bill;
    private static double wages;
    private static double add;
    private static double bank;
    private static double save;
    private static double spend;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnnualResult window = new AnnualResult();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void AnnualResultFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnnualResult window = new AnnualResult();
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
	public void SetTotalBill(double bill){
		this.bill=bill;
	}
	public void SetTotalWages(double wages){
		this.wages=wages;
	}
	public void SetTotalAdd(double add){
		this.add=add;
	}
	public void SetTotalBank(double bank){
		this.bank=bank;
	}
	public void SetTotalSave(double saving){
		save=saving;
	}
	public void SetTotalSpend(double using){
		spend=using;
	}
	
	public AnnualResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

        String SAVE=String.format("%2f",save);
        String WAGES=String.format("%2f",wages);
        String ADD=String.format("%2f",add);
        String BANK=String.format("%2f",bank);
        String BILL=String.format("%2f",bill);
        String SPEND=String.format("%2f",spend);
        
		JLabel lblNewLabel = new JLabel("Total wages is "+WAGES+" taka");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(27, 57, 655, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Total bill is "+BILL+" taka");
		label.setForeground(Color.RED);
		label.setBounds(27, 118, 655, 37);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Bank has total "+BANK+" taka");
		label_1.setForeground(Color.BLUE);
		
		label_1.setBounds(27, 177, 655, 37);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Total additional usage is "+ADD+" taka");
		label_2.setForeground(Color.RED);
		label_2.setBounds(27, 231, 655, 37);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Total save of the without bank "+SAVE+" taka");
		label_3.setForeground(Color.BLUE);
		label_3.setBounds(27, 291, 655, 37);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Total spend of the year "+SPEND+" taka");
		label_4.setForeground(Color.RED);
		label_4.setBounds(27, 339, 655, 37);
		frame.getContentPane().add(label_4);
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnOkay.setBounds(454, 387, 103, 29);
		frame.getContentPane().add(btnOkay);
	}
}
