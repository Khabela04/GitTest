import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class midterm2019_3 extends GraphicsProgram{
	private final int CIRCLE_D = 100;
	private final int DELAY = 100;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GObject selectedObject = null;
	GOval circle;
	public void run(){
		addMouseListeners();
	}
	public void mouseClicked(MouseEvent e){
		GObject obj = getElementAt(getX(), getY());
		if(obj == null){
			circle = new GOval(CIRCLE_D, CIRCLE_D);
			add(circle, e.getX() - CIRCLE_D/2, e.getY() -CIRCLE_D/2);
			circle.setFilled(true);
			circle.setColor(rgen.nextColor());
		}
		if(obj == circle){
			while(true){
				int number = rgen.nextInt(1,5);
				if(number == 1){
					obj.setColor(Color.GREEN);
				}
				if(number == 2){
					obj.setColor(Color.RED);
				}
				if(number == 3){
					obj.setColor(Color.BLUE);
				}
				if(number == 4){
					obj.setColor(Color.BLACK);
				}
				if(number == 5){
					obj.setColor(Color.YELLOW);
				}
				pause(DELAY);
				if(obj.getColor() == Color.GREEN){
					break;
				}
			}
		
		}
	}
}

