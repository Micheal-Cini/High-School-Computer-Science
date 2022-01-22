package jFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrams extends JFrame {
	
	JPanel panel = new JPanel();
	
	JLabel lbl1=new JLabel ("Custom Background");
	JLabel lbl2 = new JLabel ("Custom Foreground");
	JLabel lbl3 = new JLabel ("Custom Font");
	
	Color customColor=new Color(255,0,3);
	
	Font customFont = new Font ("Serif",Font.PLAIN,32);
	
	public JFrams()
	
	{
		setTitle("Hello");
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
		
		lbl1.setOpaque(true);
		lbl1.setBackground(Color.YELLOW);
		
		lbl
	}
	
	public static void main(String[] args) {
		
	}

}
