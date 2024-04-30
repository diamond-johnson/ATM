package ATMApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{

	JLabel label1;
	JLabel label2;
	Font font = new Font("Arial", Font.PLAIN,16);
	JButton button1;
	JButton button2;
	
	MyFrame(){
		this.setTitle("ATM");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,700);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0x30d5c8));
		
		button1 = new JButton("English");
		button1.setBounds(0,300,150,50);
		button1.setFont(font);
		button1.setFocusable(false);
		button1.addActionListener(this);
		
		label1 = new JLabel("Choose your language");
		label1.setBounds(250, 300, 200, 50);
		label1.setFont(new Font("Arial", Font.PLAIN,16));
		
		label2 = new JLabel("زبان خود را انتخاب کنید");
		label2.setBounds(500, 300, 200, 50);
		label2.setFont(new Font("Arial", Font.PLAIN,20));
		
		button2 = new JButton("فارسی");
		button2.setBounds(750,300,150,50);
		button2.setFont(font);
		button2.setFocusable(false);
		
		this.add(button1);
		this.add(label1);
		this.add(label2);
		this.add(button2);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			this.dispose();
			new SecondFrame();
		}
		
	}
}
