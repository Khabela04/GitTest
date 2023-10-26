import acm.program.ConsoleProgram;
//28. მომხმარებელს შეყავს დადებითი რიცხვები, მანამ სანამ არ შეიყვანს -1 ს, დაბეჭდეთ
//რაოდენობა რამდენი ლუწი რიცხვი შეყვანა მომხმარებელმა.
public class Problem28 extends ConsoleProgram {
	public static final int NUM_BER = -1;
	public void run(){
		int evenN = 0;
		int n = readInt("Guess the number");
	while(n != NUM_BER){
		int m = readInt("Guess the number");
		if(n % 2 == 0){
			evenN += 1;
		}
		
	}
	println(evenN);
	}	
}
