import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Grid {

	private int yoffset = 0;
	private int xoffset = 0;

	int blockx1 = 240;
	int blocky1 = 0;

	int blockx2 = 80;
	int blocky2 = 120;

	int blockx3 = 40;
	int blocky3 = 0;

	int blockx4 = 160;
	int blocky4 = 200;

	int blockx5 = 320;
	int blocky5 = 160;

	int blockx6 = 80;
	int blocky6 = 360;

	int blockx7 = 360;
	int blocky7 = 360;

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

		//shape7(g);
		// Z BLOCK

		//shape6(g);
		// S BLOCK

		//shape5(g);
		//Square BLOCK

		//shape4(g);
		// L BLOCK

		//shape3(g);
		// J BLOCK

		//shape2(g);
		// I BLOCK

		//shape1(g);
		// T BLOCK

	}

	void shape3(Graphics g) {

		new Block(blockx1, blocky1).drawBlocks(g);
		new Block(blockx1 + 40, blocky1).drawBlocks(g);
		new Block(blockx1 + 80, blocky1).drawBlocks(g);
		new Block(blockx1 + 80, blocky1 + 40).drawBlocks(g);
		blocky1 += 40;
		//finished

	}

	void shape4(Graphics g) {

		new Block(blockx2, blocky2).drawBlocks(g);
		new Block(blockx2 + 40, blocky2).drawBlocks(g);
		new Block(blockx2 + 80, blocky2).drawBlocks(g);
		new Block(blockx2 + 80, blocky2 - 40).drawBlocks(g);
		blocky2 += 40;

	}

	void shape5(Graphics g) {
		new Block(blockx5, blocky5).drawBlocks(g);
		new Block(blockx5 + 40, blocky5).drawBlocks(g);
		new Block(blockx5, blocky5 + 40).drawBlocks(g);
		new Block(blockx5 + 40, blocky5 + 40).drawBlocks(g);

		blocky5 += 40;
		//finished

	}

	void shape6(Graphics g) {
		new Block(blockx6, blocky6).drawBlocks(g);
		new Block(blockx6 + 40, blocky6).drawBlocks(g);
		new Block(blockx6, blocky6 + 40).drawBlocks(g);
		new Block(blockx6 - 40, blocky6 + 40).drawBlocks(g);

		blocky6 += 40;
		//finished

	}

	void shape7(Graphics g) {
		new Block(blockx7, blocky7).drawBlocks(g);
		new Block(blockx7 - 40, blocky7).drawBlocks(g);
		new Block(blockx7, blocky7 + 40).drawBlocks(g);
		new Block(blockx7 + 40, blocky7 + 40).drawBlocks(g);

		blocky7 += 40;
		//finished

	}

	void shape1(Graphics g) {
		new Block(blockx4, blocky4).drawBlocks(g);
		new Block(blockx4 + 40, blocky4).drawBlocks(g);
		new Block(blockx4 + 80, blocky4).drawBlocks(g);
		new Block(blockx4 + 40, blocky4 - 40).drawBlocks(g);
		blocky4 += 40;
		//finished
	}

	void shape2(Graphics g) {
		new Block(blockx3, blocky3).drawBlocks(g);
		new Block(blockx3 + 40, blocky3).drawBlocks(g);
		new Block(blockx3 + 80, blocky3).drawBlocks(g);
		new Block(blockx3 + 120, blocky3).drawBlocks(g);
		blocky3 += 40;
	}

}