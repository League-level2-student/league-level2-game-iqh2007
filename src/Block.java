import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Block {

	int x;
	int y;
	int width = 40;
	int height = 40;

	Color color;

	boolean falling = true;

	Block(int x, int y) {
		this.x = x;
		this.y = y;
		/*
		 * Random random = new Random(); int randomcolor = random.nextInt(5);
		 * 
		 * if(randomcolor == 0) { this.color = Color.red; }
		 * 
		 * if(randomcolor == 1) { this.color = Color.YELLOW; }
		 * 
		 * if(randomcolor == 2) { this.color = Color.GREEN; }
		 * 
		 * if(randomcolor == 3) { this.color = Color.BLUE; }
		 * 
		 * if(randomcolor == 4) { this.color = Color.ORANGE; }
		 * 
		 */
	}

	void drawBlocks(Graphics g) {

		g.setColor(color);
		g.fillRect(x, y, width, height);

	}

	void updateBlock() {

		if (this.falling) {
			y++;

		}

	}

	public void paintComponent(Graphics g) {

	}

}
