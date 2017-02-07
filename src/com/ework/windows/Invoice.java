package com.ework.windows;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;

public final class Invoice extends JInternalFrame {
	private JTextField txtJNo;
	private JTextField txtItem;
	private JTextField txtDate;
	private JTextField txtCNo;
	private JTextField txtCName;
	private JTextField txtCMobile;
	private JTextField txtCLandline;
	private JTextField txtAdvance;

	private String[] strItemType = {"Laptop","Desktop","TV","Other"};
	private String[] strItemStatus = {"Completed","Returned"};
	
	public static Invoice instance = null;
	/**
	 * Create the frame.
	 */
	private Invoice() {
		createAndShowGUI();
	}
	
	public final static synchronized Invoice getInstance(){
		if(instance == null) instance = new Invoice();
		return instance;
	}
	
	private void createAndShowGUI(){
		setTitle("Invoices");
		setClosable(true);
		//super("Customer Invoice",true,true,true,true);
		setBounds(10, 10, 671, 586);
		getContentPane().setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(255, 32, 89, 23);
		getContentPane().add(btnSearch);
		
		JLabel lblJobNo = new JLabel("Job No");
		lblJobNo.setBounds(29, 36, 46, 14);
		getContentPane().add(lblJobNo);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(29, 61, 46, 14);
		getContentPane().add(lblItem);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setBounds(29, 86, 46, 14);
		getContentPane().add(lblBrand);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(29, 111, 70, 14);
		getContentPane().add(lblDescription);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(441, 234, 58, 14);
		getContentPane().add(lblDate);
		
		txtJNo = new JTextField();
		txtJNo.setBounds(131, 34, 107, 20);
		getContentPane().add(txtJNo);
		txtJNo.setColumns(10);
		
		txtItem = new JTextField();
		txtItem.setBounds(131, 59, 495, 20);
		getContentPane().add(txtItem);
		txtItem.setColumns(10);
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
		txtDate = new JTextField();
		txtDate.setBounds(556, 231, 70, 20);
		getContentPane().add(txtDate);
		txtDate.setColumns(10);
		txtDate.setText(dateFormat.format(new Date()));
		//txtDate.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JComboBox cmbBrand = new JComboBox(strItemType);
		cmbBrand.setBounds(131, 84, 117, 20);
		getContentPane().add(cmbBrand);
		
		JTextArea txtAItemDesc = new JTextArea();
		txtAItemDesc.setBounds(131, 112, 495, 73);
		getContentPane().add(txtAItemDesc);
		
		JLabel lblCustomeNo = new JLabel("Custome No");
		lblCustomeNo.setBounds(29, 237, 70, 14);
		getContentPane().add(lblCustomeNo);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setBounds(29, 262, 106, 14);
		getContentPane().add(lblCustomerName);
		
		txtCNo = new JTextField();
		txtCNo.setColumns(10);
		txtCNo.setBounds(131, 235, 117, 20);
		getContentPane().add(txtCNo);
		
		txtCName = new JTextField();
		txtCName.setColumns(10);
		txtCName.setBounds(131, 260, 495, 20);
		getContentPane().add(txtCName);
		
		JLabel lblMobile = new JLabel("Payment");
		lblMobile.setBounds(407, 440, 72, 14);
		getContentPane().add(lblMobile);
		
		txtCMobile = new JTextField();
		txtCMobile.setColumns(10);
		txtCMobile.setBounds(509, 438, 117, 20);
		getContentPane().add(txtCMobile);
		
		JLabel lblLandline = new JLabel("Total Charges");
		lblLandline.setBounds(407, 327, 92, 14);
		getContentPane().add(lblLandline);
		
		txtCLandline = new JTextField();
		txtCLandline.setColumns(10);
		txtCLandline.setBounds(509, 324, 117, 20);
		getContentPane().add(txtCLandline);
		
		JLabel lblEmail = new JLabel("Service Remarks");
		lblEmail.setBounds(29, 348, 106, 14);
		getContentPane().add(lblEmail);
		
		JTextArea txtServiceDetails = new JTextArea();
		txtServiceDetails.setBounds(131, 355, 495, 73);
		getContentPane().add(txtServiceDetails);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(52, 501, 117, 23);
		getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(205, 501, 117, 23);
		getContentPane().add(btnCancel);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(362, 501, 117, 23);
		getContentPane().add(btnClear);
		
		JLabel lblAdvance = new JLabel("Payment in advance");
		lblAdvance.setBounds(441, 86, 117, 14);
		getContentPane().add(lblAdvance);
		
		txtAdvance = new JTextField();
		txtAdvance.setBounds(556, 83, 70, 20);
		getContentPane().add(txtAdvance);
		txtAdvance.setColumns(10);
		
		TitledBorder titleItem = new TitledBorder("Item Details");
		titleItem.setTitleJustification(TitledBorder.CENTER);
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 638, 185);
		panel.setBorder(titleItem);
		getContentPane().add(panel);
		
		TitledBorder titleClient = new TitledBorder("Customer Details");
		titleClient.setTitleJustification(TitledBorder.CENTER);
		
		TitledBorder titlePayment = new TitledBorder("Payment Details");
		titlePayment.setTitleJustification(TitledBorder.CENTER);
		
		TitledBorder titleBtn = new TitledBorder("");
		titleItem.setTitleJustification(TitledBorder.CENTER);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(509, 501, 117, 23);
		getContentPane().add(btnPrint);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(29, 444, 46, 14);
		getContentPane().add(lblStatus);
		
		JComboBox cmbStatus = new JComboBox(strItemStatus);
		cmbStatus.setBounds(131, 442, 117, 20);
		getContentPane().add(cmbStatus);
		
		JPanel panelCus = new JPanel();
		panelCus.setBounds(10, 207, 638, 85);
		panelCus.setBorder(titleClient);
		getContentPane().add(panelCus);
		
		JPanel panelBtn = new JPanel();
		panelBtn.setBounds(10, 484, 638, 58);
		panelBtn.setBorder(titleBtn);
		getContentPane().add(panelBtn);
		
		JPanel panelPayment = new JPanel();
		panelPayment.setBounds(10, 303, 635, 170);
		panelPayment.setBorder(titlePayment);
		getContentPane().add(panelPayment);
		
		//show();
	}
	
	public static void main(String[] argv){
		JFrame frm=new JFrame();
		frm.setSize(800,680);
		frm.getContentPane().setLayout(new BorderLayout());
		JDesktopPane desktop = new JDesktopPane();
		desktop.add(new Invoice());
		frm.getContentPane().add(desktop);
		frm.show();
	}
}
