import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
//35. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო 
public class Pr35 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	int numFlips = 0;
	int curFlips;
	int sumFlips;
	public void run(){
		tossACoin();
		for(int i = 0; i < 10000; i++){
			curFlips = tossACoin();
			sumFlips += curFlips;
		}
		double avg = (double)(sumFlips)/10000;
		println(avg);
	}
	private int tossACoin(){
		numFlips = 0;
		while(true){
		boolean revSide = rgen.nextBoolean();
		if(revSide){
			numFlips ++;
		}
		else{
			return numFlips;
		}
	}
	}
}
