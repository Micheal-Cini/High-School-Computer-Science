package GUIExampleLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIExample extends JFrame {

	GridLayout x = new GridLayout(2,2);
	JPanel grid = new JPanel(x);
	
	JButton btn4=new JButton("1");
	JButton btn5=new JButton("2");
	JButton btn6=new JButton("3");
	JButton btn7=new JButton("4");
	
	public GUIExample() {
		grid.add(btn4);
		grid.add(btn5);
		grid.add(btn6);
		grid.add(btn7);
		
		add(grid);
		super.setTitle("Layouts");
		setSize(540,550);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GUIExample GUI = new GUIExample();

	}

}
