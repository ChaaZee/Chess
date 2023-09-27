package Chess;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Board {
	
	public Piece[][] board = new Piece[8][8];
	
	Color tan = new Color(210, 180, 140);
	Color brown = new Color(101, 67, 33);
	
	Color dTan = tan.darker();
	Color dBrown = brown.darker();
	
	public Board() {
		resetBoard();	
	}
	
	public void resetBoard() {
		Rook bRook1 = new Rook(false, 0, 0);
		Knight bKnight1 = new Knight(false, 125, 0);
		Bishop bBishop1 = new Bishop(false, 250, 0);
		King bKing = new King(false, 375, 0);
		Queen bQueen = new Queen(false, 500, 0);
		Rook bRook2 = new Rook(false, 875, 0);
		Knight bKnight2 = new Knight(false, 750, 0);
		Bishop bBishop2 = new Bishop(false, 625, 0);
		
		Pawn bPawn1 = new Pawn(false, 0, 125);
		Pawn bPawn2 = new Pawn(false, 125, 125);
		Pawn bPawn3 = new Pawn(false, 250, 125);
		Pawn bPawn4 = new Pawn(false, 375, 125);
		Pawn bPawn5 = new Pawn(false, 500, 125);
		Pawn bPawn6 = new Pawn(false, 625, 125);
		Pawn bPawn7 = new Pawn(false, 750, 125);
		Pawn bPawn8 = new Pawn(false, 875, 125);
		
		Pawn wPawn1 = new Pawn(true, 0, 750);
		Pawn wPawn2 = new Pawn(true, 125, 750);
		Pawn wPawn3 = new Pawn(true, 250, 750);
		Pawn wPawn4 = new Pawn(true, 375, 750);
		Pawn wPawn5 = new Pawn(true, 500, 750);
		Pawn wPawn6 = new Pawn(true, 625, 750);
		Pawn wPawn7 = new Pawn(true, 750, 750);
		Pawn wPawn8 = new Pawn(true, 875, 750);
		
		Rook wRook1 = new Rook(true, 0, 875);
		Knight wKnight1 = new Knight(true, 125, 875);
		Bishop wBishop1 = new Bishop(true, 250, 875);
		King wKing = new King(true, 375, 875);
		Queen wQueen = new Queen(true, 500, 875);
		Rook wRook2 = new Rook(true, 875, 875);
		Knight wKnight2 = new Knight(true, 750, 875);
		Bishop wBishop2 = new Bishop(true, 625, 875);
		
		board[0][0] = bRook1;
		board[0][1] = bKnight1;
		board[0][2] = bBishop1;
		board[0][3] = bKing;
		board[0][4] = bQueen;
		board[0][5] = bBishop2;
		board[0][6] = bKnight2;
		board[0][7] = bRook2;
		
		board[1][0] = bPawn1;
		board[1][1] = bPawn2;
		board[1][2] = bPawn3;
		board[1][3] = bPawn4;
		board[1][4] = bPawn5;
		board[1][5] = bPawn6;
		board[1][6] = bPawn7;
		board[1][7] = bPawn8;
		
		board[6][0] = wPawn1;
		board[6][1] = wPawn2;
		board[6][2] = wPawn3;
		board[6][3] = wPawn4;
		board[6][4] = wPawn5;
		board[6][5] = wPawn6;
		board[6][6] = wPawn7;
		board[6][7] = wPawn8;
		
		board[7][0] = wRook1;
		board[7][1] = wKnight1;
		board[7][2] = wBishop1;
		board[7][3] = wKing;
		board[7][4] = wQueen;
		board[7][5] = wBishop2;
		board[7][6] = wKnight2;
		board[7][7] = wRook2;
	}
	
	public void draw(Graphics g) {
		
		g.setColor(tan);
		g.fillRect(0, 0, 1000, 1000);
		
		g.setColor(brown);
		g.fillRect(0, 125, 125, 125);
		g.fillRect(0, 375, 125, 125);
		g.fillRect(0, 625, 125, 125);
		g.fillRect(0, 875, 125, 125);

		g.fillRect(125, 0, 125, 125);
		g.fillRect(125, 250, 125, 125);
		g.fillRect(125, 500, 125, 125);
		g.fillRect(125, 750, 125, 125);
		
		g.fillRect(250, 125, 125, 125);
		g.fillRect(250, 375, 125, 125);
		g.fillRect(250, 625, 125, 125);
		g.fillRect(250, 875, 125, 125);
		
		g.fillRect(375, 0, 125, 125);
		g.fillRect(375, 250, 125, 125);
		g.fillRect(375, 500, 125, 125);
		g.fillRect(375, 750, 125, 125);
		
		g.fillRect(500, 125, 125, 125);
		g.fillRect(500, 375, 125, 125);
		g.fillRect(500, 625, 125, 125);
		g.fillRect(500, 875, 125, 125);
		
		g.fillRect(625, 0, 125, 125);
		g.fillRect(625, 250, 125, 125);
		g.fillRect(625, 500, 125, 125);
		g.fillRect(625, 750, 125, 125);
		
		g.fillRect(750, 125, 125, 125);
		g.fillRect(750, 375, 125, 125);
		g.fillRect(750, 625, 125, 125);
		g.fillRect(750, 875, 125, 125);
		
		g.fillRect(875, 0, 125, 125);
		g.fillRect(875, 250, 125, 125);
		g.fillRect(875, 500, 125, 125);
		g.fillRect(875, 750, 125, 125);
		
		//g.setColor(dTan);
		//g.fillOval(250 + 36, 250 + 36, 50, 50);
		//g.setColor(dBrown);
		//g.fillOval(375 + 36, 250 + 36, 50, 50);
	}
	
	public Piece[][] getBoard(){
		return board;
	}
	
	public void drawPieces(Graphics g, Canvas c) {
		for(int y = 0; y < board.length; y++) {
			for(int x = 0; x < board[y].length; x++) {
				if(board[y][x] == null) {
					continue;
				} else {
					board[y][x].draw(g, c);
				}
				
			}
		}
	}
	
	public Piece getPiece(int y, int x){
		return board[y][x];
	}
	
	public void setPiece(int y, int x, Piece p) {
		board[y][x] = p;
		if(p != null) {
			board[y][x].setX(x * 125);
			board[y][x].setY(y * 125);
		}
	}
}
