package firstGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class FirstFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 * 
	 */
	public FirstFrame() throws InterruptedException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstNumber.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblFirstNumber.setForeground(Color.RED);
		lblFirstNumber.setBackground(Color.RED);
		lblFirstNumber.setBounds(130, 11, 154, 38);
		contentPane.add(lblFirstNumber);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
		       int value = slider.getValue();
		       System.out.println(value);
			}
		});
		slider.setBackground(Color.CYAN);
		slider.setBounds(108, 49, 200, 26);
		contentPane.add(slider);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondNumber.setForeground(Color.RED);
		lblSecondNumber.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblSecondNumber.setBackground(Color.RED);
		lblSecondNumber.setBounds(108, 86, 200, 38);
		contentPane.add(lblSecondNumber);
		
		textField = new JTextField();
		textField.setBounds(163, 135, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setBounds(45, 193, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubtract.setBounds(294, 193, 89, 23);
		contentPane.add(btnSubtract);
		
		JButton btnAverage = new JButton("AVERAGE");
		btnAverage.setBounds(144, 193, 140, 23);
		contentPane.add(btnAverage);
		
		JLabel lblTest = new JLabel("Test");
		lblTest.setBackground(Color.WHITE);
		lblTest.setBounds(318, 49, 48, 14);
		contentPane.add(lblTest);
		
	}
	
	
}
