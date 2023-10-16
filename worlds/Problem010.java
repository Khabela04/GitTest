package worlds;

import stanford.karel.SuperKarel;
//მეორე უჯრაზე მყოფს უნდა გამოვაკლოთ მესამე უჯრაზე მყოფი იმდენჯერ რამდენჯერაც აკლდება 
//და შემდეგ ვთვალოთ ეგ რაოდენობა
public class Problem010 extends SuperKarel {
	public void run(){
		move();
//		სანამ მეორეზე გვიდევს ბიფერები, ავიღოთ მესამიდან ბიფერი, შევინახოთ. მეოთხეში დავამატოთ 1 ბიფერი.
		while(beepersPresent()){
			pickBeeper();
			pickNRestore3();
			putOn4th();
			recoverOnStart();
		}
		}

	private void recoverOnStart() {
// მეოთხედან დაბრუნდეს მეორეზე იყურება აღმოსავლეთით
		turnAround();
		move();
		move();
		turnAround();
	}

	private void putOn4th() {
		// თითო ბიფერს დებს მეოთხეზე
		move();
		putBeeper();
	}

	private void pickNRestore3() {
//		იღებს მესამიდან ბიფერს და ინახავს
		move();
		if(noBeepersPresent()){
			useRestored();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnLeft();
		
			}
		else{
		pickBeeper();
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();
		}}
	

	private void useRestored() {
//  იყენებს შენახულს
		turnLeft();
		move();
		while(beepersPresent()){
		pickBeeper();
		turnAround();
		move();
		putBeeper();
		turnAround();
		move();
		}
		turnAround();
		move();
		turnLeft();
		
		
		
	}
	
	
}
	
