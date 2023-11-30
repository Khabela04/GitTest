import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
//კანვასზე რენდომ ადგილას დახატეთ რენდომ რადიუსის რენდომ ფერით გაფერადებული წრეწირი.
//როდესაც წრეწირს მაუსს დავაქლიქებთ მან რენდომ სიჩქარით რენდომ მიმართულებით უნდა დაიწყოს მოძრაობა. 
//ყოველ ახალ ქლიქზე სიჩქარე რენდომად უნდა იცვლებოდეს. კედლებთან შეჯახებისას ბურთი უნდა ისხლიტებოდეს.

public class Midterm_prac extends GraphicsProgram {
	private static final int RADIUS_MIN = 10;
	private static final int RADIUS_MAX = 50;
	private static final int V_MIN = 1;
	private static final int V_MAX = 5;
	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		addMouseListeners();
		addRandomCircle();
	}
	private void addRandomCircle(){
		double radius = rgen.nextDouble(RADIUS_MIN, RADIUS_MAX);
		GOval circle = new GOval(2 * radius,2 * radius);
		circle.setFilled(true);
		circle.setColor(rgen.nextColor());
		double x = rgen.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0, getHeight() - 2 * radius);
		add(circle, x, y);
	}
}
