import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import javafx.scene.input.MouseEvent;
//43. წრეწირის drag ით გადაადგილება 
public class Problem43 extends GraphicsProgram {
	GOval o;
	private static final int RADIUS = 50;
	private double prevX;
	private double prevY;
	public void run(){
		o = new GOval(2*RADIUS, 2*RADIUS);
		add(o, getWidth()/2-RADIUS, getHeight() / 2 - RADIUS);
		o.setFilled(true);
		addMouseListeners();
		
	}
	public void mouseDragged(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null){
//			move
			obj.move(e.getX()-prevX, e.getY()-prevY);
//			update value
			prevX = e.getX();
			prevY = e.getY();
		}
	}
//	public void mousePressed(MouseEvent e){
//		GObject obj = getElementAt(e.getX(), e.getY());
//		if(obj != null){
////			move
//			obj.move(e.getX()-prevX, e.getY()-prevY);
////			update value
//			prevX = e.getX();
//			prevY = e.getY();
//		}
//	}
	
}
