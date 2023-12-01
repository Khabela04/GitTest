import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/*განჯრის ცენტრში მოთავსებულია ჩარჩო, რომელშიც ნაჩვენებია ქულის რიცხვითი მნიშვნელობა. ჩარჩო კვადრატული ფორმისაა,
 მისი ზომა მოცემულია BOX_SIZE კონსტანტის საშუალებით და იგი განთავსებულია ფანჯრის ცენტრში. 
 ქულის რიცხვითი მნიშვნელობა წარმოადგენს GLabel-ს და ისიც ფანჯრის ცენტშია განთავსებული.
გარდა ვიზუალური ნაწილისა პროგრამა უნდა აკმაყოფილებდეს შემდეგ მოთხოვნებს:
ჩარჩოს შიგნით მარჯვნიდან მარცხნივ მაუსის დრაგზე, ქულის მნიშნელობა უნდა მცირდებოდეს ერთით. თუ მნიშვნელობა 0-ია მაშინ იგი უცვლელი უნდა რჩებოდეს.
ჩარჩოს შიგნით, მარცხნიდან მარჯვნივ დრაგზე კი, ქულის მნიშვნელობა უნდა იზრდებოდეს ერთით. 
თუ ქულის მნიშვნელობა 9-ის ტოლია მაშინ იგი უცვლელი უნდა დარჩეს.
შენიშვნა: დავუშვათ მაუსის ღილაკზე დაჭერის მომენტში მისი ლოკაცია იყო (x1, y1), ხოლო აშვების მომენტში (x2, y2). 
თუ ორივე წერტილი მდებარეობს ჩარჩოს შიგნით და x1 > x2 ზე მაშინ მაუსის ეს მოძრაობა შეესაბამება მარჯვნიდან მარცხნივ დრაგს. 
თუ x1 < x2 ზე მაშინ პირიქით, მარცხნიდან მარჯვნივ დრაგს.
*/



public class midterm2017_1 extends GraphicsProgram{
	private static final int BOX_SIZE = 100;
	double x1 = 0;
	double x2 = 0;
	double y1 = 0;
	int n = 0;
	GRect square;
	GLabel text;
	GPoint point;
	public void run(){
		addMouseListeners();
		square = new GRect(BOX_SIZE, BOX_SIZE);
		add(square, (getWidth() - BOX_SIZE)/2, (getHeight() - BOX_SIZE)/2);
//		square.setFilled(true);
		text = new GLabel(""+n);
		add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
	}
	public void mousePressed(MouseEvent e){
		x1 = e.getX();
		y1 = e.getY();
	}
	public void mouseClicked(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null){
			obj.setColor(Color.RED);
		}
	}
	public void mouseDragged(MouseEvent e){
		square.setLocation(e.getX() - BOX_SIZE/2, e.getY() - BOX_SIZE/2);
	}

	public void mouseReleased(MouseEvent e){
		x2 = e.getX();
		if(getElementAt(e.getX(), e.getY()) == square){
			if(getElementAt(x1, y1) == square){
				
				if(x1 > x2){
					if(n > 0){
						n--;
					}
					remove(text);
					text = new GLabel("" + n);
					add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
				}
				if(x1 < x2){
					if(n<9){
					n++;
					}
					remove(text);
					text = new GLabel("" + n);
					add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
				}
//				}
//				if(point.getX() < e.getX() ){
//					n++;
//					add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
//				}
//			}
				}}
		}
	
//	public void mouseDragged(MouseEvent e){
//		if(x1>x2){
//			remove(text);
//			n--;
//			text = new GLabel(""+n);
//			add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
//		}
//		if(x1<x2){
//			remove(text);
//			n++;
//			text = new GLabel(""+n);
//			add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
//		}
//	}

}