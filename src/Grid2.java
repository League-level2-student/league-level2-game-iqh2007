import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Grid2 {

	private int yoffset = 0;
	private int xoffset = 0;
	
	  int blockx = 120;
	  int blocky = 120;

	Block block1 = new Block(40, 120);
	Block block2 = new Block(80, 40);
	Block block3 = new Block(80, 160);
	Block block4 = new Block(200, 80);
	Block block5 = new Block(blockx, blocky);

    ArrayList<Block> array = new ArrayList<Block>();
    
  

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
		block1.drawBlocks(g);
		block2.drawBlocks(g);
		block3.drawBlocks(g);
		block4.drawBlocks(g);
		
		/*for(int i = 0; i < 5; i++) {
			//fill this loop with code to draw multiple blocks in formation
			blockx+=10;
			blocky+=10;
			new Block(blockx, blocky).drawBlocks(g);
		}
		*/
	
		
		array.add(block1);
		array.add(block2);
		array.add(block3);
		array.add(block4);
		
		for(int i = 0; i < array.size(); i++) {
			array.get(i).drawBlocks(g);
		}
		

		
	}

}