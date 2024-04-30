package ATMApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Result extends JFrame implements ActionListener{
	
	JLabel label;

	Result(){
		
		this.setTitle("ATM");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,700);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0x30d5c8));
		
		label = new JLabel("Successfully done!");
		label.setBounds(360, 250, 200, 50);
		label.setFont(new Font("Arial", Font.PLAIN,20));
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
