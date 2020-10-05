import java.awt.Color;
import java.awt.Graphics;

public class Block {

	int row;
	int col;
	int width = 20;
	int height = 20;

	Color color;
	
	boolean falling = true;

	Block(int row, int col, Color color) {
		this.row = row;
		this.col = col;
		this.color = color;
	}

	void drawBlocks(Graphics g) {

	}

	void updateBlock() {

			if(this.falling) {
				row++;
				
			}
		
	}
	

	public void paintComponent(Graphics g) {

	}

}
