import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class midterm2019_3 extends GraphicsProgram{
	private final int CIRCLE_D = 100;
	private final int DELAY = 100;
	private RandomGenerator rgen;
	private GObject selectedObject = null;

	@Override
	public void init() {
		addMouseListeners();
		rgen = RandomGenerator.getInstance();
	}

	public void run() {
		while (true) {
			if (selectedObject != null) {
				while (selectedObject.getColor() != Color.GREEN) {
					Color color = myRandomColor();
					selectedObject.setColor(color);
//					println(selectedObject);
					pause(DELAY);
				}
				selectedObject = null;
			}
//			println("E");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();

		GObject object = getElementAt(x, y);
		println(object);
		if (object == null) {
			GOval oval = new GOval(CIRCLE_D, CIRCLE_D);
			add(oval, x - CIRCLE_D / 2, y - CIRCLE_D / 2);
			oval.setFilled(true);
			oval.setColor(myRandomColor());
		} else {
			selectedObject = object;
		}
	}

	private Color myRandomColor() {
		int randomNum = rgen.nextInt(5);
		if (randomNum == 0)
			return Color.GREEN;
		if (randomNum == 1)
			return Color.RED;
		if (randomNum == 2)
			return Color.BLUE;
		if (randomNum == 3)
			return Color.BLACK;
		return Color.YELLOW;
	}
//	private final int CIRCLE_D = 100;
//	private final int DELAY = 10;
//	private RandomGenerator rgen = RandomGenerator.getInstance();
//	private GObject selectedObject = null;
//	GOval circle;
//	public void run(){
//		addMouseListeners();
//		while(true){
//			if(selectedObject != null){
//				while(selectedObject.getColor()!= Color.GREEN){
//					Color color = colorChooser();
//					selectedObject.setColor(color);
//					add(selectedObject);
//					pause(DELAY);
//				}
//				selectedObject = null;
//			}
//		}
//	}
//	public void mouseClicked(MouseEvent e){
//		GObject obj = getElementAt(getX(), getY());
//		if(obj == null){
//			circle = new GOval(CIRCLE_D, CIRCLE_D);
//			add(circle, e.getX() - CIRCLE_D/2, e.getY() -CIRCLE_D/2);
//			circle.setFilled(true);
//		}
//		if(obj == circle){
//			selectedObject = obj;
//		
//		
//		}
//	}
//	private Color colorChooser(){
//			int number = rgen.nextInt(1,5);
//			if(number == 1){
//				return Color.GREEN;
//			}
//			if(number == 2){
//				return Color.RED;
//			}
//			if(number == 3){
//				return Color.BLUE;
//			}
//			if(number == 4){
//				return Color.BLACK;
//			}
//				return Color.YELLOW;
//	}
	}


