package com.ework.windows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUName;
	private JTextField txtPwd;
	private String[] strModule = {"Repars","Spare Parts"};
	private String[] strUType={"Standard","Admin"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setTitle("User Login");
		setIconImage(new ImageIcon("img/eco.png").getImage());
		setBounds(450, 200, 420, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 405, 206);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setBackground(new Color(151, 195, 10));
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("image");
			ImageIcon iconLogo = new ImageIcon("img/login.png");
			lblNewLabel.setIcon(iconLogo);
			
			lblNewLabel.setBackground(Color.GREEN);
			lblNewLabel.setBounds(13, 11, 190, 184);
			contentPanel.add(lblNewLabel);
		}
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(215, 25, 75, 14);
		contentPanel.add(lblUserName);
		
		txtUName = new JTextField();
		txtUName.setBounds(215, 51, 131, 20);
		contentPanel.add(txtUName);
		txtUName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(215, 82, 86, 14);
		contentPanel.add(lblPassword);
		
		txtPwd = new JTextField();
		txtPwd.setBounds(216, 106, 130, 20);
		contentPanel.add(txtPwd);
		txtPwd.setColumns(10);
		
		JLabel lblUserType = new JLabel("User Type");
		lblUserType.setBounds(215, 137, 58, 14);
		contentPanel.add(lblUserType);
		
		JComboBox comboBox = new JComboBox(strUType);
		comboBox.setBounds(216, 162, 130, 20);
		contentPanel.add(comboBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 217, 405, 45);
			getContentPane().add(buttonPane);
			buttonPane.setBackground(new Color(70,80,70));
			buttonPane.setLayout(null);
			{
				JButton btnLogin = new JButton("Login");
				btnLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//System.exit(0);
						dispose();
						new Main_Module_Desktop();
					}
				});
				btnLogin.setBounds(33, 10, 129, 23);
				//btnLogin.setActionCommand("OK");
				buttonPane.add(btnLogin);
				getRootPane().setDefaultButton(btnLogin);
			}
			{
				JButton btnCancel = new JButton("Cancel");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//System.exit(0);
					}
				});
				btnCancel.setBounds(218, 10, 129, 23);
				//partsButton.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
		}
	}
}
