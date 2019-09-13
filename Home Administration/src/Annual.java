import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Annual {

	private JFrame frame;
	private JTextField janwages;
	private JTextField janbills;
	private JTextField janadd;
	private JTextField janbank;
	private JTextField jantax;
	private JTextField febwages;
	private JTextField febbills;
	private JTextField febadd;
	private JTextField febbank;
	private JTextField febtax;
	private JTextField marwages;
	private JTextField marbills;
	private JTextField maradd;
	private JTextField marbank;
	private JTextField martax;
	private JTextField aprwages;
	private JTextField aprbills;
	private JTextField apradd;
	private JTextField aprbank;
	private JTextField aprtax;
	private JTextField maywages;
	private JTextField maybills;
	private JTextField mayadd;
	private JTextField maybank;
	private JTextField maytax;
	private JTextField junwages;
	private JTextField junbills;
	private JTextField junadd;
	private JTextField junbank;
	private JTextField juntax;
	private JTextField julwages;
	private JTextField julbills;
	private JTextField juladd;
	private JTextField julbank;
	private JTextField jultax;
	private JTextField augwages;
	private JTextField augbills;
	private JTextField augadd;
	private JTextField augbank;
	private JTextField augtax;
	private JTextField sepwages;
	private JTextField sepbills;
	private JTextField sepadd;
	private JTextField sepbank;
	private JTextField septax;
	private JTextField octwages;
	private JTextField octbills;
	private JTextField octadd;
	private JTextField octbank;
	private JTextField octtax;
	private JTextField novwages;
	private JTextField novbills;
	private JTextField novadd;
	private JTextField novbank;
	private JTextField novtax;
	private JTextField decwages;
	private JTextField decbills;
	private JTextField decadd;
	private JTextField decbank;
	private JTextField dectax;
	private JTextField inputyear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Annual window = new Annual();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void AnnualFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Annual window = new Annual();
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
	public Annual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1386, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Monthly Wages  :");
		label.setBounds(10, 54, 93, 20);
		frame.getContentPane().add(label);
		
		JLabel lblBills = new JLabel("    Bills  :\r\n");
		lblBills.setBounds(0, 85, 93, 20);
		frame.getContentPane().add(lblBills);
		
		JLabel lblAdditionals = new JLabel("Additionals :");
		lblAdditionals.setBounds(10, 116, 93, 20);
		frame.getContentPane().add(lblAdditionals);
		
		JLabel lblBankStorage = new JLabel("Bank Storage :");
		lblBankStorage.setBounds(10, 150, 93, 20);
		frame.getContentPane().add(lblBankStorage);
		
		JLabel lblTax = new JLabel("   Tax :");
		lblTax.setBounds(10, 181, 86, 20);
		frame.getContentPane().add(lblTax);
		
		JLabel label_1 = new JLabel("Monthly Wages  :");
		label_1.setBounds(285, 54, 93, 20);
		frame.getContentPane().add(label_1);
		
		JLabel lblAdditionals_1 = new JLabel("Additionals :");
		lblAdditionals_1.setBounds(284, 116, 86, 20);
		frame.getContentPane().add(lblAdditionals_1);
		
		JLabel label_2 = new JLabel("    Bills  :\r\n");
		label_2.setBounds(285, 85, 93, 20);
		frame.getContentPane().add(label_2);
		
		JLabel label_5 = new JLabel("Bank Storage :");
		label_5.setBounds(285, 150, 71, 20);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("   Tax :");
		label_6.setBounds(285, 181, 86, 20);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Monthly Wages  :");
		label_7.setBounds(577, 54, 104, 20);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("    Bills  :\r\n");
		label_8.setBounds(577, 85, 93, 20);
		frame.getContentPane().add(label_8);
		
		JLabel lblAdditionals_2 = new JLabel("Additionals :");
		lblAdditionals_2.setBounds(577, 116, 93, 20);
		frame.getContentPane().add(lblAdditionals_2);
		
		JLabel label_10 = new JLabel("Bank Storage :");
		label_10.setBounds(577, 147, 93, 20);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("   Tax :");
		label_11.setBounds(577, 181, 93, 20);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Monthly Wages  :");
		label_12.setBounds(832, 54, 86, 20);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("    Bills  :\r\n");
		label_13.setBounds(832, 85, 86, 20);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("Additional Storage:");
		label_14.setBounds(832, 116, 93, 20);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("Bank Storage :");
		label_15.setBounds(832, 150, 93, 20);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("   Tax :");
		label_16.setBounds(832, 181, 93, 20);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("Monthly Wages  :");
		label_17.setBounds(1098, 54, 93, 20);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("    Bills  :\r\n");
		label_18.setBounds(1098, 85, 93, 20);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("Additional Storage:");
		label_19.setBounds(1098, 116, 93, 20);
		frame.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("Bank Storage :");
		label_20.setBounds(1098, 150, 93, 20);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("   Tax :");
		label_21.setBounds(1108, 181, 83, 20);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("Monthly Wages  :");
		label_22.setBounds(10, 509, 93, 20);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("    Bills  :\r\n");
		label_23.setBounds(10, 540, 93, 20);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("Additional Storage:");
		label_24.setBounds(10, 588, 93, 20);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("Bank Storage :");
		label_25.setBounds(10, 629, 93, 20);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("   Tax :");
		label_26.setBounds(10, 660, 86, 20);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("Monthly Wages  :");
		label_27.setBounds(10, 284, 93, 20);
		frame.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("    Bills  :\r\n");
		label_28.setBounds(0, 315, 93, 20);
		frame.getContentPane().add(label_28);
		
		JLabel label_29 = new JLabel("Additional Storage:");
		label_29.setBounds(10, 346, 86, 20);
		frame.getContentPane().add(label_29);
		
		JLabel label_30 = new JLabel("Bank Storage :");
		label_30.setBounds(10, 392, 83, 20);
		frame.getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel("   Tax :");
		label_31.setBounds(10, 423, 93, 20);
		frame.getContentPane().add(label_31);
		
		JLabel label_32 = new JLabel("   Tax :");
		label_32.setBounds(274, 423, 86, 20);
		frame.getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel("Bank Storage :");
		label_33.setBounds(274, 392, 93, 20);
		frame.getContentPane().add(label_33);
		
		JLabel label_34 = new JLabel("Additional Storage:");
		label_34.setBounds(274, 346, 93, 20);
		frame.getContentPane().add(label_34);
		
		JLabel label_35 = new JLabel("    Bills  :\r\n");
		label_35.setBounds(270, 315, 93, 20);
		frame.getContentPane().add(label_35);
		
		JLabel label_36 = new JLabel("Monthly Wages  :");
		label_36.setBounds(270, 284, 93, 20);
		frame.getContentPane().add(label_36);
		
		JLabel label_37 = new JLabel("   Tax :");
		label_37.setBounds(577, 423, 77, 20);
		frame.getContentPane().add(label_37);
		
		JLabel label_38 = new JLabel("Bank Storage :");
		label_38.setBounds(566, 387, 93, 20);
		frame.getContentPane().add(label_38);
		
		JLabel label_39 = new JLabel("Additional Storage:");
		label_39.setBounds(566, 346, 93, 20);
		frame.getContentPane().add(label_39);
		
		JLabel label_40 = new JLabel("    Bills  :\r\n");
		label_40.setBounds(566, 315, 93, 20);
		frame.getContentPane().add(label_40);
		
		JLabel label_41 = new JLabel("Monthly Wages  :");
		label_41.setBounds(566, 284, 93, 20);
		frame.getContentPane().add(label_41);
		
		JLabel label_42 = new JLabel("   Tax :");
		label_42.setBounds(821, 423, 93, 20);
		frame.getContentPane().add(label_42);
		
		JLabel label_43 = new JLabel("Bank Storage :");
		label_43.setBounds(821, 387, 93, 20);
		frame.getContentPane().add(label_43);
		
		JLabel label_44 = new JLabel("Additional Storage:");
		label_44.setBounds(821, 346, 93, 20);
		frame.getContentPane().add(label_44);
		
		JLabel label_45 = new JLabel("    Bills  :\r\n");
		label_45.setBounds(821, 315, 93, 20);
		frame.getContentPane().add(label_45);
		
		JLabel label_46 = new JLabel("Monthly Wages  :");
		label_46.setBounds(821, 284, 93, 20);
		frame.getContentPane().add(label_46);
		
		JLabel label_47 = new JLabel("   Tax :");
		label_47.setBounds(1098, 423, 93, 20);
		frame.getContentPane().add(label_47);
		
		JLabel label_48 = new JLabel("Bank Storage :");
		label_48.setBounds(1098, 387, 93, 20);
		frame.getContentPane().add(label_48);
		
		JLabel label_49 = new JLabel("Additional Storage:");
		label_49.setBounds(1098, 346, 86, 20);
		frame.getContentPane().add(label_49);
		
		JLabel lblBills_1 = new JLabel("  Bills  :\r\n");
		lblBills_1.setBounds(1098, 315, 86, 20);
		frame.getContentPane().add(lblBills_1);
		
		JLabel label_51 = new JLabel("Monthly Wages  :");
		label_51.setBounds(1098, 284, 93, 20);
		frame.getContentPane().add(label_51);
		
		JLabel label_3 = new JLabel("Monthly Wages  :");
		label_3.setBounds(253, 509, 93, 20);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("   Tax :");
		label_4.setBounds(253, 660, 93, 20);
		frame.getContentPane().add(label_4);
		
		JLabel label_9 = new JLabel("Additional Storage:");
		label_9.setBounds(253, 577, 103, 20);
		frame.getContentPane().add(label_9);
		
		JLabel label_50 = new JLabel("Bank Storage :");
		label_50.setBounds(253, 617, 93, 20);
		frame.getContentPane().add(label_50);
		
		JLabel label_52 = new JLabel("    Bills  :\r\n");
		label_52.setBounds(253, 543, 93, 20);
		frame.getContentPane().add(label_52);
		
		janwages = new JTextField();
		janwages.setBounds(103, 54, 117, 20);
		frame.getContentPane().add(janwages);
		janwages.setColumns(10);
		
		janbills = new JTextField();
		janbills.setColumns(10);
		janbills.setBounds(103, 85, 117, 20);
		frame.getContentPane().add(janbills);
		
		janadd = new JTextField();
		janadd.setColumns(10);
		janadd.setBounds(103, 116, 117, 20);
		frame.getContentPane().add(janadd);
		
		janbank = new JTextField();
		janbank.setColumns(10);
		janbank.setBounds(103, 150, 117, 20);
		frame.getContentPane().add(janbank);
		
		jantax = new JTextField();
		jantax.setColumns(10);
		jantax.setBounds(103, 181, 117, 20);
		frame.getContentPane().add(jantax);
		
		febwages = new JTextField();
		febwages.setColumns(10);
		febwages.setBounds(380, 54, 117, 20);
		frame.getContentPane().add(febwages);
		
		febbills = new JTextField();
		febbills.setColumns(10);
		febbills.setBounds(380, 85, 117, 20);
		frame.getContentPane().add(febbills);
		
		febadd = new JTextField();
		febadd.setColumns(10);
		febadd.setBounds(380, 116, 117, 20);
		frame.getContentPane().add(febadd);
		
		febbank = new JTextField();
		febbank.setColumns(10);
		febbank.setBounds(380, 150, 117, 20);
		frame.getContentPane().add(febbank);
		
		febtax = new JTextField();
		febtax.setColumns(10);
		febtax.setBounds(381, 181, 117, 20);
		frame.getContentPane().add(febtax);
		
		marwages = new JTextField();
		marwages.setColumns(10);
		marwages.setBounds(668, 54, 117, 20);
		frame.getContentPane().add(marwages);
		
		marbills = new JTextField();
		marbills.setColumns(10);
		marbills.setBounds(668, 85, 117, 20);
		frame.getContentPane().add(marbills);
		
		maradd = new JTextField();
		maradd.setColumns(10);
		maradd.setBounds(668, 116, 117, 20);
		frame.getContentPane().add(maradd);
		
		marbank = new JTextField();
		marbank.setColumns(10);
		marbank.setBounds(668, 150, 117, 20);
		frame.getContentPane().add(marbank);
		
		martax = new JTextField();
		martax.setColumns(10);
		martax.setBounds(668, 181, 117, 20);
		frame.getContentPane().add(martax);
		
		aprwages = new JTextField();
		aprwages.setColumns(10);
		aprwages.setBounds(924, 54, 117, 20);
		frame.getContentPane().add(aprwages);
		
		aprbills = new JTextField();
		aprbills.setColumns(10);
		aprbills.setBounds(924, 85, 117, 20);
		frame.getContentPane().add(aprbills);
		
		apradd = new JTextField();
		apradd.setColumns(10);
		apradd.setBounds(924, 116, 117, 20);
		frame.getContentPane().add(apradd);
		
		aprbank = new JTextField();
		aprbank.setColumns(10);
		aprbank.setBounds(924, 150, 117, 20);
		frame.getContentPane().add(aprbank);
		
		aprtax = new JTextField();
		aprtax.setColumns(10);
		aprtax.setBounds(924, 181, 117, 20);
		frame.getContentPane().add(aprtax);
		
		maywages = new JTextField();
		maywages.setColumns(10);
		maywages.setBounds(1191, 54, 117, 20);
		frame.getContentPane().add(maywages);
		
		maybills = new JTextField();
		maybills.setColumns(10);
		maybills.setBounds(1191, 85, 117, 20);
		frame.getContentPane().add(maybills);
		
		mayadd = new JTextField();
		mayadd.setColumns(10);
		mayadd.setBounds(1191, 116, 117, 20);
		frame.getContentPane().add(mayadd);
		
		maybank = new JTextField();
		maybank.setColumns(10);
		maybank.setBounds(1191, 150, 117, 20);
		frame.getContentPane().add(maybank);
		
		maytax = new JTextField();
		maytax.setColumns(10);
		maytax.setBounds(1191, 181, 117, 20);
		frame.getContentPane().add(maytax);
		
		junwages = new JTextField();
		junwages.setColumns(10);
		junwages.setBounds(103, 284, 117, 20);
		frame.getContentPane().add(junwages);
		
		junbills = new JTextField();
		junbills.setColumns(10);
		junbills.setBounds(103, 315, 117, 20);
		frame.getContentPane().add(junbills);
		
		junadd = new JTextField();
		junadd.setColumns(10);
		junadd.setBounds(103, 346, 117, 20);
		frame.getContentPane().add(junadd);
		
		junbank = new JTextField();
		junbank.setColumns(10);
		junbank.setBounds(103, 392, 117, 20);
		frame.getContentPane().add(junbank);
		
		juntax = new JTextField();
		juntax.setColumns(10);
		juntax.setBounds(103, 423, 117, 20);
		frame.getContentPane().add(juntax);
		
		julwages = new JTextField();
		julwages.setColumns(10);
		julwages.setBounds(380, 284, 117, 20);
		frame.getContentPane().add(julwages);
		
		julbills = new JTextField();
		julbills.setColumns(10);
		julbills.setBounds(380, 315, 117, 20);
		frame.getContentPane().add(julbills);
		
		juladd = new JTextField();
		juladd.setColumns(10);
		juladd.setBounds(380, 346, 117, 20);
		frame.getContentPane().add(juladd);
		
		julbank = new JTextField();
		julbank.setColumns(10);
		julbank.setBounds(380, 392, 117, 20);
		frame.getContentPane().add(julbank);
		
		jultax = new JTextField();
		jultax.setColumns(10);
		jultax.setBounds(380, 423, 117, 20);
		frame.getContentPane().add(jultax);
		
		augwages = new JTextField();
		augwages.setColumns(10);
		augwages.setBounds(668, 284, 117, 20);
		frame.getContentPane().add(augwages);
		
		augbills = new JTextField();
		augbills.setColumns(10);
		augbills.setBounds(668, 315, 117, 20);
		frame.getContentPane().add(augbills);
		
		augadd = new JTextField();
		augadd.setColumns(10);
		augadd.setBounds(668, 346, 117, 20);
		frame.getContentPane().add(augadd);
		
		augbank = new JTextField();
		augbank.setColumns(10);
		augbank.setBounds(668, 392, 117, 20);
		frame.getContentPane().add(augbank);
		
		augtax = new JTextField();
		augtax.setColumns(10);
		augtax.setBounds(668, 423, 117, 20);
		frame.getContentPane().add(augtax);
		
		sepwages = new JTextField();
		sepwages.setColumns(10);
		sepwages.setBounds(920, 284, 117, 20);
		frame.getContentPane().add(sepwages);
		
		sepbills = new JTextField();
		sepbills.setColumns(10);
		sepbills.setBounds(920, 315, 117, 20);
		frame.getContentPane().add(sepbills);
		
		sepadd = new JTextField();
		sepadd.setColumns(10);
		sepadd.setBounds(920, 346, 117, 20);
		frame.getContentPane().add(sepadd);
		
		sepbank = new JTextField();
		sepbank.setColumns(10);
		sepbank.setBounds(920, 392, 117, 20);
		frame.getContentPane().add(sepbank);
		
		septax = new JTextField();
		septax.setColumns(10);
		septax.setBounds(920, 423, 117, 20);
		frame.getContentPane().add(septax);
		
		octwages = new JTextField();
		octwages.setColumns(10);
		octwages.setBounds(1191, 284, 117, 20);
		frame.getContentPane().add(octwages);
		
		octbills = new JTextField();
		octbills.setColumns(10);
		octbills.setBounds(1190, 315, 117, 20);
		frame.getContentPane().add(octbills);
		
		octadd = new JTextField();
		octadd.setColumns(10);
		octadd.setBounds(1191, 346, 117, 20);
		frame.getContentPane().add(octadd);
		
		octbank = new JTextField();
		octbank.setColumns(10);
		octbank.setBounds(1191, 387, 117, 20);
		frame.getContentPane().add(octbank);
		
		octtax = new JTextField();
		octtax.setColumns(10);
		octtax.setBounds(1191, 423, 117, 20);
		frame.getContentPane().add(octtax);
		
		novwages = new JTextField();
		novwages.setColumns(10);
		novwages.setBounds(103, 509, 117, 20);
		frame.getContentPane().add(novwages);
		
		novbills = new JTextField();
		novbills.setColumns(10);
		novbills.setBounds(103, 540, 117, 20);
		frame.getContentPane().add(novbills);
		
		novadd = new JTextField();
		novadd.setColumns(10);
		novadd.setBounds(103, 588, 117, 20);
		frame.getContentPane().add(novadd);
		
		novbank = new JTextField();
		novbank.setColumns(10);
		novbank.setBounds(103, 629, 117, 20);
		frame.getContentPane().add(novbank);
		
		novtax = new JTextField();
		novtax.setColumns(10);
		novtax.setBounds(102, 660, 117, 20);
		frame.getContentPane().add(novtax);
		
		decwages = new JTextField();
		decwages.setColumns(10);
		decwages.setBounds(352, 509, 117, 20);
		frame.getContentPane().add(decwages);
		
		decbills = new JTextField();
		decbills.setColumns(10);
		decbills.setBounds(352, 540, 117, 20);
		frame.getContentPane().add(decbills);
		
		decadd = new JTextField();
		decadd.setColumns(10);
		decadd.setBounds(352, 577, 117, 20);
		frame.getContentPane().add(decadd);
		
		decbank = new JTextField();
		decbank.setColumns(10);
		decbank.setBounds(352, 617, 117, 20);
		frame.getContentPane().add(decbank);
		
		dectax = new JTextField();
		dectax.setColumns(10);
		dectax.setBounds(352, 660, 117, 20);
		frame.getContentPane().add(dectax);
		
		JLabel lblJanuary = new JLabel("January :\r\n");
		lblJanuary.setBounds(10, 11, 93, 20);
		frame.getContentPane().add(lblJanuary);
		
		JLabel lblFebruary = new JLabel("February :");
		lblFebruary.setBounds(285, 11, 93, 20);
		frame.getContentPane().add(lblFebruary);
		
		JLabel lblMarch = new JLabel("March :");
		lblMarch.setBounds(577, 11, 93, 20);
		frame.getContentPane().add(lblMarch);
		
		JLabel lblApril = new JLabel("April :");
		lblApril.setBounds(821, 14, 93, 20);
		frame.getContentPane().add(lblApril);
		
		JLabel lblMay_1 = new JLabel("May :");
		lblMay_1.setBounds(1091, 14, 93, 20);
		frame.getContentPane().add(lblMay_1);
		
		JLabel lblMay = new JLabel("June :");
		lblMay.setBounds(10, 245, 93, 20);
		frame.getContentPane().add(lblMay);
		
		JLabel lblJune = new JLabel("July :");
		lblJune.setBounds(270, 245, 93, 20);
		frame.getContentPane().add(lblJune);
		
		JLabel lblJuly = new JLabel("August :");
		lblJuly.setBounds(561, 248, 93, 20);
		frame.getContentPane().add(lblJuly);
		
		JLabel lblAugust = new JLabel("September :");
		lblAugust.setBounds(821, 253, 93, 20);
		frame.getContentPane().add(lblAugust);
		
		JLabel lblSeptember = new JLabel("October :");
		lblSeptember.setBounds(1091, 248, 93, 20);
		frame.getContentPane().add(lblSeptember);
		
		JLabel lblNovember = new JLabel("November :");
		lblNovember.setBounds(10, 473, 93, 20);
		frame.getContentPane().add(lblNovember);
		
		JLabel lblDecember = new JLabel("December :");
		lblDecember.setBounds(253, 478, 93, 20);
		frame.getContentPane().add(lblDecember);
		
		inputyear = new JTextField();
		inputyear.setColumns(10);
		inputyear.setBounds(1191, 600, 117, 20);
		frame.getContentPane().add(inputyear);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String year=(inputyear.getText());
				System.out.println(year);
                
				String date="Jan."+year;
				
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
		        janbills.setText(Bill);
		        jantax.setText(tax);
		        janwages.setText(wages);
		        janadd.setText(add);
		        janbank.setText(bank);
		        
                String date2="Feb."+year;
				
				
		        System.out.println(date2);
		        HomeDaoImplement home2=new HomeDaoImplement();
		        Houseinfo house2=(home2.selectBydate(date2));
		        
		        double bill2=house2.getElectric_Bill()+house2.getWater_Bill()+house2.getGas_Bill();
		        
		        String Bill2=String.format("%2f",bill2);
		        String tax2=String.format("%2f",house2.getTax());
		        String wages2=String.format("%2f",house2.getWages());
		        String add2=String.format("%2f",house2.getAdditional_Usage());
		        String bank2=String.format("%2f",house2.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        febbills.setText(Bill2);
		        febtax.setText(tax2);
		        febwages.setText(wages2);
		        febadd.setText(add2);
		        febbank.setText(bank2);
		        
                String date3="Mar."+year;
				
				
		        System.out.println(date3);
		        HomeDaoImplement home3=new HomeDaoImplement();
		        Houseinfo house3=(home3.selectBydate(date3));
		        
		        double bill3=house3.getElectric_Bill()+house3.getWater_Bill()+house3.getGas_Bill();
		        
		        String Bill3=String.format("%2f",bill3);
		        String tax3=String.format("%2f",house3.getTax());
		        String wages3=String.format("%2f",house3.getWages());
		        String add3=String.format("%2f",house3.getAdditional_Usage());
		        String bank3=String.format("%2f",house3.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        marbills.setText(Bill3);
		        martax.setText(tax3);
		        marwages.setText(wages3);
		        maradd.setText(add3);
		        marbank.setText(bank3);
		        
               String date4="Apr."+year;
				
				
		        System.out.println(date4);
		        HomeDaoImplement home4=new HomeDaoImplement();
		        Houseinfo house4=(home4.selectBydate(date4));
		        
		        double bill4=house4.getElectric_Bill()+house4.getWater_Bill()+house4.getGas_Bill();
		        
		        String Bill4=String.format("%2f",bill4);
		        String tax4=String.format("%2f",house4.getTax());
		        String wages4=String.format("%2f",house4.getWages());
		        String add4=String.format("%2f",house4.getAdditional_Usage());
		        String bank4=String.format("%2f",house4.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        aprbills.setText(Bill4);
		        aprtax.setText(tax4);
		        aprwages.setText(wages4);
		        apradd.setText(add4);
		        aprbank.setText(bank4);
		        
                String date5="May."+year;
				
				
		        System.out.println(date5);
		        HomeDaoImplement home5=new HomeDaoImplement();
		        Houseinfo house5=(home5.selectBydate(date5));
		        
		        double bill5=house5.getElectric_Bill()+house5.getWater_Bill()+house5.getGas_Bill();
		        
		        String Bill5=String.format("%2f",bill5);
		        String tax5=String.format("%2f",house5.getTax());
		        String wages5=String.format("%2f",house5.getWages());
		        String add5=String.format("%2f",house5.getAdditional_Usage());
		        String bank5=String.format("%2f",house5.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        maybills.setText(Bill5);
		        maytax.setText(tax5);
		        maywages.setText(wages5);
		        mayadd.setText(add5);
		        maybank.setText(bank5);

		        
               String date6="Jun."+year;
				
				
		        System.out.println(date6);
		        HomeDaoImplement home6=new HomeDaoImplement();
		        Houseinfo house6=(home6.selectBydate(date6));
		        
		        double bill6=house6.getElectric_Bill()+house6.getWater_Bill()+house6.getGas_Bill();
		        
		        String Bill6=String.format("%2f",bill6);
		        String tax6=String.format("%2f",house6.getTax());
		        String wages6=String.format("%2f",house6.getWages());
		        String add6=String.format("%2f",house6.getAdditional_Usage());
		        String bank6=String.format("%2f",house6.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        junbills.setText(Bill6);
		        juntax.setText(tax6);
		        junwages.setText(wages6);
		        junadd.setText(add6);
		        junbank.setText(bank6);
				
                String date7="Jul."+year;
				
				
		        System.out.println(date7);
		        HomeDaoImplement home7=new HomeDaoImplement();
		        Houseinfo house7=(home7.selectBydate(date7));
		        
		        double bill7=house7.getElectric_Bill()+house7.getWater_Bill()+house7.getGas_Bill();
		        
		        String Bill7=String.format("%2f",bill7);
		        String tax7=String.format("%2f",house7.getTax());
		        String wages7=String.format("%2f",house7.getWages());
		        String add7=String.format("%2f",house7.getAdditional_Usage());
		        String bank7=String.format("%2f",house7.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        julbills.setText(Bill7);
		        jultax.setText(tax7);
		        julwages.setText(wages7);
		        juladd.setText(add7);
		        julbank.setText(bank7);
		        
               String date8="Aug."+year;
				
				
		        System.out.println(date8);
		        HomeDaoImplement home8=new HomeDaoImplement();
		        Houseinfo house8=(home8.selectBydate(date8));
		        
		        double bill8=house8.getElectric_Bill()+house8.getWater_Bill()+house8.getGas_Bill();
		        
		        String Bill8=String.format("%2f",bill8);
		        String tax8=String.format("%2f",house8.getTax());
		        String wages8=String.format("%2f",house8.getWages());
		        String add8=String.format("%2f",house8.getAdditional_Usage());
		        String bank8=String.format("%2f",house8.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        augbills.setText(Bill8);
		        augtax.setText(tax8);
		        augwages.setText(wages8);
		        augadd.setText(add8);
		        augbank.setText(bank8);
		        
String date9="Sep."+year;
				
				
		        System.out.println(date9);
		        HomeDaoImplement home9=new HomeDaoImplement();
		        Houseinfo house9=(home9.selectBydate(date9));
		        
		        double bill9=house9.getElectric_Bill()+house9.getWater_Bill()+house9.getGas_Bill();
		        
		        String Bill9=String.format("%2f",bill9);
		        String tax9=String.format("%2f",house9.getTax());
		        String wages9=String.format("%2f",house9.getWages());
		        String add9=String.format("%2f",house9.getAdditional_Usage());
		        String bank9=String.format("%2f",house9.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        sepbills.setText(Bill9);
		        septax.setText(tax9);
		        sepwages.setText(wages9);
		        sepadd.setText(add9);
		        sepbank.setText(bank9);
		        
String date10="Oct."+year;
				
				
		        System.out.println(date10);
		        HomeDaoImplement home10=new HomeDaoImplement();
		        Houseinfo house10=(home10.selectBydate(date10));
		        
		        double bill10=house10.getElectric_Bill()+house10.getWater_Bill()+house10.getGas_Bill();
		        
		        String Bill10=String.format("%2f",bill10);
		        String tax10=String.format("%2f",house10.getTax());
		        String wages10=String.format("%2f",house10.getWages());
		        String add10=String.format("%2f",house10.getAdditional_Usage());
		        String bank10=String.format("%2f",house10.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        octbills.setText(Bill10);
		        octtax.setText(tax10);
		        octwages.setText(wages10);
		        octadd.setText(add10);
		        octbank.setText(bank10);
		        
String date11="Nov."+year;
				
				
		        System.out.println(date11);
		        HomeDaoImplement home11=new HomeDaoImplement();
		        Houseinfo house11=(home11.selectBydate(date11));
		        
		        double bill11=house11.getElectric_Bill()+house11.getWater_Bill()+house11.getGas_Bill();
		        
		        String Bill11=String.format("%2f",bill11);
		        String tax11=String.format("%2f",house11.getTax());
		        String wages11=String.format("%2f",house11.getWages());
		        String add11=String.format("%2f",house11.getAdditional_Usage());
		        String bank11=String.format("%2f",house11.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        novbills.setText(Bill11);
		        novtax.setText(tax11);
		        novwages.setText(wages11);
		        novadd.setText(add11);
		        novbank.setText(bank11);
		        
String date12="Dec."+year;
				
				
		        System.out.println(date12);
		        HomeDaoImplement home12=new HomeDaoImplement();
		        Houseinfo house12=(home12.selectBydate(date12));
		        
		        double bill12=house12.getElectric_Bill()+house12.getWater_Bill()+house12.getGas_Bill();
		        
		        String Bill12=String.format("%2f",bill12);
		        String tax12=String.format("%2f",house12.getTax());
		        String wages12=String.format("%2f",house12.getWages());
		        String add12=String.format("%2f",house12.getAdditional_Usage());
		        String bank12=String.format("%2f",house12.getBank_Storage());
		        
		        
		        //outputelec.setText(elecBill);
		        //outputgas.setText(gasBill);
		        decbills.setText(Bill12);
		        dectax.setText(tax12);
		        decwages.setText(wages12);
		        decadd.setText(add12);
		        decbank.setText(bank12);
		        
		         
		        
		        
		         
		        
		         
				
			}
		});
		btnNewButton.setBounds(1191, 631, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Okay");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*double bill=Double.parseDouble(billtxt.getText());
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
	            SpendingText.setText(Save);*/
				
				double bill1=Double.parseDouble(janbills.getText());
				double bill2=Double.parseDouble(febbills.getText());
				double bill3=Double.parseDouble(marbills.getText());
				double bill4=Double.parseDouble(aprbills.getText());
				double bill5=Double.parseDouble(maybills.getText());
				double bill6=Double.parseDouble(junbills.getText());
				double bill7=Double.parseDouble(julbills.getText());
				double bill8=Double.parseDouble(augbills.getText());
				double bill9=Double.parseDouble(sepbills.getText());
				double bill10=Double.parseDouble(octbills.getText());
				double bill11=Double.parseDouble(novbills.getText());
				double bill12=Double.parseDouble(decbills.getText());
				
				double bank1=Double.parseDouble(janbank.getText());
				double bank2=Double.parseDouble(febbank.getText());
				double bank3=Double.parseDouble(marbank.getText());
				double bank4=Double.parseDouble(aprbank.getText());
				double bank5=Double.parseDouble(maybank.getText());
				double bank6=Double.parseDouble(junbank.getText());
				double bank7=Double.parseDouble(julbank.getText());
				double bank8=Double.parseDouble(augbank.getText());
				double bank9=Double.parseDouble(sepbank.getText());
				double bank10=Double.parseDouble(octbank.getText());
				double bank11=Double.parseDouble(novbank.getText());
				double bank12=Double.parseDouble(decbank.getText());
				
				double add1=Double.parseDouble(janadd.getText());
				double add2=Double.parseDouble(febadd.getText());
				double add3=Double.parseDouble(maradd.getText());
				double add4=Double.parseDouble(apradd.getText());
				double add5=Double.parseDouble(mayadd.getText());
				double add6=Double.parseDouble(junadd.getText());
				double add7=Double.parseDouble(juladd.getText());
				double add8=Double.parseDouble(augadd.getText());
				double add9=Double.parseDouble(sepadd.getText());
				double add10=Double.parseDouble(octadd.getText());
				double add11=Double.parseDouble(novadd.getText());
				double add12=Double.parseDouble(decadd.getText());
				
				double wages1=Double.parseDouble(janwages.getText());
				double wages2=Double.parseDouble(febwages.getText());
				double wages3=Double.parseDouble(marwages.getText());
				double wages4=Double.parseDouble(aprwages.getText());
				double wages5=Double.parseDouble(maywages.getText());
				double wages6=Double.parseDouble(junwages.getText());
				double wages7=Double.parseDouble(julwages.getText());
				double wages8=Double.parseDouble(augwages.getText());
				double wages9=Double.parseDouble(sepwages.getText());
				double wages10=Double.parseDouble(octwages.getText());
				double wages11=Double.parseDouble(novwages.getText());
				double wages12=Double.parseDouble(decwages.getText());
				
				
				double totalbill=(bill1+bill2+bill3+bill4+bill5+bill6+bill7+bill8+bill9+bill10+bill11+bill12);
				double totalbank=(bank1+bank2+bank3+bank4+bank5+bank6+bank7+bank8+bank9+bank10+bank11+bank12);
				double totaladd=(add1+add2+add3+add4+add5+add6+add7+add8+add9+add10+add11+add12);
				double totalwages=(wages1+wages2+wages3+wages4+wages5+wages6+wages7+wages8+wages9+wages10+wages11+wages12);
				double totalspend=(totalbill+totaladd+totalbank);
				double totalsave=(totalwages-totalspend);
				AnnualResult result=new AnnualResult();
				result.AnnualResultFrame();
				result.SetTotalBill(totalbill);
				result.SetTotalBank(totalbank);
				result.SetTotalAdd(totaladd);
				result.SetTotalWages(totalwages);
				result.SetTotalSave(totalsave);
				result.SetTotalSpend(totalspend);
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(980, 628, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
