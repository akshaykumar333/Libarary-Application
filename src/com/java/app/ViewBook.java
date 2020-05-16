package com.java.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map.Entry;

public class ViewBook extends JFrame {

	private JPanel contentPane;
	private JTable table;

	
	HashMap<String, BookDetials> h1;
	
	 BookHash hashBook;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBook frame = new ViewBook();
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
	public ViewBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		hashBook = new BookHash();
		h1 = hashBook.takeAddressofBookDetails();
		
		table = new JTable(h1.size(), 6);
		table.setBounds(39, 28, 492, 143);
		contentPane.add(table);
		
		
	
		 
		
		int row = 0;
		int col = 0;
		
			
			for(Entry<String, BookDetials> objValues : h1.entrySet())
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
			
	
     
			System.out.println(h1);

		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				LibrarianSection l1= new LibrarianSection();
				l1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(421, 251, 97, 25);
		contentPane.add(btnNewButton);
	}
}
