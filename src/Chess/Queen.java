package Chess;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Queen extends Piece{

	public Queen(boolean white, int x, int y) {
		super(white, x, y);
	}

	@Override
	public void move(int mouseX, int mouseY, Piece p, Board board) {
		throw new UnsupportedOperationException("Queen move unavailable");
	}

	@Override
	public void draw(Graphics g, Canvas c) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i;
		if(white) {
			i = t.getImage("whiteQueen.png");
		} else {
			i = t.getImage("blackQueen.png");
		}
		g.drawImage(i, x, y, 125, 125, c);
	}

	@Override
	public ArrayList<Integer> getPossibleX() {
		throw new UnsupportedOperationException("Queen getPossibleX unavailable");
	}

	@Override
	public ArrayList<Integer> getPossibleY() {
		throw new UnsupportedOperationException("Queen getPossibleY unavailable");
	}

	@Override
	public int getPossibleX(int i) {
		throw new UnsupportedOperationException("Queen getPossibleX ArrayList unavailable");
	}

	@Override
	public int getPossibleY(int i) {
		throw new UnsupportedOperationException("Queen getPossibleY ArrayList unavailable");
	}

}
