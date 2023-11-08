import java.awt.Color;

import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem039 extends GraphicsProgram {
	private static final int RADIUS = 50;
	private static final int VELOCITY_X = 2;
	private static final int PAUSE = 2;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		GOval myOval = new GOval(2 * RADIUS, 2 * RADIUS);
		add(myOval, 0, getHeight() / 2 - RADIUS);
		myOval.setFilled(true);
		myOval.setColor(Color.BLUE);
		while (myOval.getX() + 2 * RADIUS <= getWidth()) {
			pause(PAUSE);
			myOval.move(VELOCITY_X, 0);
			for (int j = 0; j < 100; j++) {
				GOval Oval = new GOval(2 * RADIUS, 2 * RADIUS);
				int y = rgen.nextInt(0, getHeight()- 2*RADIUS);
				add(Oval, 0, y);
				int vx = rgen.nextInt();
				Oval.move(vx, 0);
				Oval.setFilled(true);
				Oval.setColor(Color.BLUE);
			
			}
		
		for (int i = 0; i < 25; i++) {
			while (myOval.getX() + 2 * RADIUS <= getWidth()) {
				pause(PAUSE);
				myOval.move(VELOCITY_X, 0);
				for (int j = 0; j < 100; j++) {
					GOval Oval = new GOval(2 * RADIUS, 2 * RADIUS);
					int y = rgen.nextInt(0, getHeight()- 2*RADIUS);
					add(Oval, 0, y);
					int vx = rgen.nextInt();
					Oval.move(vx, 0);
					Oval.setFilled(true);
					Oval.setColor(Color.BLUE);
				
				}
			}
			while (myOval.getX() > 0) {
				pause(PAUSE);
				myOval.move(-VELOCITY_X, 0);
			}
		}
	}
}
