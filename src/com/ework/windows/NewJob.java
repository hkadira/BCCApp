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

public final class NewJob extends JInternalFrame {
	private JTextField txtJNo;
	private JTextField txtItem;
	private JTextField txtDate;
	private JTextField txtCNo;
	private JTextField txtCName;
	private JTextField txtCMobile;
	private JTextField txtCLandline;
	private JTextField textField;
	private JTextField txtEmail;
	private JTextField txtAdvance;
	public static NewJob instance = null;

	private String[] strItemType = {"Laptop","Desktop","TV","Other"};
	private String[] strItemStatus = {"Accepted","Completed","Returned"};
	/**
	 * Create the frame.
	 */
	private NewJob() {
		createAndShowGUI();
	}
	
	public static synchronized NewJob getInstance(){
		if(instance == null) instance= new NewJob();
		return instance;
	}
	
	private void createAndShowGUI(){
		setTitle("New Job");
		setClosable(true);
		//super("New Job",true,true,true,true);
		setBounds(10, 10, 671, 634);
		getContentPane().setLayout(null);
		
		JLabel lblJobNo = new JLabel("Job No");
		lblJobNo.setBounds(29, 53, 46, 14);
		getContentPane().add(lblJobNo);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(29, 78, 46, 14);
		getContentPane().add(lblItem);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setBounds(29, 103, 46, 14);
		getContentPane().add(lblBrand);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(29, 128, 70, 14);
		getContentPane().add(lblDescription);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(441, 54, 58, 14);
		getContentPane().add(lblDate);
		
		txtJNo = new JTextField();
		txtJNo.setBounds(131, 51, 107, 20);
		getContentPane().add(txtJNo);
		txtJNo.setColumns(10);
		
		txtItem = new JTextField();
		txtItem.setBounds(131, 76, 495, 20);
		getContentPane().add(txtItem);
		txtItem.setColumns(10);
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
		txtDate = new JTextField();
		txtDate.setBounds(556, 51, 70, 20);
		getContentPane().add(txtDate);
		txtDate.setColumns(10);
		txtDate.setText(dateFormat.format(new Date()));
		//txtDate.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JComboBox cmbBrand = new JComboBox(strItemType);
		cmbBrand.setBounds(131, 101, 117, 20);
		getContentPane().add(cmbBrand);
		
		JTextArea txtAItemDesc = new JTextArea();
		txtAItemDesc.setBounds(131, 129, 495, 73);
		getContentPane().add(txtAItemDesc);
		
		JLabel lblCustomeNo = new JLabel("Custome No");
		lblCustomeNo.setBounds(29, 254, 70, 14);
		getContentPane().add(lblCustomeNo);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setBounds(29, 279, 106, 14);
		getContentPane().add(lblCustomerName);
		
		txtCNo = new JTextField();
		txtCNo.setColumns(10);
		txtCNo.setBounds(131, 252, 117, 20);
		getContentPane().add(txtCNo);
		
		txtCName = new JTextField();
		txtCName.setColumns(10);
		txtCName.setBounds(131, 277, 495, 20);
		getContentPane().add(txtCName);
		
		JLabel lblContact = new JLabel("Contact Information");
		lblContact.setBounds(29, 304, 140, 14);
		getContentPane().add(lblContact);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(29, 329, 46, 14);
		getContentPane().add(lblMobile);
		
		txtCMobile = new JTextField();
		txtCMobile.setColumns(10);
		txtCMobile.setBounds(131, 327, 117, 20);
		getContentPane().add(txtCMobile);
		
		JLabel lblLandline = new JLabel("Landline");
		lblLandline.setBounds(441, 330, 73, 14);
		getContentPane().add(lblLandline);
		
		txtCLandline = new JTextField();
		txtCLandline.setColumns(10);
		txtCLandline.setBounds(509, 327, 117, 20);
		getContentPane().add(txtCLandline);
		
		JLabel lblCompany = new JLabel("Company Name");
		lblCompany.setBounds(29, 352, 106, 14);
		getContentPane().add(lblCompany);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(131, 353, 495, 20);
		getContentPane().add(textField);
		
		JLabel lblEmail = new JLabel("Address");
		lblEmail.setBounds(29, 398, 66, 14);
		getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(131, 378, 210, 20);
		getContentPane().add(txtEmail);
		
		JLabel lblEmail_1 = new JLabel("email");
		lblEmail_1.setBounds(29, 377, 58, 14);
		getContentPane().add(lblEmail_1);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(258, 251, 89, 23);
		getContentPane().add(btnSearch);
		
		JTextArea txtAAddress = new JTextArea();
		txtAAddress.setBounds(131, 405, 495, 73);
		getContentPane().add(txtAAddress);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(39, 556, 117, 23);
		getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(192, 556, 117, 23);
		getContentPane().add(btnCancel);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(349, 556, 117, 23);
		getContentPane().add(btnClear);
		
		JLabel lblAdvance = new JLabel("Payment");
		lblAdvance.setBounds(441, 103, 66, 14);
		getContentPane().add(lblAdvance);
		
		txtAdvance = new JTextField();
		txtAdvance.setBounds(556, 100, 70, 20);
		getContentPane().add(txtAdvance);
		txtAdvance.setColumns(10);
		
		TitledBorder titleItem = new TitledBorder("Item Details");
		titleItem.setTitleJustification(TitledBorder.CENTER);
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 638, 203);
		panel.setBorder(titleItem);
		getContentPane().add(panel);
		
		TitledBorder titleClient = new TitledBorder("Customer Details");
		titleClient.setTitleJustification(TitledBorder.CENTER);
		
		TitledBorder titleBtn = new TitledBorder("");
		titleItem.setTitleJustification(TitledBorder.CENTER);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(496, 556, 117, 23);
		getContentPane().add(btnPrint);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(29, 488, 46, 14);
		getContentPane().add(lblStatus);
		
		JComboBox cmbStatus = new JComboBox(strItemStatus);
		cmbStatus.setBounds(131, 486, 117, 20);
		getContentPane().add(cmbStatus);
		
		JPanel panelCus = new JPanel();
		panelCus.setBounds(10, 225, 638, 299);
		panelCus.setBorder(titleClient);
		getContentPane().add(panelCus);
		
		JPanel panelBtn = new JPanel();
		panelBtn.setBounds(10, 537, 638, 56);
		panelBtn.setBorder(titleBtn);
		getContentPane().add(panelBtn);
		
		//show();
	}
	
	public static void main(String[] argv){
		JFrame frm=new JFrame();
		frm.setSize(800,680);
		frm.getContentPane().setLayout(new BorderLayout());
		JDesktopPane desktop = new JDesktopPane();
		desktop.add(new NewJob());
		frm.getContentPane().add(desktop);
		frm.show();
	}
}
