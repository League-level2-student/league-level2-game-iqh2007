import java.awt.Color;
import java.awt.Graphics;

public class Grid2 {

	private int yoffset = 0;
	private int xoffset = 0;

	Block block1 = new Block();
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		
		for (int i = 0; i < 20; i++) {
			g.fillRect(0, yoffset, 500, 1);
			yoffset+=40;

		}
		
		yoffset = 0;
		
		for(int i = 0; i < 25; i++) {
			g.fillRect(xoffset, 0, 1, 800);
			xoffset+=40;
		}
		
		xoffset = 0;
		block1.drawBlocks(g);
	}
	
	
	
	
}