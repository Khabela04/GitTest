package worlds;
//კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
import stanford.karel.Karel;

public class Problem09 extends Karel {
	public void run(){
		move();
		move();
		multiplication();}

	private void multiplication(){
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			turnLeft();
			while(beepersPresent()){
				pickBeeper();
				move();
				move();
				move();
				putBeeper();
				
				turnLeft();
				turnLeft();
				move();
				move();
				move();
				turnLeft();
				turnLeft();
			}
			move();
			move();
			move();
			while(beepersPresent()){
				pickBeeper();
				turnLeft();
				turnLeft();
				move();
				putBeeper();
				move();
				if(beepersPresent()){
				move();
				turnLeft();
				turnLeft();
				putBeeper();
				move();
				move();
				move();	}
				else{
					turnLeft();
					turnLeft();
					move();
					move();
			}}
			turnLeft();
			turnLeft();
			move();
			move();
			
			turnLeft();
			turnLeft();		}
	}

}
