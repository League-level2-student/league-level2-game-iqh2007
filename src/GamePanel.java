import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	Timer frameDraw;

	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;

	int currentState = MENU;

	Font titleFont1 = new Font("Times New Roman", Font.PLAIN, 48);
	Font titleFont2 = new Font("Times New Roman", Font.PLAIN, 25);

	Grid grid = new Grid();

	/*OBLOCK squareblock = new OBLOCK(80, 120);
	TBLOCK tblock = new TBLOCK(160, 0);
	JBLOCK jblock = new JBLOCK(120, 360);
	ZBLOCK zblock = new ZBLOCK(240, 80);
	SBLOCK sblock = new SBLOCK(360, 160);
	IBLOCK iblock = new IBLOCK(280, 360);
	LBLOCK lblock = new LBLOCK(160, 240);
	*/
	
	Random random = new Random();
	
	Block block;

	public GamePanel() {

		frameDraw = new Timer(1000 / 1, this);
		frameDraw.restart();
		
		int i = random.nextInt(7);

		if(i == 0){
			block = new OBLOCK(160,40);
		}
		
		else if(i == 1){
			block = new TBLOCK(160,40);
		}
		
		else if(i == 2){
			block = new JBLOCK(160,40);
		}
		
		else if(i == 3){
			block = new ZBLOCK(160,40);
		}
		
		else if(i == 4){
			block = new SBLOCK(160,40);
		}
		
		else if(i == 5){
			block = new IBLOCK(160,40);
		}
		
		else if(i == 6){
			block = new LBLOCK(160,40);
		}

		/*
		 - find a way to keep steady flow of blocks randomly
		 (spawn new one after previous touches the bottom, 
		 may prove difficult as must find original block in each formation)
		 - move blocks, side to side
		 - allow blocks to rotate
		
		 - start removing rows once filled
		 
		  - make score board
		  
		  -final touches
		 */
		
	}

	void updateMenuState() {

	}

	void updateGameState() {

	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Tetris.WIDTH, Tetris.HEIGHT);

		g.setFont(titleFont1);
		g.setColor(Color.YELLOW);
		g.drawString("Tetris", 187, 200);

		g.setFont(titleFont2);
		g.setColor(Color.YELLOW);
		g.drawString("Press ENTER to start", 140, 300);

	}

	void drawGameState(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Tetris.WIDTH, Tetris.HEIGHT);

		grid.draw(g);
		
		block.drawBlocks(g);
		/*squareblock.drawBlocks(g);
		tblock.drawBlocks(g);
		jblock.drawBlocks(g);
		zblock.drawBlocks(g);
		sblock.drawBlocks(g);
		iblock.drawBlocks(g);
		lblock.drawBlocks(g);
		 */
	}

	void drawEndState(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Tetris.WIDTH, Tetris.HEIGHT);

		g.setFont(titleFont1);
		g.setColor(Color.YELLOW);
		g.drawString("Game Over", 135, 200);

		g.setFont(titleFont2);
		g.setColor(Color.YELLOW);
		g.drawString("Press ENTER to continue", 125, 300);

	}

	@Override
	public void paintComponent(Graphics g) {

		if (currentState == MENU) {
			drawMenuState(g);
		}

		else if (currentState == GAME) {
			drawGameState(g);

		}

		else if (currentState == END) {
			drawEndState(g);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END) {
				currentState = MENU;
			} else {
				currentState++;
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		System.out.println("action");
		repaint();
		// grid.updateGridState();

	}

}
