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

public class AdminSec extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSec frame = new AdminSec();
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
	public AdminSec() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Section");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(137, 0, 200, 74);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Librararian");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AddLib a1=new AddLib();
			a1.setVisible(true);
			dispose();
			}
		});
		btnNewButton.setBounds(119, 101, 228, 61);
		contentPane.add(btnNewButton);
		
		JButton btnViewLibrararian = new JButton("View Librarian");
		btnViewLibrararian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			
			{
				
				View viewObject = new View();
				viewObject.setVisible(true);
				dispose();
				
			
		
			}
		});
		btnViewLibrararian.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnViewLibrararian.setBounds(119, 196, 228, 61);
		contentPane.add(btnViewLibrararian);
		
		JButton btnDeleteLibrarian = new JButton("Delete Librarian");
		btnDeleteLibrarian.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDeleteLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				DeletLib d1= new DeletLib();
				d1.setVisible(true);
				dispose();
				
			}
		});
		btnDeleteLibrarian.setBounds(119, 300, 228, 61);
		contentPane.add(btnDeleteLibrarian);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			
			{
				Library l1=new Library();
				l1.setVisible(true);
				dispose();
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnLogout.setBounds(119, 402, 228, 61);
		contentPane.add(btnLogout);
	}

}
