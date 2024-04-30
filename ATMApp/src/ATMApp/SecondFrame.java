package ATMApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SecondFrame extends JFrame implements ActionListener{
	
	JLabel label1;
	Font font = new Font("Arial", Font.PLAIN,20);
	JTextField textField;
	JButton button1;
	
	SecondFrame(){
		this.setTitle("ATM");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,700);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0x30d5c8));
		
		label1 = new JLabel("Enter your password");
		label1.setBounds(360, 250, 200, 50);
		label1.setFont(font);
		
		textField = new JTextField();
		textField.setBounds(350,300,200,27);
		
		button1 = new JButton("Continue");
		button1.setBounds(350,610,200,50);
		button1.setFont(font);
		button1.setFocusable(false);
		button1.addActionListener(this);
		
		this.add(textField);
		this.add(label1);
		this.add(button1);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			this.dispose();
			new MainFrame();
		}
		
	}

}
