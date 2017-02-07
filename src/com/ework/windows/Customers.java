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

public final class Customers extends JInternalFrame {
	private JTextField txtCNo;
	private JTextField txtCName;
	private JTextField txtCMobile;
	private JTextField txtCLandline;
	private JTextField textField;
	private JTextField txtEmail;

	private String[] strCustStatus = {"Good","Blacklist"};
	private static Customers instance = null;
	/**
	 * Create the frame.
	 * 
	 */
	
	private Customers(){
		createAndShowGUI();
	}
	
	public static synchronized Customers getInstance(){
		if(instance == null) instance = new Customers();
		return instance;
	}
	
	private void createAndShowGUI() { 
		//setTitle("New Job");
		setTitle("Customers");
		setClosable(true);
		setBounds(10, 10, 671, 403);
		getContentPane().setLayout(null);
			
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
		
		JLabel lblCustomeNo = new JLabel("Custome No");
		lblCustomeNo.setBounds(20, 35, 70, 14);
		getContentPane().add(lblCustomeNo);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setBounds(20, 60, 106, 14);
		getContentPane().add(lblCustomerName);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(500, 321, 117, 23);
		getContentPane().add(btnDelete);
		
		txtCNo = new JTextField();
		txtCNo.setColumns(10);
		txtCNo.setBounds(122, 33, 117, 20);
		getContentPane().add(txtCNo);
		
		txtCName = new JTextField();
		txtCName.setColumns(10);
		txtCName.setBounds(122, 58, 495, 20);
		getContentPane().add(txtCName);
		
		JLabel lblContact = new JLabel("Contact Information");
		lblContact.setBounds(20, 85, 140, 14);
		getContentPane().add(lblContact);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(20, 110, 46, 14);
		getContentPane().add(lblMobile);
		
		txtCMobile = new JTextField();
		txtCMobile.setColumns(10);
		txtCMobile.setBounds(122, 108, 117, 20);
		getContentPane().add(txtCMobile);
		
		JLabel lblLandline = new JLabel("Landline");
		lblLandline.setBounds(432, 111, 73, 14);
		getContentPane().add(lblLandline);
		
		txtCLandline = new JTextField();
		txtCLandline.setColumns(10);
		txtCLandline.setBounds(500, 108, 117, 20);
		getContentPane().add(txtCLandline);
		
		JLabel lblCompany = new JLabel("Company Name");
		lblCompany.setBounds(20, 133, 106, 14);
		getContentPane().add(lblCompany);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(122, 134, 495, 20);
		getContentPane().add(textField);
		
		JLabel lblEmail = new JLabel("Address");
		lblEmail.setBounds(20, 179, 66, 14);
		getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(122, 159, 210, 20);
		getContentPane().add(txtEmail);
		
		JLabel lblEmail_1 = new JLabel("email");
		lblEmail_1.setBounds(20, 158, 58, 14);
		getContentPane().add(lblEmail_1);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(249, 32, 89, 23);
		getContentPane().add(btnSearch);
		
		JTextArea txtAAddress = new JTextArea();
		txtAAddress.setBounds(122, 186, 495, 73);
		getContentPane().add(txtAAddress);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(39, 321, 117, 23);
		getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(192, 321, 117, 23);
		getContentPane().add(btnCancel);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(349, 321, 117, 23);
		getContentPane().add(btnClear);
		
		TitledBorder titleItem = new TitledBorder("Item Details");
		titleItem.setTitleJustification(TitledBorder.CENTER);
		
		TitledBorder titleClient = new TitledBorder("Customer Details");
		titleClient.setTitleJustification(TitledBorder.CENTER);
		
		TitledBorder titleBtn = new TitledBorder("");
		titleItem.setTitleJustification(TitledBorder.CENTER);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(20, 269, 46, 14);
		getContentPane().add(lblStatus);
		
		JComboBox cmbStatus = new JComboBox(strCustStatus);
		cmbStatus.setBounds(122, 267, 117, 20);
		getContentPane().add(cmbStatus);
		
		JPanel panelCus = new JPanel();
		panelCus.setBounds(10, 11, 638, 289);
		panelCus.setBorder(titleClient);
		getContentPane().add(panelCus);
		
		JPanel panelBtn = new JPanel();
		panelBtn.setBounds(10, 308, 638, 53);
		panelBtn.setBorder(titleBtn);
		getContentPane().add(panelBtn);
		
		//show();
	}
	
	public static void main(String[] argv){
		JFrame frm=new JFrame();
		frm.setSize(800,680);
		frm.getContentPane().setLayout(new BorderLayout());
		JDesktopPane desktop = new JDesktopPane();
		desktop.add(new Customers());
		frm.getContentPane().add(desktop);
		frm.show();
	}
}
