package com.java.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;

public class LibLogin extends JFrame {

	private JPanel contentPane;
	private JTextField Ename;
	private JPasswordField passwordField;
	
	HashMap<String, LibrarianDetails> h1;
	
	 Hash hashObject;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibLogin frame = new LibLogin();
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
	public LibLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Librarian Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(151, 0, 189, 82);
		contentPane.add(lblNewLabel);

		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterName.setBounds(57, 122, 111, 39);
		contentPane.add(lblEnterName);

		JLabel lblEnterId = new JLabel("Enter Id");
		lblEnterId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterId.setBounds(86, 185, 82, 39);
		contentPane.add(lblEnterId);

		
		JButton btnSubmite = new JButton(" Login");
		btnSubmite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				hashObject = new Hash();
				h1 = hashObject.getAddressOfHashMapObject();
				boolean flag = false;
				
				String name = Ename.getText().trim();
				String pass = String.valueOf( passwordField.getPassword() ) ;
				
				String myValuess;
				String colValues[];
				for(Entry<String, LibrarianDetails> objValues : h1.entrySet())
				{
					
					myValuess = objValues.getValue().toString().trim();
					colValues = myValuess.split(" ");
					for(int i = 0; i < colValues.length; i++)
					{
						if(colValues[i].equals(pass))
						{
							flag = true;
							System.out.println("OK Logged In ");
							
							
							
							break;
						}
					}
				}
				if(flag && h1.containsKey(name))
				{
				
					System.out.println("successfully Logged in ");
					JOptionPane.showMessageDialog(null, "Welcome");
					
					LibrarianSection lb = new LibrarianSection();
					lb.setVisible(true);
					dispose();
						
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Record Not Found");
				}
				
				
			}
		});
		btnSubmite.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSubmite.setBounds(181, 246, 91, 29);
		contentPane.add(btnSubmite);

		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Library a1 = new Library();
				a1.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(294, 245, 87, 31);
		contentPane.add(btnBack);
		
		Ename = new JTextField();
		Ename.setBounds(180, 129, 201, 29);
		contentPane.add(Ename);
		Ename.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(180, 181, 201, 29);
		contentPane.add(passwordField);
	}
}
