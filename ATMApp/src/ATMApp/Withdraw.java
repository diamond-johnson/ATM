package ATMApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Withdraw extends JFrame implements ActionListener{

	Font font = new Font("Arial", Font.PLAIN,20);
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	
	Withdraw(){
		this.setTitle("ATM");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,700);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0x30d5c8));
		
		button1 = new JButton("50000");
		button1.setBounds(10,200,200,50);
		button1.setFont(font);
		button1.setFocusable(false);
		button1.addActionListener(this);
		
		button2 = new JButton("10000");
		button2.setBounds(650,200,200,50);
		button2.setFont(font);
		button2.setFocusable(false);
		button2.addActionListener(this);
		
		button3 = new JButton("500000");
		button3.setBounds(10,400,200,50);
		button3.setFont(font);
		button3.setFocusable(false);
		button3.addActionListener(this);
		
		button4 = new JButton("100000");
		button4.setBounds(650,400,200,50);
		button4.setFont(font);
		button4.setFocusable(false);
		button4.addActionListener(this);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			this.dispose();
			new Result();
		}
		if(e.getSource() == button2) {
			this.dispose();
			new Result();
		}
		if(e.getSource() == button3) {
			this.dispose();
			new Result();
		}
		if(e.getSource() == button4) {
			this.dispose();
			new Result();
		}
		
	}

}
