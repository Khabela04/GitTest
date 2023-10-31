import acm.program.ConsoleProgram;

public class Problem32 extends ConsoleProgram {
	public void run(){
		
		int number = readInt("Give me a number");
		for (int i = 1; i< 1000; i++){
			if (isPrime(i)){
				println(i);
			
		}
		}
	}
		private boolean isPrime(int num){
			for(int i = 2; i< Math.sqrt(num); i++){
				if(num % i == 0){
					return false;
				}
			}
			return true;
		}
	

}
