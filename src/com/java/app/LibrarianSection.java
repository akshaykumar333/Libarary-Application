package com.java.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianSection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianSection frame = new LibrarianSection();
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
	public LibrarianSection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 741);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLibrarianSection = new JLabel("Librarian Section");
		lblLibrarianSection.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblLibrarianSection.setBounds(164, 13, 223, 77);
		contentPane.add(lblLibrarianSection);
		
		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				 AddBook a1=new AddBook();
				 a1.setVisible(true);
				
				dispose();
			}
		});
		btnAddBooks.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddBooks.setBounds(160, 103, 213, 70);
		contentPane.add(btnAddBooks);
		
		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				ViewBook v1=new ViewBook();
				v1.setVisible(true);
				dispose();
			}
		});
		btnViewBooks.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnViewBooks.setBounds(160, 205, 213, 70);
		contentPane.add(btnViewBooks);
		
		JButton btnIsseBooks = new JButton("Issue Books");
		btnIsseBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				IssueBook ib = new IssueBook();
				ib.setVisible(true);
				dispose();
			}
		});
		btnIsseBooks.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnIsseBooks.setBounds(160, 305, 213, 70);
		contentPane.add(btnIsseBooks);
		
		JButton btnViewIssuedBooks = new JButton("View Issued Books");
		btnViewIssuedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				ViewIssuedBook v1 =new ViewIssuedBook();
				v1.setVisible(true);
				dispose();
			}
		});
		btnViewIssuedBooks.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnViewIssuedBooks.setBounds(160, 402, 213, 70);
		contentPane.add(btnViewIssuedBooks);
		
		JButton btnReturned = new JButton("Return Book");
		btnReturned.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
				ReturnBook r1=new ReturnBook();
				r1.setVisible(true);
				dispose();
				
			}
		});
		btnReturned.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReturned.setBounds(160, 504, 213, 70);
		contentPane.add(btnReturned);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Library a1 = new Library();
				a1.setVisible(true);
				dispose();
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnLogout.setBounds(160, 598, 213, 70);
		contentPane.add(btnLogout);
	}
}
