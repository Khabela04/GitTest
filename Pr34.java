import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
//34. კანვასზე დახატეთ 1000 შემთხვევითი რადიუსის მქონე შემთხვევითი ფერით გაფერადებული წრე, შემთხვევით კოორდინატებზე. 
public class Pr34 extends GraphicsProgram {
	private static final int MIN_RADIUS = 40;
	private static final int MAX_RADIUS = 80;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	GOval o;
	public void run(){
		for(int i = 0; i < 1000; i++){
			o = new GOval(rgen.nextInt(2 * MIN_RADIUS, 2 * MAX_RADIUS), rgen.nextInt(2 * MIN_RADIUS, 2 * MAX_RADIUS));
		}
	}
}
