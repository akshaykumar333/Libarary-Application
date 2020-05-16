package com.java.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class AddLib extends JFrame {

	private JPanel contentPane;
	private JTextField VALUE;
	private JTextField ID;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField passrd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddLib frame = new AddLib();
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
	public AddLib() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 751);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Add Librarian");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(151, 0, 189, 82);
		contentPane.add(lblNewLabel);

		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterName.setBounds(57, 122, 111, 39);
		contentPane.add(lblEnterName);

		JLabel lblEnterId = new JLabel("Enter Id");
		lblEnterId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterId.setBounds(86, 226, 82, 39);
		contentPane.add(lblEnterId);

		VALUE = new JTextField();
		VALUE.setBounds(180, 129, 176, 29);
		contentPane.add(VALUE);
		VALUE.setColumns(10);

		ID = new JTextField();
		ID.setColumns(10);
		ID.setBounds(180, 233, 176, 29);
		contentPane.add(ID);

		JButton btnSubmite = new JButton("Add Librarian");
		btnSubmite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{

				String name = VALUE.getText();
				String pass = passrd.getText();
				String id = ID.getText();
				String email = textField.getText();
				String contactno = textField_1.getText();
				
          
				
					  Hash.main(name, pass, id, email, contactno);

					JOptionPane.showMessageDialog(null, "added successfully");

				
			}
		});
		btnSubmite.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSubmite.setBounds(180, 572, 159, 29);
		contentPane.add(btnSubmite);

		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminSec a1 = new AdminSec();
				a1.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(387, 571, 97, 31);
		contentPane.add(btnBack);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEmail.setBounds(100, 295, 82, 39);
		contentPane.add(lblEmail);
		
		JLabel lblContactNumber = new JLabel("Contact  Number");
		lblContactNumber.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblContactNumber.setBounds(12, 366, 156, 39);
		contentPane.add(lblContactNumber);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(180, 302, 176, 29);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 373, 176, 29);
		contentPane.add(textField_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPassword.setBounds(67, 174, 111, 39);
		contentPane.add(lblPassword);
		
		passrd = new JTextField();
		passrd.setColumns(10);
		passrd.setBounds(180, 184, 176, 29);
		contentPane.add(passrd);
	}
}
