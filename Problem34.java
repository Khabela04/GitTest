import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem34 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int AMOUNT = 100000;
	private static final int MIN_RADIUS = 10;
	private static final int MAX_RADIUS = 20;
	public void run(){
		for (int i = 0; i < AMOUNT; i++){
			drawCircle();
		}
	}
	private void drawCircle(){
		int randRadius = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
		Color color = rgen.nextColor();
		double x = rgen.nextDouble(0, getWidth()- 2*randRadius);
		double y = rgen.nextDouble(0, getHeight() - 2*randRadius);
		GOval oval = new GOval (2*randRadius, 2* randRadius);
		oval.setFilled(true);
		oval.setColor(color);
		add(oval, x, y);
	}
}
