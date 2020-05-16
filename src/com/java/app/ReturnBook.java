package com.java.app;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ReturnBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	StudentDetails detailsStud;
	HashMap<String, StudentSeperate> studHash;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnBook frame = new ReturnBook();
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblReturnBook.setBounds(139, 0, 178, 81);
		contentPane.add(lblReturnBook);
		
		JLabel lblBookCallNo = new JLabel("Book Call No");
		lblBookCallNo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblBookCallNo.setBounds(60, 111, 161, 37);
		contentPane.add(lblBookCallNo);
		
		JLabel lblStudentId = new JLabel("Student Id");
		lblStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblStudentId.setBounds(92, 181, 101, 37);
		contentPane.add(lblStudentId);
		
		textField = new JTextField();
		textField.setBounds(212, 110, 172, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(212, 175, 172, 43);
		contentPane.add(textField_1);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				detailsStud = new StudentDetails();
				studHash = detailsStud.takeAddressofStudentDetails();
				
				String callno = textField.getText();
				if(studHash.containsKey(callno))
				{
					studHash.remove(callno);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No Record Found");
				}
			}
		});
		btnReturnBook.setBounds(81, 248, 140, 43);
		contentPane.add(btnReturnBook);
		
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
		btnBack.setBounds(253, 244, 131, 47);
		contentPane.add(btnBack);
	}

}
