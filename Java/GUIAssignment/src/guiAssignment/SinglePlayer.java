package guiAssignment;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class SinglePlayer extends JFrame {

	
	private JPanel countdown;

	/**
	 * Launch the application.
	 * @return 
	 */
	
	//SinglePlayer Method
	public static void SinglePlayerMode() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglePlayer frame = new SinglePlayer();//Runs the SnglePlayer JFrame
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
	
	Timer t;
	//constructor for the timer frame
	public SinglePlayer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		countdown = new JPanel();
		countdown.setBackground(Color.BLUE);
		countdown.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(countdown);
		countdown.setLayout(null);
		
		JLabel lblCount = new JLabel("5");
		lblCount.setForeground(new Color(255, 140, 0));
		lblCount.setFont(new Font("Tahoma", Font.PLAIN, 99));
		lblCount.setBounds(259, 178, 490, 372);
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		countdown.add(lblCount);
		
		//A timer that counts down from 5
		t = new Timer(1000, new ActionListener() {
			int sec = 4;
			public void actionPerformed(ActionEvent e) {
				lblCount.setText(""+sec);//Changes the text of the lbl to the timer
				sec--;
				if (sec==-1) {
					t.stop();
					setVisible(false);
					try {
						Questions.questionsStart();//Runs the Questions Class
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
		});
		t.start();
		
		
	}
}
