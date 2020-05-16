package com.java.app;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class View extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	HashMap<String, LibrarianDetails> h1;
	
	 Hash hashObject;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		hashObject = new Hash();                                 ////////////////
		h1 = hashObject.getAddressOfHashMapObject();
		
		table = new JTable(h1.size(), 6);
		table.setCellSelectionEnabled(true);
		table.setBounds(29, 5, 375, 213);
		contentPane.add(table);
		
		 
		
		int row = 0;
		int col = 0;
		
			
			for(Entry<String, LibrarianDetails> objValues : h1.entrySet())
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

		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				AdminSec n1=new AdminSec();
				n1.setVisible(true);
				dispose();
			}
		});
		
		btnBack.setBounds(307, 269, 97, 25);
		contentPane.add(btnBack);
		
		
	}
}
