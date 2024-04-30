package ATMApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CardToCard extends JFrame implements ActionListener{

	JLabel label1;
	JLabel label2;
	Font font = new Font("Arial", Font.PLAIN,20);
	JTextField textField1;
	JTextField textField2;
	JButton button1;
	
	CardToCard(){
		this.setTitle("ATM");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,700);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0x30d5c8));
		
		label1 = new JLabel("Enter the price");
		label1.setBounds(360, 250, 200, 50);
		label1.setFont(font);
		
		textField1 = new JTextField();
		textField1.setBounds(350,300,200,27);
		
		label2 = new JLabel("Enter the card number");
		label2.setBounds(360, 340, 200, 50);
		label2.setFont(font);
		
		textField2 = new JTextField();
		textField2.setBounds(350,390,200,27);
		
		button1 = new JButton("OK");
		button1.setBounds(350,570,200,50);
		button1.setFont(font);
		button1.setFocusable(false);
		button1.addActionListener(this);
		
		this.add(label1);
		this.add(label2);
		this.add(textField1);
		this.add(textField2);
		this.add(button1);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			this.dispose();
			new Result();
		}
		
	}

}
