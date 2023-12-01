

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;


public class midterm2021_3 extends GraphicsProgram{
		GLine point;
		double xStart = 0;
		double yStart = 0;
		public void run(){
			addMouseListeners();
			drawLine();
		}
		private void drawLine(){
			point = new GLine(xStart, yStart, 0, 0);
			add(point);
			
		}
		public void mouseDragged(MouseEvent e){
			point.setEndPoint(e.getX(), e.getY());
		}
		public void mouseClicked(MouseEvent e){
			point.setEndPoint(e.getX(), e.getY());
			xStart = e.getX();
			yStart = e.getY();
		}
	}