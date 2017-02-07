package com.ework.windows;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Bill extends JInternalFrame {
	private JTextField txtCName;
	private JTextField txtVNo;
	private JTextField txtDate;
	private JTextField txtQuantity;
	private JTextField txtRate;
	private JTextField txtAmount;
	private JTextField txtCusName;
	private JTextField txtVehicleNo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frm=new JFrame();
		frm.setSize(800,680);
		frm.getContentPane().setLayout(new BorderLayout());
		JDesktopPane desktop = new JDesktopPane();
		desktop.add(new Bill());
		frm.getContentPane().add(desktop);
		frm.show();
	}

	/**
	 * Create the frame.
	 */
	public Bill() {
		setBounds(100, 100, 690, 480);
		setTitle("Customer Receipt");
		setClosable(true);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JButton btnTab = new JButton("tab2");
		btnTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JComponent panelReceipt = new JPanel();
		tabbedPane.addTab("Service Receipt", null, panelReceipt,
		                  null);
		panelReceipt.setLayout(null);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setBounds(20, 22, 130, 14);
		panelReceipt.add(lblCustomerName);
		
		txtCusName = new JTextField();
		txtCusName.setBounds(130, 19, 509, 20);
		panelReceipt.add(txtCusName);
		txtCusName.setColumns(10);
		
		JLabel lblVehicleNumber = new JLabel("Vehicle Number");
		lblVehicleNumber.setBounds(20, 58, 102, 14);
		panelReceipt.add(lblVehicleNumber);
		
		txtVehicleNo = new JTextField();
		txtVehicleNo.setBounds(130, 55, 222, 20);
		panelReceipt.add(txtVehicleNo);
		txtVehicleNo.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(378, 58, 46, 14);
		panelReceipt.add(lblDate);
		
		txtCName = new JTextField();
		txtCName.setBounds(160, 19, 476, 20);
		panelReceipt.add(txtCName);
		txtCName.setColumns(10);
		
		txtVNo = new JTextField();
		txtVNo.setBounds(160, 55, 179, 20);
		panelReceipt.add(txtVNo);
		txtVNo.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setBounds(425, 55, 211, 20);
		panelReceipt.add(txtDate);
		txtDate.setColumns(10);
		
		JPanel pnlForm = new JPanel();
		pnlForm.setBorder(new TitledBorder(null, "Service Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlForm.setBounds(20, 112, 620, 237);
		panelReceipt.add(pnlForm);
		pnlForm.setLayout(null);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(33, 33, 77, 14);
		pnlForm.add(lblQuantity);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(141, 30, 179, 20);
		pnlForm.add(txtQuantity);
		txtQuantity.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(33, 72, 93, 14);
		pnlForm.add(lblDescription);
		
		JTextArea txtSDescripton = new JTextArea();
		txtSDescripton.setBounds(141, 67, 455, 66);
		pnlForm.add(txtSDescripton);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setBounds(33, 157, 46, 14);
		pnlForm.add(lblRate);
		
		txtRate = new JTextField();
		txtRate.setBounds(141, 154, 179, 20);
		pnlForm.add(txtRate);
		txtRate.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(33, 188, 46, 14);
		pnlForm.add(lblAmount);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(141, 185, 179, 20);
		pnlForm.add(txtAmount);
		txtAmount.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdd.setBounds(416, 365, 89, 23);
		panelReceipt.add(btnAdd);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setBounds(551, 365, 89, 23);
		panelReceipt.add(btnClear);
		
		
		JPanel panelPrint = new JPanel();
		tabbedPane.addTab("Final Receipt", null, panelPrint, null);
		panelPrint.setLayout(null);
		
		JButton btnTab_1 = new JButton("Tab 2");
		btnTab_1.setBounds(83, 75, 89, 23);
		panelPrint.add(btnTab_1);

		show();
	}
}
