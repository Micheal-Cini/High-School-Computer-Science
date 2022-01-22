package guiActions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUIActions extends JFrame implements ActionListener{

	JPanel pnl = new JPanel();
	JButton btn = new JButton("Yes");
	JTextField fld = new JTextField(20);
	
	public GUIActions() {
		super.setTitle("Title");
		super.setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		btn.addActionListener((ActionListener) this);
		pnl.add(btn);
		pnl.add(fld);
		add(pnl);
	}
	
	public void actionPerformed(ActionEvent event) {
		fld.setText("The button is clicked");
	}
	
	public static void main(String[] args) {
		GUIActions GUI = new GUIActions();

	}

}
