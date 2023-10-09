package worlds;
//კარელმა უნდა გამოაკლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n-m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს და ჩათვალეთ, რომ n>=m.
import stanford.karel.Karel;

public class Problem08 extends Karel {
	public void run(){
		move();
		importN();
		move();
		Deduction();

	}
	private void importN(){
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			turnLeft();
			turnLeft();
			move();
			move();
			turnLeft();
			turnLeft();
		}
	}
	private void Deduction(){
		while(beepersPresent()){
			pickBeeper();
			move();
			if(beepersPresent()){
			pickBeeper();}
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			turnLeft();}
	}
}
