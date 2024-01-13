package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 1000;
	final int FPS = 120;
	Thread gameThread;
	KeyHandler keyH = new KeyHandler();
	
	
	//starting position of the player/object/shapes
	int alphaX = 150;
	int betaY = 150;
	int playerSpeed = 2; //2 pixels per sec
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setBackground(Color.BLACK);
		this.setLayout(null);
		this.addKeyListener(keyH);
		this.setFocusable(true);
	}

	
	public void StartThread() {
		
		gameThread = new Thread(this);
		gameThread.start();
		
	}
	
	@Override
	public void run() {
		
		double timeInterval = 1000000000/FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		long timer = 0;
		long drawCount = 0;
		while(gameThread != null) {
			
			currentTime = System.nanoTime();
			delta += (currentTime - lastTime) / timeInterval;
			timer += (currentTime - lastTime);
			
			lastTime = currentTime;
			
			if(delta >= 1) {
				update();
				repaint();
				delta--;
				drawCount++;
			}
			if(timer >= 1000000000) {
				System.out.println("FPS:"+drawCount);
				timer = 0;
				drawCount = 0;
			}
		}
		
	}
	
	public void update() {
		if(keyH.up == true) {
			betaY -= playerSpeed;
		}
		
		if(keyH.down == true) {
			betaY += playerSpeed;
		}
		
		if(keyH.left == true) {
			alphaX -= playerSpeed; 
		}
		
		if(keyH.right == true) {
			alphaX += playerSpeed;
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(alphaX, betaY, 100, 100);
		g.dispose();
	}
	
}
