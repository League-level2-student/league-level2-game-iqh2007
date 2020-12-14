import java.awt.Graphics;

public class IBLOCK extends Block{

	IBLOCK(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	void drawBlocks(Graphics g) {
		
		new Block(x, y).drawBlocks(g);
		new Block(x + 40, y).drawBlocks(g);
		new Block(x + 80, y).drawBlocks(g);
		new Block(x + 120, y).drawBlocks(g);
		
		y += 40;
		
	}

}
