import java.awt.Color;
import java.awt.Graphics;

public class Grid {

	Block[][] gamestate = new Block[25][40];

	void drawGridState(Graphics g) {
		
		Block block2 = new Block(2, 2, Color.BLUE);
		
		gamestate[2][2] = block2;

		for (int i = 0; i < gamestate.length; i++) {
			for (int j = 0; j < gamestate[i].length; j++) {

				Block block = gamestate[i][j];

				if (block != null) {

					g.setColor(block.color);

					g.fillRect(block.row*block.width, block.col*block.height, block.width, block.height);
					
					

				}
				
				

				g.setColor(Color.WHITE);

				g.drawRect(i * 20, j * 20, 20, 20);

			}
		}

	}

	void updateGridState() {

	}

}
