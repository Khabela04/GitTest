import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//43. წრეწირის drag ით გადაადგილება 
public class Problem43 extends GraphicsProgram {
	private GOval o;
	private static final int RADIUS = 50;
	private double prevX;
	private double prevY;
	public void run(){
		o = new GOval(2*RADIUS, 2*RADIUS);
		o.setFilled(true);
		add(o, getWidth()/2-RADIUS, getHeight() / 2 - RADIUS);
		addMouseListeners();
		
	}
	public void mousePressed(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
//			move
//			update value
			prevX = e.getX();
			prevY = e.getY();
		}
	
	public void mouseDragged(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
//			move
			obj.move(e.getX()-prevX, e.getY()-prevY);
//			update value
			prevX = e.getX();
			prevY = e.getY();
		}
	}

	

