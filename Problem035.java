import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
//35. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ რამდენჯერ უნდა ავაგდოთ მონეტა რათა ამოვიდეს ბორჯღალო 
public class Problem035 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUM_EXPERIMENTS = 1000;
	public void run(){
		double sumFlips = 0;
		for( int i = 0; i < NUM_EXPERIMENTS; i++){
			int curFlips = experiments();
			sumFlips += curFlips;
		}
		println((double)sumFlips/NUM_EXPERIMENTS);
	}
	private int experiments(){
		int currFlips = 0;
		while(true){
			currFlips++;
			int header = 0;
			boolean isHeads = rgen.nextBoolean();
			if(isHeads){
				header++;
			}
			if(header==3){
				break;
			}
		}
		return currFlips;
	}
}
