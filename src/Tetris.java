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
	public static final int WIDTH = 481;
	public static final int HEIGHT = 783;
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

		frame.add(gamepanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(gamepanel);

	}

}


// perhaps add key listener and use space to rotate? Rotate formation by finding original 
//block and adding certain values to x and y? have yet to figure out. Have this
//process done for each formation, randomize what block falling from the top, change color per 
//formation, and finish moving blocks using arrow keys. (key listener)



