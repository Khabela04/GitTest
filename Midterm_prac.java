import java.awt.event.MouseEvent;

import acm.graphics.GObject;
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
	private static final int DELAY = 100;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GOval circle;
	private int v_x = 0;
	private int v_y = 0;
	public void run(){
		addMouseListeners();
		addRandomCircle();
		while(true){
			if(circle.getX() < 0 || circle.getX() > getWidth() - circle.getWidth()){
				v_x = -v_x;
			}
			if(circle.getY() < 0 || circle.getY() > getWidth() - circle.getWidth()){
				v_y = -v_y;
			}
			circle.move(v_x, v_y);
			pause(DELAY);
		}
		
	}
	private void addRandomCircle(){
		double radius = rgen.nextDouble(RADIUS_MIN, RADIUS_MAX);
		circle = new GOval(2 * radius,2 * radius);
		circle.setFilled(true);
		double x = rgen.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0, getHeight() - 2 * radius);
		add(circle, x, y);
	}
	@Override
	public void mouseClicked(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null){
			v_x = getRandomSpeed();
			v_y = getRandomSpeed();
			circle.setColor(rgen.nextColor());
		}
		
	}
	private int getRandomSpeed(){
		int v = rgen.nextInt(V_MIN, V_MAX);
		boolean negSpeed = rgen.nextBoolean();
		if(negSpeed){
			v = -v;
		}
		return v;
	}
	
	
}
