package com.Graphics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public  class Cal extends JFrame implements ActionListener 
{
	JFrame j;
	JTextField text1,text2,text3;
	JButton b1,b2,b3,b4;
	Cal()
	{
		j = new JFrame();
		
		JLabel l1 = new JLabel("Number 1");
		JLabel l2 = new JLabel("Number 2");
		JLabel l3 = new JLabel("Answer");
		
		text1 = new JTextField(20);
		text2 = new JTextField(20);
		text3 = new JTextField(20);
		
		b1 = new JButton("ADD");
		b2 = new JButton("SUB");
		b3 = new JButton("MUL");
		b4 = new JButton("DIV");
		
		j.add(l1);
		j.add(text1);
		j.add(l2);
		j.add(text2);
		
		
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		
		j.add(l3);
		j.add(text3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		j.setVisible(true);
		j.setLayout(new FlowLayout());
		j.setSize(300, 300);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("ADD"))
		{
			int n;
			int n1 = Integer.parseInt(text1.getText());
			int n2 = Integer.parseInt(text2.getText());
			n = n1+n2;
			text3.setText(Integer.toString(n));
		}
		if(e.getActionCommand().equals("SUB"))
		{
			int n;
			int n1 = Integer.parseInt(text1.getText());
			int n2 = Integer.parseInt(text2.getText());
			n = n1-n2;
			text3.setText(Integer.toString(n));
		}
		if(e.getActionCommand().equals("MUL")) 
		{
			int n;
			int n1 = Integer.parseInt(text1.getText());
			int n2 = Integer.parseInt(text2.getText());
			n = n1*n2;
			text3.setText(Integer.toString(n));
		}
		if(e.getActionCommand().equals("DIV")) 
		{
			int n;
			int n1 = Integer.parseInt(text1.getText());
			int n2 = Integer.parseInt(text2.getText());
			n = n1/n2;
			text3.setText(Integer.toString(n));
		}
	}

public static void main(String[] args)
{
	Cal C = new Cal();
}
}

