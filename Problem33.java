import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
// 33. დაწერეთ პროგრამა რომელიც კანვასზე დახატავს შემთხვევითი ფერის მქონე წრეწირს, რაიდიუსიც შემთხვევით აირჩეით შეზღუდული რეინჯიდან.  
public class Problem33 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int MIN_RADIUS = 10;
	private static final int MAX_RADIUS = 20;
	GOval o;
	public void run(){
		o = new GOval(2 * rgen.nextInt(MIN_RADIUS, MAX_RADIUS), 2 * rgen.nextInt(MIN_RADIUS, MAX_RADIUS));
		o.setFilled(true);
		o.setColor(rgen.nextColor());
		add(o, 20, 400);
	}
}
