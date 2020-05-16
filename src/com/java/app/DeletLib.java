package com.java.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;

import javax.swing.JTextField;

public class DeletLib extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	HashMap<String, LibrarianDetails> h1;
	
	 Hash hashObject;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletLib frame = new DeletLib();
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
	public DeletLib() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Librarian");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(227, 13, 248, 60);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				hashObject = new Hash();
				h1 = hashObject.getAddressOfHashMapObject();
				
				String name = textField.getText();
				
				if( h1.containsKey(name))
				{
					h1.remove(name);
					
					JOptionPane.showMessageDialog(null, "deleted");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Record Not Found");
				}
				
				
				
			}
		});
		btnNewButton.setBounds(167, 199, 212, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblEnterId = new JLabel("Enter Name");
		lblEnterId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterId.setBounds(90, 102, 116, 37);
		contentPane.add(lblEnterId);
		
		textField = new JTextField();
		textField.setBounds(236, 95, 239, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				AdminSec a1=new AdminSec();
				a1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(420, 199, 147, 37);
		contentPane.add(btnNewButton_1);
	}
}
