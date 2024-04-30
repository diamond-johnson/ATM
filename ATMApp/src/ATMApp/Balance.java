package ATMApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Balance extends JFrame implements ActionListener{

	JLabel label;
	
	Balance(){
		this.setTitle("ATM");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,700);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0x30d5c8));
		
		label = new JLabel("Your Balance is 19 billion $");
		label.setBounds(300, 250, 400, 50);
		label.setFont(new Font("Arial", Font.PLAIN,20));
		
		this.add(label);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
