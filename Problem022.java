import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem022 extends GraphicsProgram {
	private static final int NUM_CELLS = 8;
	public void run(){
		double Length = Math.min(getHeight(), getWidth())/NUM_CELLS;
		for(int i = 0; i < NUM_CELLS; i++){
			for(int j = 0; j < NUM_CELLS; j++){
				double x = j* Length;
				double y = i* Length;
				
				boolean isFilled = (i+j)%2 == 1;
				drawSquare(x, y, Length, isFilled);
			}
		}
	}
	private void drawSquare(double x, double y, double length, boolean isFilled) {
		GRect square = new GRect (length, length);
		square.setFilled(isFilled);
		add(square, x, y);
	}

}
// 23-26