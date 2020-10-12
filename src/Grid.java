/*import java.awt.Color;
import java.awt.Graphics;

public class Grid {

	Block[][] gamestate = new Block[25][40];

	void drawGridState(Graphics g) {

		
		 * Block block2 = new Block(7, 15, Color.BLUE); Block block3 = new Block(15, 2,
		 * Color.GREEN); Block block4 = new Block(22, 9, Color.RED); Block block5 = new
		 * Block(5, 0, Color.GREEN);
		 * 
		 * gamestate[7][15] = block2; gamestate[15][2] = block3; gamestate[22][9] =
		 * block4; gamestate[5][0] = block5;
		 * 
		 

		Block block6 = new Block(7, 0, Color.GREEN);
		Block block7 = new Block(8, 0, Color.BLUE);
		Block block8 = new Block(7, 1, Color.RED);
		Block block9 = new Block(8, 1, Color.YELLOW);

		gamestate[7][0] = block6;
		gamestate[8][0] = block7;
		gamestate[7][1] = block8;
		gamestate[8][1] = block9;

		for (int i = 0; i < gamestate.length; i++) {
			for (int j = 0; j < gamestate[i].length; j++) {

				if ( j % 10 == 0) {
					if(i % 10 ==0) {

					gamestate[i][j] = new Block(i, j, Color.BLACK);
					}
				}
				
				else{
					gamestate[i][j] = new Block(i, j, Color.BLUE);
				}
				Block block = gamestate[i][j];

				if (block != null) {

					g.setColor(block.color);

					g.fillRect(block.row * block.width, block.col * block.height, block.width, block.height);

				}

				g.setColor(Color.WHITE);

				g.drawRect(i * 20, j * 20, 20, 20);

			}
		}

	}

	void updateGridState() {

		for (int i = 0; i < gamestate.length; i++) {
			for (int j = gamestate[i].length - 1; j > 0; j--) {

				gamestate[i][j] = gamestate[i][j - 1];

				if (gamestate[i][j] != null) {
					gamestate[i][j].col++;
				}

			}
		}

	}

	void addBlock() {

	}

}
*/
