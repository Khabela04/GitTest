import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

//ამოცანა 2. (25 ქულა) ცხრილი
//გრაფიკულ პროგრამაში კანვასი დაანაწევრეთ უჯრებად ისე რომ ერთგვარი 8x8-
//ზე ცხრილი შეიქმნას.(როგორც სურათზეა მოცემული)
//თავიდან ყველა უჯრა თეთრია. თითოეულ უჯრაზე მაუსით დაკლიკებისას
//1) თუკი თეთრ უჯრაზე დაეკლიკა მაშინ ეს უჯრა უნდა გაფერადდეს შავად.
//2) თუკი შავ უჯრაზე დაეკლიკა მაშინ ეს უჯრა უნდა გაფერადდეს თეთრად.
//ოღონდ ორზე მეტი შავი უჯრა ერთდოულად არ შეიძლება რომ იყოს. შესაბამისად
//თუკი უკვე 2 უჯრაა გაშავებული და მომხმარებელმა თეთრ უჯრაზე დააკლიკა, ამ
//შემთხვევაში, იმ ორი შავი უჯრიდან რომელიც უფრო ადრე გაშავდა ის უნდა
//გათეთრდეს, ხოლო თეთრი უჯრა რომელზეც მომხმარებელმა დააკლიკა უნდა
//გაშავდეს(შედეგად ისევ 2 შავი უჯრა გვექნება).
//ამოხსნა დაწერეთ grid.java ფაილში


public class midterm2022_2 extends GraphicsProgram{
	int rows = 8;
	int columns = 8;
	GObject prevBlack = null;
	GObject curBlack = null;
	double length = Math.min(getWidth(), getHeight())/columns;
	public void run(){
		addGrids();
	}
	private void addGrids(){
		double x = 0;
		double y = 0;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				GRect square = new GRect(length, length);
				square.setFilled(true);
				square.setFillColor(Color.WHITE);
				add(square, x, y);
				x += length;
			}
			y+= length;
		}
	}
	public void mouseClicked(MouseEvent e){
		int counter = 0;
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null){
			if(obj.getColor() == Color.WHITE){
				if(counter == 2){
					prevBlack.setColor(Color.WHITE);
					prevBlack = curBlack;
				}
				obj.setColor(Color.BLACK);
				if(prevBlack == null){
					prevBlack = obj;
				}
				if(prevBlack != null){
					curBlack = obj;
				}
				counter++;
			}else{
				obj.setColor(Color.WHITE);
			}
			
		}
	}
}
