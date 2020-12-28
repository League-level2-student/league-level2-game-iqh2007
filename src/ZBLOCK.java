import java.awt.Graphics;

public class ZBLOCK extends Block {

	ZBLOCK(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	void drawBlocks(Graphics g) {
		
		new Block(x, y).drawBlocks(g);
		new Block(x - 40, y).drawBlocks(g);
		new Block(x, y + 40).drawBlocks(g);
		new Block(x + 40, y + 40).drawBlocks(g);

		if (y < 660) {
			y += 40;

		}
	}

}
