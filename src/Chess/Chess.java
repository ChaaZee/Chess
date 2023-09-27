package Chess;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;

public class Chess extends Canvas implements Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8036059935051777800L;
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 1000;
	
	private Thread gameThread;
	public boolean running = false;
	
	public Board board;
	
	public Chess() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		
		board = new Board();
		new Window(this);
		
		MouseInput mouseinput = new MouseInput(this, board);
		this.addMouseMotionListener(mouseinput);
		this.addMouseListener(mouseinput);
		this.setFocusable(true);
	}

	@Override
	public void run() {
		this.requestFocus();

		// game timer
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if (delta >= 1) {
				update();
				delta--;
				draw();
				frames++;
			}

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				//System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}
	
	public void draw() {
		BufferStrategy buffer = this.getBufferStrategy();
		if(buffer == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = buffer.getDrawGraphics();
		
		board.draw(g);
		board.drawPieces(g, this);
		
		g.dispose();
		buffer.show();
	}
	
	private void update() {
		
	}
	
	public void start() {
		gameThread = new Thread(this);
		gameThread.start();
		running = true;	
	}
	
	public void stop() {
		try {
			gameThread.join();
			running = false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Chess();
	}
}
