package calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator implements ActionListener {
	
	JFrame frame;
	JPanel panel;
	private JTextField textField;
	private JButton[] numberButtons = new JButton[10];
	private JButton[] functionButtons = new JButton[9];
	private JButton addBtn, subBtn, divBtn, mulBtn, eqlBtn, decBtn, clrBtn, negBtn, delBtn; 
	private Color myColor = new Color(10,20,40);
	private Font myFont = new Font("Xenera",Font.PLAIN,20);
	char operator;
	double num1 = 0, num2 = 0, result = 0;
	
	
	public Calculator() {

		frame = new JFrame("Calculator");
		frame.setSize(420,550);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	
}
