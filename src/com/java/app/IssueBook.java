package com.java.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class IssueBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	

	HashMap<String, BookDetials> h1;
	
	 BookHash hashBook;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBook frame = new IssueBook();
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
	public IssueBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblIssueBook.setBounds(151, 5, 152, 55);
		contentPane.add(lblIssueBook);
		
		JLabel lblNewLabel = new JLabel("Book Collno");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(59, 152, 108, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblStudentId = new JLabel("Student Id ");
		lblStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblStudentId.setBounds(59, 234, 108, 24);
		contentPane.add(lblStudentId);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblStudentName.setBounds(38, 315, 129, 24);
		contentPane.add(lblStudentName);
		
		JLabel lblStudentContact = new JLabel("Student Contact");
		lblStudentContact.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblStudentContact.setBounds(38, 395, 129, 24);
		contentPane.add(lblStudentContact);
		
		textField = new JTextField();
		textField.setBounds(189, 153, 197, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 235, 197, 23);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(189, 316, 197, 23);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(189, 396, 197, 23);
		contentPane.add(textField_3);
		
		JButton btnIssueBoook = new JButton("Issue Boook");
		btnIssueBoook.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnIssueBoook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			
			{
				String callno = textField.getText();
				String name = textField_1.getText();
				String author = textField_2.getText();
				String publisher = textField_3.getText();
				
				hashBook = new BookHash();
				h1 = hashBook.takeAddressofBookDetails();
				if(h1.containsKey(callno))
				{
					StudentDetails.main(callno, name, author, publisher);
					JOptionPane.showMessageDialog(null, "added successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Book is not there");
				}
			}
		});
		btnIssueBoook.setBounds(73, 457, 129, 37);
		contentPane.add(btnIssueBoook);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				LibrarianSection l1 =new LibrarianSection();
				l1.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(265, 457, 121, 37);
		contentPane.add(btnBack);
	}

}
