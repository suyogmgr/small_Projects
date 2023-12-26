package simpleCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class SimpleCalculator {
	
	private JFrame frame;
	private JPanel panel;
	private JTextField textField;
	private JButton[] numberButtons = new JButton[10];
	private JButton[] functionsButtons = new JButton[9];
	private JButton addBtn, subBtn, mulBtn, divBtn, delBtn, negBtn, eqlBtn, decBtn, clrBtn;
	private char operator;
	private double num1 =0, num2 = 0, result = 0;
	private Color mycolor = new Color(10,20,30);
	private Font myFont = new Font("Times New Roman", Font.PLAIN,28);
	
	public SimpleCalculator() {
		frame = new JFrame("Calculator");
		frame.setSize(420,550);
		
		textField = new JTextField();
		textField.setFont(myFont);
		textField.setBounds(60,25,300,50);
		frame.add(textField);
		
		addBtn = new JButton("+");
		subBtn = new JButton("-");
		mulBtn = new JButton("*");
		divBtn = new JButton("/");
		delBtn = new JButton("Del");
		negBtn = new JButton("(-)");
		eqlBtn = new JButton("=");
		decBtn = new JButton(".");
		clrBtn = new JButton("Clr");
		
//		panel = new JPanel();
//		panel.setBounds(60,100,300,300);
//		panel.setBackground(Color.red);
//		panel.setLayout(new GridLayout(2,2,20,20));
//		panel.add(addBtn);
//		panel.add(subBtn);
//		panel.add(negBtn);
//		panel.add(clrBtn);
//		panel.add(decBtn);
//		panel.add(eqlBtn);
//		frame.add(panel);
		
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
