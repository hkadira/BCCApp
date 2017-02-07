package com.ework.windows;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public final class Search extends JInternalFrame {
	private JTextField txtSearch;
	private static Search instance = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private Search() {
		createAndShowGUI();
	}
	
	public static synchronized Search getInstance() {
        if (instance == null) instance = new Search();
        return instance;
    }
	
	/**
	 * Create the frame.
	 */
	private void createAndShowGUI() {
		//super("Search",true,true,true,true);
		setTitle("Search");
		setClosable(true);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(10, 10, 450, 193);
		//setIconImage(new ImageIcon("img/eco.png").getImage());
		setFrameIcon(new ImageIcon("img/d_icon.ico"));
		getContentPane().setLayout(null);
		
		TitledBorder titleBorder = new TitledBorder("Item Search");
		titleBorder.setTitleJustification(TitledBorder.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 144);
		getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBorder(titleBorder);
		
		JLabel lblEnterSearchKey = new JLabel("Enter Search Key");
		lblEnterSearchKey.setBounds(32, 40, 109, 14);
		panel.add(lblEnterSearchKey);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(151, 37, 116, 20);
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(293, 36, 89, 23);
		panel.add(btnSearch);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton rbtnJob = new JRadioButton("Job");
		rbtnJob.setBounds(161, 70, 109, 23);
		bg.add(rbtnJob);
		panel.add(rbtnJob);
		
		JRadioButton rdbtnInvoice = new JRadioButton("Invoice");
		rdbtnInvoice.setBounds(161, 90, 109, 23);
		bg.add(rdbtnInvoice);
		panel.add(rdbtnInvoice);
		
		//show();
	}
}
