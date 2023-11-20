import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//43. წრეწირის drag ით გადაადგილება 
public class Practice43 extends GraphicsProgram {
	private static final int RADIUS = 5;
	GOval oval;
	public void run(){
		createOval();
		addMouseListeners();
	}
	private void createOval() {
		oval = new GOval(2 * RADIUS, 2 * RADIUS);
		add(oval, (getWidth() - 2 * RADIUS) / 2, (getHeight() - 2 * RADIUS) / 2); 
	}
	public void mouseDragged(MouseEvent e){
		oval.move(e.getX() - oval.getX(), e.getY() - oval.getY());
	}
}
