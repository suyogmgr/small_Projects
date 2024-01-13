package main;

import javax.swing.JFrame;

public class MainClass {
	public static void main(String[] args) {
		
	JFrame frame = new JFrame();
	
	frame.setTitle("GameLoop");
//	frame.setSize(100,200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);

	GamePanel panel = new GamePanel();
	frame.add(panel);
	frame.pack();
	panel.StartThread();
	
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
		
	}
}
