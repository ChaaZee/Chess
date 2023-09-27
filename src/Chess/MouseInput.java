package Chess;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferStrategy;

public class MouseInput extends MouseAdapter {
	
	private Chess chess;
	private Board board;
	public int mouseX;
	public int mouseY;
	private int x;
	private int y;
	private Piece prevPiece;

	public MouseInput(Chess chess, Board board) {
		this.chess = chess;
		this.board = board;
	}
	
	public void mousePressed(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		x = round(mouseX)/125;
		y = round(mouseY)/125;
		
		prevPiece = board.getPiece(y, x);
		//System.out.println("(" + mouseX + "," + mouseY + ") " + " [" + y + "][" + x + "]");
	}
	
	public void mouseDragged(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		
		if(board.board[y][x] != null) {
			mouseX = e.getX();
			mouseY = e.getY();
			board.board[y][x].setX(mouseX - 62);
			board.board[y][x].setY(mouseY - 62);
			//System.out.println("(" + mouseX + "," + mouseY + ") " + " [" + y + "][" + x + "]");
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		boolean possible = false;
		
		mouseX = e.getX();
		mouseY = e.getY();
		board.board[y][x].move(x * 125, y * 125, board.board[y][x], board);
		
		for(int i = 0; i < board.board[y][x].getPossibleX().size(); i++) {
			if(board.board[y][x].getPossibleX(i) == round(mouseX) && board.board[y][x].getPossibleY(i) == round(mouseY)) {
				possible = true;
			}
		}

		
		if(board.board[round(mouseY)/125][round(mouseX)/125] == null && possible) {
			board.setPiece(y, x, null);

			x = round(mouseX)/125;
			y = round(mouseY)/125;
			
			board.setPiece(y, x, prevPiece); 
		} else if(board.board[round(mouseY)/125][round(mouseX)/125] != null && (!board.board[y][x].isWhite() && board.board[round(mouseY)/125][round(mouseX)/125].isWhite()) && possible && !board.board[y][x].isPawn) {
			board.board[round(mouseY)/125][round(mouseX)/125] = board.board[y][x];
			board.board[y][x] = null;
		} else if(board.board[y][x].isPawn) {
			
		} else {
			board.board[y][x].setX(x*125);
			board.board[y][x].setY(y*125);
		}
		
		
		//System.out.println("(" + mouseX + "," + mouseY + ") " + " [" + y + "][" + x + "]");
	}
	
	public static int round(int i) {
		int n = (int)(i/125) * 125;
		return n;
	}
}
