import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Pr36 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	int numFlips = 0;
	int curFlips;
	int sumFlips;
	int tailsCount;
	public void run(){
		tossACoin();
		for(int i = 0; i < 10000; i++){
			sumFlips += tossACoin();
		}
		double avg = (double)(sumFlips)/3*10000;
		println(avg);
	}
	private int tossACoin(){
		numFlips = 0;
		tailsCount = 0;
		while(true){
		boolean revSide = rgen.nextBoolean();
		numFlips ++;
		if(revSide){
			tailsCount ++;
			if(tailsCount ==3){
				break;
			}
			else{
				tailsCount = 0;
			}
		}
	}
			return numFlips;
		}
	}

