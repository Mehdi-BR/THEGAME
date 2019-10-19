package firsrGame.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 5516648553238698788L;

	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9 ;
	
	public Game() {
		new Window(WIDTH, HEIGHT, "THE GAME",this);
	}

	public synchronized void start() {
		
		
	}
	public void run() {
		
	
	}
	
	
	public static void main(String args[]) {

}
}