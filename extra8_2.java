import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class extra8_2 extends GraphicsProgram{
	public void run(){
		int length = 100;
		Color col = Color.BLUE;
		boolean filled = true;
		addSquare(length, col, filled);
	}
	private void addSquare(int length, Color col, boolean filled){
		GRect square = new GRect(length, length);
		square.setFilled(filled);
		square.setColor(col);
		add(square, (getWidth() - length)/2, (getHeight()- length)/2);
	}
}