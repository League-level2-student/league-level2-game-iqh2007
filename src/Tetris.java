import javax.swing.JFrame;

/*
 * classes:
 * block class, gamepanel, class containing grid?
 * 
 * gamepanel: 
 *
 * - timer
 * - update methods for game, menu, and end state
 * - draw game, menu, and end state
 * - action performed method
 * - key typed, key pressed, key released
 * 
 * array class:
 * 
 * (contain grid, locate filled in rows and remove)
 * 
 * - int[][] arr2d = new int [10][17];
 * - original tetris grid 10 by 17 approximately
 * 
 * block class: 
 * 5 blocks:
 * 1 by 4
 * 2 by 2
 *
 * other 3 are difficult to describe
 * 
 * tetris class:
 * 
 * - (setup method) to contain all JFrames, panels, buttons, etc.
 * - size of frame
 * - main method w/ constructor? 
 * 
 */



public class Tetris {

	JFrame frame;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	GamePanel gamepanel;

	public Tetris() {

		frame = new JFrame();
		gamepanel = new GamePanel();

	}
	
public static void main(String[] args) {
		
		Tetris tetris = new Tetris();
		tetris.setup();
		
		}
	
void setup() {
	
	
}
	
	
	

}
