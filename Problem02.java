import stanford.karel.Karel;

public class Problem02 extends Karel {
//2. კარელი დგას 1x1 უჯრაზე. 5x1 უჯრაზე დევს 10 ცალი ბრილიანტი, კარელმა ათივე
//	ბრილიანტი უნდა გადაიტანოს 6x1 უჯრაზე.
	public void run(){
		
		
	for(int i=0; i<4; i++) {
		move();
	}
	for(int i=0; i<10; i++) {
		pickBeeper();
	}
		
		move();
	for(int i=0; i<10; i++) {
		putBeeper();
	}
		
	}
}
// Problems 3-7