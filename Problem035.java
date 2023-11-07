import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
//35. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო 
public class Problem035 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUM_EXPERIMENTS = 1000;
	public void run(){
		double sumFlips = 0;
		double curFlips = 0;
		for( int i = 0; i < NUM_EXPERIMENTS; i++){
			sumFlips += experiments();
		}
		println(sumFlips/NUM_EXPERIMENTS);
	}
	private int experiments(){
		int currFlips = 0;
		while(true){
			boolean isHeads = rgen.nextBoolean();
			if(isHeads){
				break;
			}
			currFlips++;
		}
		return currFlips;
	}
}
