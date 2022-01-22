package guiAssignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;

public class GUIAssignment extends JFrame {

	/*
	 * 
	 * Micheal Cini
	 * GUI Assignment
	 * 
	 */
	
	
	private JPanel contentPane;
	private JTextField txtMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAssignment frame = new GUIAssignment();//Runs the JFrame
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
	public GUIAssignment() {
		//Constructor with the JFrame information
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMenu = new JTextField();
		txtMenu.setEditable(false);
		txtMenu.setFont(new Font("Freestyle Script", Font.PLAIN, 83));
		txtMenu.setText("Welcome to Micheals Trivia Extravaganza!");
		txtMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenu.setForeground(new Color(255, 165, 0));
		txtMenu.setBackground(Color.BLUE);
		txtMenu.setBounds(10, 11, 988, 148);
		contentPane.add(txtMenu);
		txtMenu.setColumns(10);
		txtMenu.setBorder(null);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//Action Listener for when a button is pressed
				SinglePlayer.SinglePlayerMode();//Calls on the SinglePlayer Method
				setVisible(false);//Closes the JFrame
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 42));
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setBounds(165, 275, 677, 289);
		contentPane.add(btnNewButton);
		
		JLabel lblPlay = new JLabel("Ready To Play?");
		lblPlay.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlay.setForeground(new Color(255, 140, 0));
		lblPlay.setFont(new Font("Freestyle Script", Font.PLAIN, 47));
		lblPlay.setBounds(357, 170, 294, 53);
		contentPane.add(lblPlay);
		
	}
}
