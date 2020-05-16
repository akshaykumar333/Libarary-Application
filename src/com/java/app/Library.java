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

public class Library extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library frame = new Library();
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
	public Library() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLibrary = new JLabel("Library Management");
		lblLibrary.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblLibrary.setBounds(162, 13, 276, 73);
		contentPane.add(lblLibrary);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AdminLog a1=new AdminLog();
				a1.setVisible(true);
                  dispose();
			}
		});
		btnAdminLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAdminLogin.setBounds(194, 135, 236, 73);
		contentPane.add(btnAdminLogin);
		
		JButton btnLogin = new JButton("Librarian Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				LibLogin l1= new LibLogin();
				l1.setVisible(true);
				dispose();
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnLogin.setBounds(194, 264, 236, 73);
		contentPane.add(btnLogin);
	}
}
