

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsEventsSample extends GraphicsProgram {
	private GRect rect;
	private GRect rect2;
	public void init(){
		rect = new GRect(100, 100);
		rect.setFilled(true);
		add(rect);
		
		rect2 = new GRect(100, 100);
		rect2.setFilled(true);
		add(rect2, 200, 200);
		
		addMouseListeners();
	}
	public void run(){
		while(true){
			pause(10);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e){
//		System.out.println("here");
		e.getX();
		GObject obj = getElementAt(e.getX(), e.getY());
		
		if(obj != null){
			obj.setColor(Color.RED);
		}
	}
}
