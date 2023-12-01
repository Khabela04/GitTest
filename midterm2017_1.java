import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
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
	GLabel text;
	GPoint point;
	public void run(){
		addMouseListeners();
		GRect square = new GRect(BOX_SIZE, BOX_SIZE);
		add(square, (getWidth() - BOX_SIZE)/2, (getHeight() - BOX_SIZE)/2);
		text = new GLabel(""+n);
		add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
	}
	public void mouseClicked(MouseEvent e){
		x1 = e.getX();
	}

	public void mouseDragged(MouseEvent e){
		x2 = e.getX();
//		if(getElementAt(getX(), getY()) != null){
//			if(getElementAt(x1, y1) != null){
//				if(point.getX() > e.getX()){
				if(x1 > x2){
					remove(text);
					
					text = new GLabel("" + e.getX());
					add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
					return;
				}
//				}
//				if(point.getX() < e.getX() ){
//					n++;
//					add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
//				}
//			}
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