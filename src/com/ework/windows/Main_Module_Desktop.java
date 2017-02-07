/*
 * 09/18/2015
 *
 * Copyright (c) : P.C.Neyomal Rebera
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of 
 * P.C.Neyomal Rebera. You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with the author.
 */

package com.ework.windows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


class Main_Module_Desktop extends JFrame {
	private JPanel pnlToolbar;
	private JPanel pnlDesktop;
	JDesktopPane desktop; 
	
	Main_Module_Desktop() {
		MyMenuBar menuBar = new MyMenuBar();
		MyToolbar toolBar = new MyToolbar();
			
		setDektop();
		setIconImage(new ImageIcon("img/bajaj_logo.jpg").getImage());
		setTitle("New Dinesh Motor House");

		setBounds(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		pnlDesktop = new JPanel(new BorderLayout());
		pnlDesktop.add(desktop);

		pnlToolbar = new JPanel();
		//pnlToolbar.setLayout(new GridLayout());
		pnlToolbar.add(toolBar);

		setJMenuBar(menuBar);
		getContentPane().add(pnlToolbar, BorderLayout.WEST);
		getContentPane().add(pnlDesktop);
		
		show();
	}
	
	//Setting the background image
	public void setDektop(){
		Image  img = new ImageIcon("img/bajaj.png").getImage();
		
		
		desktop = new JDesktopPane(){
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                grphcs.drawImage(img, 250, 250, null);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(100, 100);
            }
        };
	}

	/**
	 * Custom JButton Class
	 */
	class MyJButton extends JButton {
		public MyJButton(String txt, ImageIcon imgIc) {
			setText(txt);

			Image img = imgIc.getImage();
			Image newimg = img.getScaledInstance(30, 30,
					java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(newimg);
			setIcon(icon);

			// setPreferredSize(new Dimension(55,65));
			setSize(new Dimension(100, super.getPreferredSize().height));
			this.setVerticalTextPosition(SwingConstants.BOTTOM);
			this.setHorizontalTextPosition(SwingConstants.CENTER);
		}
	}

	/**
	 * Custom Menu Bar Class
	 */
	class MyMenuBar extends JMenuBar implements ActionListener {
		private JMenu menuFile, menuEdit, menuReports, menuAbout;
		private JMenuItem menuItemF_Search, menuItemF_New, menuItemF_PReports,menuItemF_StReports,menuItemF_Software,
		menuItemF_Exit,menuItemF_Clients,menuItemF_Users,menuItemF_Prop,menuItemF_RevReports;

		public MyMenuBar() {
			JSeparator separator = new JSeparator();
			Dimension size = new Dimension(50,
					separator.getMaximumSize().height);
			separator.setMaximumSize(size);

			menuFile = new JMenu("File");
			menuItemF_Search = new JMenuItem("Seach");
			menuItemF_Search.setPreferredSize(new Dimension(200,
					menuItemF_Search.getPreferredSize().height));
			menuFile.add(menuItemF_Search);
			menuItemF_New = new JMenuItem("New Item");
			menuItemF_New.setPreferredSize(new Dimension(200, menuItemF_New
					.getPreferredSize().height));
			menuFile.add(menuItemF_New);
			menuFile.addSeparator();
			menuItemF_Exit = new JMenuItem("Exit");
			menuItemF_Exit.addActionListener(this);
			menuItemF_Exit.setPreferredSize(new Dimension(200, menuItemF_Exit
					.getPreferredSize().height));
			menuFile.add(menuItemF_Exit);
			this.add(menuFile);

			// menuBar.add(separator);

			menuEdit = new JMenu("Edit");
			menuItemF_Clients = new JMenuItem("Clients");
			menuItemF_Clients.setPreferredSize(new Dimension(200,
					menuItemF_Clients.getPreferredSize().height));
			menuEdit.add(menuItemF_Clients);
			menuItemF_Users = new JMenuItem("Users");
			menuItemF_Users.setPreferredSize(new Dimension(200, menuItemF_Users
					.getPreferredSize().height));
			menuEdit.add(menuItemF_Users);
			this.add(menuEdit);
			 

			menuReports = new JMenu("Reports");
			menuItemF_PReports = new JMenuItem("Periodical Reports");
			menuItemF_PReports.setPreferredSize(new Dimension(200,
					menuItemF_PReports.getPreferredSize().height));
			menuReports.add(menuItemF_PReports);
			menuItemF_StReports = new JMenuItem("Status Reports");
			menuItemF_StReports.setPreferredSize(new Dimension(200, menuItemF_Users
					.getPreferredSize().height));
			menuReports.add(menuItemF_StReports);
			menuItemF_RevReports = new JMenuItem("Revenue Reports");
			menuItemF_RevReports.setPreferredSize(new Dimension(200, menuItemF_Users
					.getPreferredSize().height));
			menuReports.add(menuItemF_RevReports);
			this.add(menuReports);

			menuAbout = new JMenu("About");
			menuItemF_Software = new JMenuItem("Product");
			menuItemF_Software.setPreferredSize(new Dimension(200,
					menuItemF_Software.getPreferredSize().height));
			menuAbout.add(menuItemF_Software);
			this.add(menuAbout);
		}

