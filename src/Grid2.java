import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Grid2 {

	private int yoffset = 0;
	private int xoffset = 0;

	int blockx = 120;
	int blocky = 120;

	int blockx1 = 140;
	int blocky1 = 140;

	int blocka = 120;
	int blockb = 40;
	int blockc = 160;
	int blockd = 80;

	Block block5 = new Block(blockx, blocky);

	ArrayList<Block> array = new ArrayList<Block>();
	ArrayList<Block> array2 = new ArrayList<Block>();

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);

		for (int i = 0; i < 20; i++) {
			g.fillRect(0, yoffset, 500, 1);
			yoffset += 40;

		}

		yoffset = 0;

		for (int i = 0; i < 25; i++) {
			g.fillRect(xoffset, 0, 1, 800);
			xoffset += 40;
		}

		xoffset = 0;

		/*for (int i = 0; i < 5; i++) {
			// fill this loop with code to draw multiple blocks in formation
			// blocka+=10;
			blockb += 10;

			new Block(blocka, blockb).drawBlocks(g);
		}
		*/

		for (int i = 0; i < 5; i++) {
			// fill this loop with code to draw multiple blocks in formation

			// blockc+=10;
			blockd += 10;
			new Block(blockc, blockd).drawBlocks(g);
		}

		for (int i = 0; i < 5; i++) {
			// for testing blocks falling in formation

			// blockx+=10;
			blocky += 5;
			new Block(blocky, blockx).drawBlocks(g);
		}

		for (int i = 0; i < 0; i++) {
			// one block to fall

			blocky += 5;
			new Block(blocky1, blockx1).drawBlocks(g);
		}

		for (int i = 0; i < array.size(); i++) {
			array.get(i).drawBlocks(g);
		}

		for (int i = 0; i < array2.size(); i++) {
			array2.get(i).drawBlocks(g);
		}

	}

}