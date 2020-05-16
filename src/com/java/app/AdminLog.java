package com.java.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLog extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLog frame = new AdminLog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminLog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login Form");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(183, 13, 237, 76);
		contentPane.add(lblNewLabel);
		
		JLabel lblAdminName = new JLabel("Enter Name");
		lblAdminName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAdminName.setBounds(88, 153, 117, 48);
		contentPane.add(lblAdminName);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterPassword.setBounds(58, 224, 147, 48);
		contentPane.add(lblEnterPassword);
		
		textField = new JTextField();
		textField.setBounds(201, 163, 237, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(201, 233, 237, 34);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String name=textField.getText();
				
				String pass=passwordField.getText();
				
				if(name.equals("admin")&&pass.equals("admin123"))
				{
					AdminSec a1=new AdminSec();
					a1.setVisible(true);
				    dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "please check your username and password");
					
				}
					
					
				
			}
		});
		btnLogin.setBounds(201, 295, 117, 34);
		contentPane.add(btnLogin);
	}
}
