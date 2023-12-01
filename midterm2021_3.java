

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;


public class midterm2021_3 extends GraphicsProgram{
	GPoint point;
	GLine line;
	public void run(){
		addMouseListeners();
		point = new GPoint(0,0);
	}
	public void mouseClicked(MouseEvent e){
		line = new GLine(point.getX(), point.getY(), e.getX(), e.getY());
		add(line);
		point = new GPoint(e.getX(), e.getY());
	}
	public void mouseDragged(MouseEvent e){
		line.setEndPoint(e.getX(), e.getY());
	}
}

	