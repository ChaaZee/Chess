package Chess;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Rook extends Piece{

	public Rook(boolean white, int x, int y) {
		super(white, x, y);
	}

	@Override
	public void move() {
		
	}

	@Override
	public void draw(Graphics g, Canvas c) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i;
		if(white) {
			i = t.getImage("whiteRook.png");
		} else {
			i = t.getImage("blackRook.png");
		}
		g.drawImage(i, x, y, 125, 125, c);
	}

}
