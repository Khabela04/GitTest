import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
//გააკეთეთ Paint-ის ფანქრის ანალოგიური ხელსაწყო. კერძოდ, მაუსის ყოველ მოძრაობაზე ეკრანზე დაამატეთ გაფერადებული წრეწირები იმავე წერტილში სადაც მაუსი მდებარეობს. 
//გააკეთეთ Paint-ის ფანქრის ანალოგიური ხელსაწყო.
//კერძოდ, მაუსის ყოველ მოძრაობაზე ეკრანზე დაამატეთ გაფერადებული წრეწირები იმავე წერტილში სადაც მაუსი მდებარეობს. 
public class Problem41 extends GraphicsProgram {
	private static final int RADIUS = 20;
	public void run(){
		
		addMouseListeners();
	}
	@Override
	public void mouseDragged(MouseEvent e){
		GOval brush = new GOval(2*RADIUS, 2 * RADIUS);
		brush.setFilled(true);
		int x = e.getX()-RADIUS;
		int y = e.getY() -RADIUS;
		add(brush, x, y);
	}
	public void mousePressed(MouseEvent e){
		addBrush(e.getX(), e.getY());
	}
	private void addBrush(int centerX, int centerY){
		GOval brush = new GOval(2*RADIUS, 2 * RADIUS);
		brush.setFilled(true);
		int x = centerX-RADIUS;
		int y = centerY -RADIUS;
		add(brush, x, y);
	}
}
