package worlds;

import stanford.karel.Karel;

//კარელმა უნდა გაყოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n / m ბრილიანტი. ჩათვალეთ, რომ n
//ზუსტად იყოფა m-ზე და კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
public class Problem10 extends Karel {
	public void run(){
		move();
		while(beepersPresent()){
		
			pickBeeper();
			move();
			while(beepersPresent()){
				pickBeeper();
				move();
				putBeeper();
			
		}
			turnLeft();
			turnLeft();
			move();
			move();
			turnLeft();
			turnLeft();
			}
	}

}
