package studentManage;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame{
	
	JLabel titleL,rollnoL,passwordL;
	JTextField rollTf,passwordTf;
	JButton loginB;
	
	public Login() {
		titleL = new JLabel("STUDENT MANAGEMENT SYSTEM");
		titleL.setBounds(10,10,500,60);
		titleL.setFont(new Font("Serif",Font.BOLD,27));
		titleL.setForeground(Color.GREEN);
		add(titleL);
		
		rollnoL = new JLabel("Roll No.");
		rollnoL.setBounds(80, 150, 100, 20);
		rollnoL.setFont(new Font("Serif",Font.BOLD,21));
		add(rollnoL);
		
		rollTf = new JTextField();
		rollTf.setBounds(200, 150, 200, 30);
		add(rollTf);
		
		passwordL = new JLabel("Password");
		passwordL.setBounds(80, 200, 100, 20);
		passwordL.setFont(new Font("Serif",Font.BOLD,21));
		add(passwordL);
		passwordTf = new JTextField();
		passwordTf.setBounds(200, 190, 200, 30);
		add(passwordTf);
		
		loginB = new JButton("LOGIN");
		loginB.setBounds(200, 250, 80, 40);
		loginB.setForeground(Color.YELLOW);
		loginB.setBackground(Color.BLACK);
		add(loginB);
		getContentPane().setBackground(Color.GRAY);
		loginB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mainPage mP =new mainPage();
				mP.setVisible(true);
				
				getContentPane().hide();
				
			}
			
		});
	}

}
