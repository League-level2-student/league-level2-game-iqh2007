import java.awt.Graphics;

public class LBLOCK extends Block{

	LBLOCK(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	void drawBlocks(Graphics g) {
		
		new Block(x, y).drawBlocks(g);
		new Block(x + 40, y).drawBlocks(g);
		new Block(x + 80, y).drawBlocks(g);
		new Block(x + 80, y - 40).drawBlocks(g);
		
		y += 40;

	}

}
