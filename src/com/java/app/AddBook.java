package com.java.app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AddBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBook frame = new AddBook();
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
	public AddBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAddBook = new JLabel("Add Book");
		lblAddBook.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblAddBook.setBounds(217, 13, 241, 49);
		contentPane.add(lblAddBook);

		JLabel lblNewLabel = new JLabel("Call  number");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(55, 131, 122, 32);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(108, 190, 81, 32);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Author");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(96, 250, 81, 32);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Publisher");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(77, 309, 122, 32);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Quanity");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(92, 374, 97, 34);
		contentPane.add(lblNewLabel_4);

		textField = new JTextField();
		textField.setBounds(201, 131, 192, 32);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(201, 195, 192, 27);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(201, 255, 192, 27);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(201, 312, 192, 32);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(201, 377, 192, 32);
		contentPane.add(textField_4);

		JButton btnAddBook = new JButton(" Add Book");
		btnAddBook.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String callno = textField.getText();
				String name = textField_1.getText();
				String author = textField_2.getText();
				String publisher = textField_3.getText();
				String quantity = textField_4.getText();

				BookHash.main(callno, name, author, publisher, quantity);

				JOptionPane.showMessageDialog(null, "added successfully");

			}
		});
		btnAddBook.setBounds(176, 438, 122, 43);
		contentPane.add(btnAddBook);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				LibrarianSection l1 = new LibrarianSection();
				l1.setVisible(true);
				dispose();

			}
		});
		btnNewButton.setBounds(365, 438, 117, 43);
		contentPane.add(btnNewButton);
	}

}
