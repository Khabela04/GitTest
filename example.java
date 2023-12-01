import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class example extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GOval oval = null;
	public void run() {
		addMouseListeners();
		while(true){
			pause(100);
			if(oval != null){
				if(oval.getFillColor() != Color.GREEN){
					oval.setFillColor(getColor(rgen.nextInt() % 4));
				}else{
					oval = null;
				}
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		GObject object = getElementAt(e.getX(), e.getY());
		if (object == null) {
			addCircle(e.getX(), e.getY());
		} else {
			oval = (GOval) object;
		}
	}

	private Color getColor(int i) {
		if (i == 0) {
			return Color.BLACK;
		}
		if (i == 1) {
			return Color.RED;
		}
		if (i == 2) {
			return Color.BLUE;
		}
		return Color.GREEN;
	}

	private void addCircle(int x, int y) {
		GOval oval = new GOval(100, 100);
		oval.setFilled(true);
		oval.setFillColor(rgen.nextColor());
		add(oval, x - 50, y - 50);
	}
}
