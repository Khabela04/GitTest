import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class midterm2019_3 extends GraphicsProgram{

	private final int CIRCLE_D = 100;
	private final int DELAY = 10;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GObject selectedObject = null;
	GOval circle;
	public void run(){
		addMouseListeners();
		while(true){
			pause(DELAY);
			if(selectedObject != null){
				if(selectedObject.getColor()!= Color.GREEN){
					selectedObject.setColor(colorChooser(rgen.nextInt(1,5)));
				}
			}
			else{
					selectedObject = null;
				}
				}
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
			selectedObject = obj;
		
		
		}
	}
	private Color colorChooser(int number){
			if(number == 1){
				return Color.GREEN;
			}
			if(number == 2){
				return Color.RED;
			}
			if(number == 3){
				return Color.BLUE;
			}
			if(number == 4){
				return Color.BLACK;
			}
				return Color.YELLOW;
	}
	}


