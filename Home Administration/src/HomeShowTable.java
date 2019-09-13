import java.awt.EventQueue;

import javax.swing.JFrame;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HomeShowTable {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeShowTable window = new HomeShowTable();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void HomeShowTableFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeShowTable window = new HomeShowTable();
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
	DefaultTableModel model;
    HomeDaoImplement sdi;
    private JTable table;
    private JButton btnNewButton;
	public HomeShowTable() {
		model = new DefaultTableModel(new Object[] {"Date","Electric Bill","Water Bill","Gas Bill","Tax","Wages","Additional Usage","Bank Storage"},0);
        sdi = new HomeDaoImplement();
        List<Houseinfo> houses = new ArrayList<Houseinfo>();
        houses = sdi.selectAll();
        for(Houseinfo htu:houses) {
            model.addRow(new Object[] {htu.getDate(),htu.getElectric_Bill(),htu.getWater_Bill(),htu.getGas_Bill(),htu.getTax(),htu.getWages(),htu.getAdditional_Usage(),htu.getBank_Storage()});
        }
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(88, 88, 613, 323);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				MainPage m=new MainPage();
				m.mainFrame();
			}
		});
		btnNewButton.setBounds(629, 422, 145, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
