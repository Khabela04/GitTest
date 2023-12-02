import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;
/*ამოცანა 3. ტეხილი (25 ქულა)
დაწერეთ პროგრამა რაომელიც მომხმარებელს მისცემს საშუალებას მაუსის
დახმარებით დახატოს ტეხილი. მოთხოვნები:
ტეხილის სათავე დაფიქსირებულია და მდებარეობს (0,0) წერტილში.მაუსის
ყოველ კლიკზე დაფაზე უნდა დაემატოს ახალი GLine რომლის ერთი წვერო არის
ტეხილის ბოლო წერტილი, ხოლო მეორე წვერო კი, წერტილი სადაც მოხდა მაუსის
კლიკი. მაგალითად თუ მომხმარებელმა პირველად დააკლიკა (10, 100) წერტილზე, მაშინ თქვენმა პროგრამამ დაფაზე უნდა დაამატოს (0, 0) წერტილიდან (10, 100)
წერტილამდე მონაკვეთი. ხოლო თუ მეორე დაჭერისას მომხმარებელმა
დააკლიკა (5, 5) წერტილზე, დაფაზე უნდა დაემატოს (10, 100) წერტილიდან (5, 5)
წერტილამდე მონაკვეთი. ყოველი მაუსის გაჩოჩებისას(mouseDragged) პროგრამა უნდა ხატავდეს
მონაკვეთის მოძრაობას, რომლის ერთი ბოლო დაფიქსირებულია ტეხილის ბოლო
წერტილში, ხოლო მეორე ბოლო დაყვება მაუსის ისარს. ისევე როგორც ეს ხდება
პროგრამაში Paint. ამოხსნა დაწერეთ zigzag.java ფაილში*/
public class zigzag extends GraphicsProgram {
	double lastX = 0;
	double lastY = 0;
	GLine line;
	public void run(){
		addMouseListeners();
		
	}
	public void mouseClicked(MouseEvent e){
		if(line != null){
			remove(line);
		}
		int curX = e.getX();
		int curY = e.getY();
		line = new GLine (lastX, lastY, curX, curY);
		add(line);
		lastX = curX;
		lastY = curY;
		
	}
	public void mouseDragged(MouseEvent e){
		line.setEndPoint(e.getX(), e.getY());
	}
}
