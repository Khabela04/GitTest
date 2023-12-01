import acm.program.ConsoleProgram;

public class midterm2017_2 extends ConsoleProgram{
	public void run(){
		int number = readInt("Give me a number");
		int maximum = 0;
		for(int i = 0; i < number; i++){
			if(isPrime(i)){
				if(number % i == 0){
					if(i > maximum){
						maximum = i;
					}
				}
			}
		}
		println(maximum);
	}
	private boolean isPrime(int i){
		for(int j = 2; j < i; j++){
			if(i % j == 0){
				return false;
			}
		}
		return true;
	}
}
