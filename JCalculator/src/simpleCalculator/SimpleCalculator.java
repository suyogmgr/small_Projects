package simpleCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener{
	
	private JFrame frame;
	private JPanel panel;
	private JTextField textField;
	private JButton[] numberButtons = new JButton[10];
	private JButton[] functionButtons = new JButton[9];
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
		
		functionButtons[0] = addBtn;
		functionButtons[1] = subBtn;
		functionButtons[2] = mulBtn;
		functionButtons[3] = divBtn;
		functionButtons[4] = decBtn;
		functionButtons[5] = eqlBtn;
		functionButtons[6] = delBtn;
		functionButtons[7] = clrBtn;
		functionButtons[8] = negBtn;
		
		for(int i = 0; i < 9; i++) {
			
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFocusable(false);
			functionButtons[i].setFont(myFont);
			
		}
		
		for(int i = 0; i < 10; i++) {
			
			
			
		}
		
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
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
