package worlds;

import stanford.karel.Karel;

//კარელმა უნდა შეკრიბოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n+m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.
public class Problem0006 extends Karel {
	public void run(){ 
		move();
		while(beepersPresent()){
		if(beepersPresent()){
		pickNBeeper();
		putNBeeper();
		goStartPosition();
		
		}
		}
		
		if (noBeepersPresent()){
			move();
			move();
			move();}
			while(beepersPresent()){
				pickBeeper();
				turnLeft();
				turnLeft();
				move();
				move();
				move();
				putBeeper();
				turnLeft();
				turnLeft();
				move();
				move();
				move();
				}
			
		
		turnLeft();
		turnLeft();
		
		move();
		move();
			while(beepersPresent()){
				pickNBeeper();
				putMBeeper();
				goStartBPosition();
				}
			
				turnLeft();
				turnLeft();
				move();
				move();
				while(beepersPresent()){
				pickNBeeper();
				turnLeft();
				turnLeft();
				move();
				move();
				putBeeper();
				turnLeft();
				turnLeft();
				move();
				move();}
			}
			
		
		
	private void pickNBeeper(){
		if(beepersPresent()){
			pickBeeper();
		}
	}
	private void putNBeeper(){
		move();
		move();
		putBeeper();
		move();
		putBeeper();
	}
	private void goStartPosition(){
		turnLeft();
		turnLeft();
		move();
		move();
		move();
		turnLeft();
		turnLeft();
	}
	private void putMBeeper(){
		turnLeft();
		turnLeft();
		move();
		putBeeper();
		move();
		putBeeper();
	}
	private void goStartBPosition(){
		turnLeft();
		turnLeft();
		move();
		move();
		
		
	
	}
}