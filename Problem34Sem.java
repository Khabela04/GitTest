import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//34. კანვასზე დახატეთ 1000 შემთხვევითი რადიუსის მქონე შემთხვევითი ფერით გაფერადებული წრე, შემთხვევით კოორდინატებზე. 
public class Problem34Sem extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		println(rgen.nextInt());
	}
}