		// Action Listener to the Menu Items
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == menuItemF_Exit) {
				System.exit(0);
			}
		}
	}

	/**
	 * Custom Tool Bar Class
	 */
	class MyToolbar extends JToolBar implements ActionListener {
		private MyJButton btnIssueBill, btnSearch, btnReports, btnDealers, btnInv,btnStatus,
				btnReport, btnExit, btnMagazine, btnInventory , btnAbout;

		public MyToolbar() {
			// toolbar = new JToolBar(null, JToolBar.VERTICAL);
			super(null, JToolBar.VERTICAL);
			this.setLayout(new GridLayout(10, 1));

			btnIssueBill = new MyJButton("Issue Bill", new ImageIcon("img/add.jpg"));
			btnIssueBill.addActionListener(this);
			btnSearch = new MyJButton("Search", new ImageIcon("img/search.png"));
			btnSearch.addActionListener(this);
			btnInventory = new MyJButton("Inventory", new ImageIcon("img/invoice.png"));
			btnInventory.addActionListener(this);
			btnReports = new MyJButton("Reports", new ImageIcon("img/subscribe.jpg"));
			btnReports.addActionListener(this);
			btnDealers = new MyJButton("Dealers", new ImageIcon("img/users.png"));
			btnDealers.addActionListener(this);
			btnStatus = new MyJButton("Status", new ImageIcon("img/magazine.png"));
			btnStatus.addActionListener(this);
			btnExit = new MyJButton("Exit", new ImageIcon("img/exit.jpg"));
			btnExit.addActionListener(this);
			
			this.add(btnIssueBill);
			this.add(btnSearch);
			this.add(btnInventory);
			this.add(btnDealers);
			this.add(btnReports);
			this.add(btnStatus);
			this.add(btnExit);
			// toolbar.setBackground(Color.CYAN);
			
			
		}

		// Action Listener to the Tool Bar Items
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnExit) {
				System.exit(0);
			}else if(e.getSource() == btnDealers){
				Customers client = Customers.getInstance();
				
				if(client.isVisible()){
					client.moveToFront();
				}else {
					desktop.add(client);
					client.show();
					client.moveToFront();
				}
			}else if(e.getSource() == btnReports ){
				
			}else if(e.getSource() == btnIssueBill ){
				NewJob job=NewJob.getInstance();
				
				if (job.isVisible()){
					job.moveToFront();
				}else{
					desktop.add(job);
					job.show();
					job.moveToFront();
				}
			}
			else if(e.getSource() == btnInventory ){		
				Invoice invoice = Invoice.getInstance();
				
				if(invoice.isVisible()){
					invoice.moveToFront();
				}else{
					desktop.add(invoice);
					invoice.show();
					invoice.moveToFront();
				}
			}else if(e.getSource() == btnStatus ){
				
			}else if(e.getSource() == btnSearch ){		
				Search search = Search.getInstance();	
				
				if (search.isVisible()) {
					search.moveToFront();
			    } else {
			        desktop.add(search);
			        //s.setVisible(true);
			        search.show();
			        search.moveToFront();
			    }
			}else if(e.getSource() == btnAbout ){
				/*Complimentary c=new Complimentary();			
				desktop.add(c);	
				c.show();*/
			}
		}
	}

	// Main Class
	public static void main(String[] argv) {
		new Main_Module_Desktop();
	}
}
