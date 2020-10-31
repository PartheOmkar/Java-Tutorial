package com.Graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ProgramNo12 extends JFrame implements ActionListener
{
JFrame j;
JButton b1;
JTextField t1,t2;
JLabel l1,l2;
ProgramNo12()
	{
	j = new JFrame();
	j.setLayout(new FlowLayout());
	j.setSize(300,300);
	b1 = new JButton("Square");
	t1 = new JTextField(20);
	t2 = new JTextField(20);
	l1 = new JLabel("Enter a Number");
	l2 = new JLabel("Square of Number");
	
	j.add(l1); j.add(t1);
	j.add(l2); j.add(t2);
	b1.addActionListener(this);
	j.add(b1);
	j.setVisible(true);
	
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("Square"));
		{
			int n;
			int n1 = Integer.parseInt(t1.getText());
			n=n1*n1;
			t2.setText(Integer.toString(n));
		}
	}
public static void main(String args[])
{
	ProgramNo12 p = new ProgramNo12();
}
}