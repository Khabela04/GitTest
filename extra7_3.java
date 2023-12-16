import acm.program.ConsoleProgram;

public class extra7_3 extends ConsoleProgram{
	public void run(){
		double number = readInt("Give me a number");
		for(int i = 1; i < number + 1; i++){
			if(number % i == 0){
				println(i);
			}
		}
	}
}
