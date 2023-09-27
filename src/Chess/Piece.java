package Chess;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;

public abstract class Piece {
	
	public boolean isPawn = false;
	public boolean isKing = false;
	public boolean isQueen = false;
	public boolean isKnight = false;
	public boolean isBishop = false;
	public boolean isRook = false;
	
	public boolean white;
	public int x;
	public int y;

	public Piece(boolean white, int x, int y) {
		this.white = white;
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isWhite() {
		return white;
	}
	
	public abstract void move(int mouseX, int mouseY, Piece p, Board board);
	public abstract void draw(Graphics g, Canvas c);
	public abstract ArrayList<Integer> getPossibleX();
	public abstract ArrayList<Integer> getPossibleY();
	public abstract int getPossibleX(int i);
	public abstract int getPossibleY(int i);

	public void move() {
		// TODO Auto-generated method stub
		
	}
}
