import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
//35. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო 
public class Pr35 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	int numFlips = 0;
	public void run(){
		tossACoin();
		for(int i = 0; i < 1000; i++){
			tossACoin();
		}
		int avg = numFlips/1000;
		println(avg);
	}
	private int tossACoin(){
		while(true){
		boolean revSide = rgen.nextBoolean();
		if(!revSide){
			numFlips ++;
		}
		else{
			return numFlips;
		}
		return numFlips;
	}
	}
}
