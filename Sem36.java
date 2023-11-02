//36. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ რამდენჯერ უნდა ავაგდოთ მონეტა რათა 3-ჯერ ზედიზედ ამოვიდეს ბორჯღალო.
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Sem36 extends ConsoleProgram {
	private static final int NUM_EXPERIMENTS = 10000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		double sumFlips = 0;
		for(int i = 0; i < NUM_EXPERIMENTS; i++){
			int currFlips = holdExperiment();
			sumFlips += currFlips;
		}
		double avgFlips = sumFlips / NUM_EXPERIMENTS;
		println(avgFlips);
		
		
	}
	private int holdExperiment() {
		int numFlips = 0;
		int numConsecutiveHead = 0;
		while (true){
			numFlips++;
			boolean isHeads = rgen.nextBoolean(0.05);
			if (isHeads){
				numConsecutiveHead ++;
				if(numConsecutiveHead == 3){
					break;
				}
			}
			else{
				numConsecutiveHead = 0;
			}
		}
		return numFlips;
	}
}