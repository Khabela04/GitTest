import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

//39. დაწერეთ პროგრამა სადაც იქნება კანვასზე ბურთის მოძრაობა მარცხენა კედლის შუა წერტილიდან მარჯვენა კედლამდე. 
public class Pr39 extends GraphicsProgram {
	private static final int DELAY = 10;
	private static final int MIN_RADIUS = 20;
	private static final int MAX_RADIUS = 40;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	GOval ball;
	public void run(){
		addBall();
//		moveBall();
		pause(DELAY);
	}
	private void addBall(){
		double radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		ball = new GOval(2 * radius, 2 * radius);
		ball.setFilled(true);
		ball.setColor(rgen.nextColor());
		add(ball, 0, (getHeight()- 2 * radius)/2);
	}
}
