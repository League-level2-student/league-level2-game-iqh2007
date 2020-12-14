import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
	
	OBLOCK squareblock = new OBLOCK(80,120);
	TBLOCK tblock = new TBLOCK(160, 0);
	JBLOCK jblock = new JBLOCK(120, 360);
	ZBLOCK zblock = new ZBLOCK(240, 80);
	SBLOCK sblock = new SBLOCK(360, 160);
	IBLOCK iblock = new IBLOCK(280, 360);
	LBLOCK lblock = new LBLOCK(160, 240);
	
	public GamePanel() {

		frameDraw = new Timer(1000 / 1, this);
		frameDraw.restart();

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
		
		squareblock.drawBlocks(g);
		tblock.drawBlocks(g);
		jblock.drawBlocks(g);
		zblock.drawBlocks(g);
		sblock.drawBlocks(g);
		iblock.drawBlocks(g);
		lblock.drawBlocks(g);

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
