import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
public class Problem44 extends GraphicsProgram {
	GOval circle;
	private static final int RADIUS = 50;
	private static final int V_Y = 5;
	public void run(){
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle);
		addMouseListeners();
		while(true){
			circle.move(0,  V_Y);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e){
		add(circle, e.getX() - RADIUS, e.getY() - RADIUS);
	}
}
