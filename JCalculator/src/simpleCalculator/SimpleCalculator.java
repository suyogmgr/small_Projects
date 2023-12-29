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
	private Color myColor = new Color(10,20,30);
	private Font myFont = new Font("Times New Roman", Font.PLAIN,24);
	
	public SimpleCalculator() {
		frame = new JFrame("Calculator");
		frame.setSize(420,550);
		frame.getContentPane().setBackground(new Color(10,20,30));
		
		
		textField = new JTextField();
		textField.setFont(myFont);
		textField.setBounds(60,25,300,50);
		textField.setEditable(false);
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
			functionButtons[i].setForeground(Color.YELLOW);
			functionButtons[i].setBackground(myColor);
			
		}
		
		for(int i = 0; i < 10; i++) {
			
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
			numberButtons[i].addActionListener(this);
			numberButtons[i].setForeground(Color.YELLOW);
			numberButtons[i].setBackground(myColor);
			
		}
		
		//frame left don't forget
		negBtn.setBounds(60,430,100,50);
		frame.add(negBtn);
		delBtn.setBounds(160,430,100,50);
		frame.add(delBtn);
		clrBtn.setBounds(260,430,100,50);
		frame.add(clrBtn);
		
		
		//panels for now
		panel = new JPanel();
		panel.setBounds(60,100,300,300);
		panel.setFont(myFont);		 
		panel.setLayout(new GridLayout(4,4,10,10)); //row,column,horizontal and vertical gap
		panel.setBackground(Color.BLACK);
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addBtn);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subBtn);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulBtn);
		panel.add(decBtn);
		panel.add(numberButtons[0]);
		panel.add(eqlBtn);
		panel.add(divBtn);
		
		frame.add(panel);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0; i<10; i++) {
			if(e.getSource() == numberButtons[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		
	}
	
}
