package com.java.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewIssuedBook extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	StudentDetails studDetails;
	static HashMap<String, StudentSeperate> hashStudent = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewIssuedBook frame = new ViewIssuedBook();
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
	public ViewIssuedBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		

		studDetails = new StudentDetails();                                 ////////////////
		hashStudent = studDetails.takeAddressofStudentDetails();
		contentPane.setLayout(null);
		
		table = new JTable(hashStudent.size(), 6);   
		table.setCellSelectionEnabled(true);
		table.setBounds(0, 5, 605, 195);
		contentPane.add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				LibrarianSection v1=new LibrarianSection();
				v1.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(373, 243, 167, 36);
		contentPane.add(btnBack);
		
		

		int row = 0;
		int col = 0;
		
			
			for(Entry<String, StudentSeperate> objValues : hashStudent.entrySet())
			{
				String keys = objValues.getKey().toString();
				String values = objValues.getValue().toString();
				String splitValues[] = values.split(" ");
				
				for(int i = 0 ; i < splitValues.length; i++)
				{
					table.setValueAt(splitValues[i], row, i);
				}
				row++;
	//			
			}
			
	
	}

}
