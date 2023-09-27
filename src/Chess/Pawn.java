package Chess;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Pawn extends Piece {
	
	ArrayList<Integer> possibleX = new ArrayList<Integer>();
	ArrayList<Integer> possibleY = new ArrayList<Integer>();
	
	public boolean isPawn = true;
	
	public Pawn(boolean white, int x, int y) {
		super(white, x, y);
	}

	@Override
	public void move(int mouseX, int mouseY, Piece p, Board board) {
		possibleX.removeAll(possibleX);
		possibleY.removeAll(possibleY);
		
		int xx = 0;
		int yy = 0;
		
		for(int y = 0; y < board.getBoard().length; y++) {
			for(int x = 0; x < board.getBoard()[y].length; x ++) {
				if(board.getBoard()[y][x] == p) {
					xx = x * 125;
					yy = y * 125;
					System.out.println(xx + " " + yy);
					break;
				}
			}
		}
		
		if(white && mouseY == 750) {
			possibleX.add(xx);
			possibleY.add(yy - 125);
			
			possibleX.add(xx);
			possibleY.add(yy - 250);
		} else if (!white && mouseY == 125) {
			possibleX.add(xx);
			possibleY.add(yy + 125);
			
			possibleX.add(xx);
			possibleY.add(yy + 250);
		} else if(white) {
			possibleX.add(xx);
			possibleY.add(yy - 125);
		} else if(!white) {
			possibleX.add(xx);
			possibleY.add(yy + 125);
		}
	}
	
	public int getPossibleX(int i) {
		return possibleX.get(i);
	}
	
	public int getPossibleY(int i) {
		return possibleY.get(i);
	}
	
	public ArrayList<Integer> getPossibleX() {
		return possibleX;
	}
	
	public ArrayList<Integer> getPossibleY() {
		return possibleY;
	}
	
	public void draw(Graphics g, Canvas c) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i;
		if(white) {
			i = t.getImage("whitePawn.png");
		} else {
			i = t.getImage("blackPawn.png");
		}
		g.drawImage(i, x, y, 125, 125, c);
	}
}
