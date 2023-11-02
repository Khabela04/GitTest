import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

//34. კანვასზე დახატეთ 1000 შემთხვევითი რადიუსის მქონე შემთხვევითი ფერით გაფერადებული წრე, შემთხვევით კოორდინატებზე. 
public class Problem34Sem extends GraphicsProgram {
	private static final int MIN_RADIUS = 10;
	private static final int MAX_RADIUS = 20;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		for(int i= 0; i<100; i++){
			addRandomCircle();
		}
//		int a = 5;
//		int b = rgen.nextInt();
		
	}
	private void addRandomCircle(){
		int radius = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
		double x = rgen.nextDouble(0, getWidth()-2*radius);
		double y = rgen.nextDouble(0, getHeight()-2*radius);
		Color color = rgen.nextColor();
		GOval oval = new GOval(2*radius, 2*radius);
		oval.setFilled(true);
		oval.setColor(color);
		add(oval,x,y);
	}
}
