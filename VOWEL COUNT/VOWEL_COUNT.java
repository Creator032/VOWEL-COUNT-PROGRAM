package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VOWEL_COUNT extends JFrame implements ActionListener
{
	VOWEL_COUNT() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//-------------------------------------------------------------------------------------	   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\VOWEL_COUNT_VOWEL_COUNT.PNG"));
	   l.setBounds(0, -33, 1000, 800); 
	   getContentPane().add(l);
	
	   setSize(940,760);   // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new VOWEL_COUNT();
	}
	
}