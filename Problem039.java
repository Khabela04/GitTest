import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Problem039 extends GraphicsProgram {
	private static final int RADIUS = 50;
	private static final int VELOCITY_X = 2;
	private static final int PAUSE = 2;
	public void run(){
		GOval myOval = new GOval(2*RADIUS, 2*RADIUS);
		add(myOval, 0, getHeight()/2-RADIUS);
		while(myOval.getX() + 2*RADIUS <= getWidth()){
		pause(PAUSE);
		myOval.move(VELOCITY_X, 0);
	}
		while(myOval.getX() > 0){
			pause(PAUSE);
			myOval.move(-VELOCITY_X, 0);
		}
	}
}
