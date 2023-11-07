import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem035 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUM_EXPERIMENTS = 1000;
	public void run(){
		double sumFlips = 0;
		double curFlips = 0;
		for( int i = 0; i < NUM_EXPERIMENTS; i++){
			sumFlips ++;
			if (isHeads()){
				break;
			}
		}
		double avg = sumFlips/1000;
		println(avg);
	}
	private boolean isHeads(){
		boolean heads = rgen.nextBoolean();
		return heads;
	}
}
