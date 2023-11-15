import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
//34. კანვასზე დახატეთ 1000 შემთხვევითი რადიუსის მქონე შემთხვევითი ფერით გაფერადებული წრე, შემთხვევით კოორდინატებზე. 
public class Pr34 extends GraphicsProgram {
	private static final int MIN_RADIUS = 40;
	private static final int MAX_RADIUS = 80;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	int radius;
	GOval o;
	public void run(){
		for(int i = 0; i < 1000; i++){
			int radius = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
			o = new GOval(2 * radius, 2 * radius);
			o.setFilled(true);
			o.setColor(rgen.nextColor());
			add(o, rgen.nextDouble(0, getWidth() - 2 * radius), rgen.nextDouble(0, getHeight() - 2 * radius));
		}
	}
}
