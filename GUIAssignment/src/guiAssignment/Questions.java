package guiAssignment;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Questions extends JFrame {
	
	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
	 */
	
	//Opens the questions and answers frame
	public static void questionsStart() throws FileNotFoundException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questions frame = new Questions();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}



	//Constructor for the questions and answers frame
	public Questions() throws FileNotFoundException {
		
		
		QuestionReader questions = new QuestionReader();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.BLUE);
		setBounds(100, 100, 1024, 768);
		getContentPane().setLayout(null);
		
		ArrayList<String> answers = questions.Answers();
		
		JLabel lblNewLabel = new JLabel(questions.Questions());
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(0, 26, 998, 201);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		JButton btnNextQuestion = new JButton("Next Question");
		btnNextQuestion.setVisible(false);
		btnNextQuestion.setBackground(new Color(255, 140, 0));
		btnNextQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//Opens a new question
				dispose();
				try {
					Questions.questionsStart();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNextQuestion.setBounds(575, 666, 287, 34);
		getContentPane().add(btnNextQuestion);
		
		JButton btnAnswer1 = new JButton(answers.get(0));
		JButton btnAnswer2 = new JButton(answers.get(1));
		JButton btnAnswer3 = new JButton(answers.get(2));
		JButton btnAnswer4 = new JButton(answers.get(3));
		
		btnAnswer1.setBackground(new Color(255, 140, 0));
		btnAnswer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(answers.get(0).equals(answers.get(4))) {
					btnAnswer1.setBackground(Color.GREEN);
					btnAnswer2.setBackground(Color.red);
					btnAnswer3.setBackground(Color.red);
					btnAnswer4.setBackground(Color.red);
					
					btnNextQuestion.setVisible(true);
					
				}
				else {
					btnAnswer1.setBackground(Color.red);
					if (answers.get(2).equals(answers.get(4))){
						btnAnswer3.setBackground(Color.green);
						btnAnswer2.setBackground(Color.red);
						btnAnswer4.setBackground(Color.red);
					}
					else if (answers.get(1).equals(answers.get(4))) {
						btnAnswer2.setBackground(Color.green);
						btnAnswer3.setBackground(Color.red);
						btnAnswer4.setBackground(Color.red);
					}
					else if (answers.get(3).equals(answers.get(4))) {
						btnAnswer4.setBackground(Color.green);
						btnAnswer3.setBackground(Color.red);
						btnAnswer2.setBackground(Color.red);
					}
					btnNextQuestion.setVisible(true);
				}
			}
		});
		btnAnswer1.setBounds(575, 200, 287, 201);
		getContentPane().add(btnAnswer1);
		
		btnAnswer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(answers.get(2).equals(answers.get(4))) {
					btnAnswer3.setBackground(Color.GREEN);
					btnAnswer2.setBackground(Color.red);
					btnAnswer1.setBackground(Color.red);
					btnAnswer4.setBackground(Color.red);
					
					btnNextQuestion.setVisible(true);
					
				}
				else {
					btnAnswer3.setBackground(Color.red);
					if (answers.get(0).equals(answers.get(4))){
						btnAnswer1.setBackground(Color.green);
						btnAnswer2.setBackground(Color.red);
						btnAnswer4.setBackground(Color.red);
					}
					else if (answers.get(1).equals(answers.get(4))) {
						btnAnswer2.setBackground(Color.green);
						btnAnswer1.setBackground(Color.red);
						btnAnswer4.setBackground(Color.red);
					}
					else if (answers.get(3).equals(answers.get(4))) {
						btnAnswer4.setBackground(Color.green);
						btnAnswer1.setBackground(Color.red);
						btnAnswer2.setBackground(Color.red);
					}
					btnNextQuestion.setVisible(true);
				}
			}
		});
		btnAnswer3.setBackground(new Color(255, 140, 0));
		btnAnswer3.setBounds(144, 434, 287, 201);
		getContentPane().add(btnAnswer3);
		
		
		btnAnswer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(answers.get(1).equals(answers.get(4))) {
					btnAnswer2.setBackground(Color.GREEN);
					btnAnswer1.setBackground(Color.red);
					btnAnswer3.setBackground(Color.red);
					btnAnswer4.setBackground(Color.red);
					
					btnNextQuestion.setVisible(true);
					
				}
				else {
					btnAnswer2.setBackground(Color.red);
					if (answers.get(2).equals(answers.get(4))){
						btnAnswer3.setBackground(Color.green);
						btnAnswer1.setBackground(Color.red);
						btnAnswer4.setBackground(Color.red);
					}
					else if (answers.get(0).equals(answers.get(4))) {
						btnAnswer1.setBackground(Color.green);
						btnAnswer3.setBackground(Color.red);
						btnAnswer4.setBackground(Color.red);
					}
					else if (answers.get(3).equals(answers.get(4))) {
						btnAnswer4.setBackground(Color.green);
						btnAnswer3.setBackground(Color.red);
						btnAnswer1.setBackground(Color.red);
					}
					btnNextQuestion.setVisible(true);
				}
			}
		});
		btnAnswer2.setBackground(new Color(255, 140, 0));
		btnAnswer2.setBounds(144, 200, 287, 201);
		getContentPane().add(btnAnswer2);
		
		btnAnswer4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(answers.get(3).equals(answers.get(4))) {
					btnAnswer4.setBackground(Color.GREEN);
					btnAnswer2.setBackground(Color.red);
					btnAnswer3.setBackground(Color.red);
					btnAnswer1.setBackground(Color.red);
					
					btnNextQuestion.setVisible(true);
					
				}
				else {
					btnAnswer4.setBackground(Color.red);
					if (answers.get(2).equals(answers.get(4))){
						btnAnswer3.setBackground(Color.green);
						btnAnswer2.setBackground(Color.red);
						btnAnswer1.setBackground(Color.red);
					}
					else if (answers.get(1).equals(answers.get(4))) {
						btnAnswer2.setBackground(Color.green);
						btnAnswer3.setBackground(Color.red);
						btnAnswer1.setBackground(Color.red);
					}
					else if (answers.get(0).equals(answers.get(4))) {
						btnAnswer1.setBackground(Color.green);
						btnAnswer3.setBackground(Color.red);
						btnAnswer2.setBackground(Color.red);
					}
					btnNextQuestion.setVisible(true);
				}
			}
		});
		btnAnswer4.setBackground(new Color(255, 140, 0));
		btnAnswer4.setBounds(575, 434, 287, 201);
		getContentPane().add(btnAnswer4);
		
		
	}
}
