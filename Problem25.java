import acm.program.ConsoleProgram;
//25. მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის უმცირესი საერთო ჯერადი. 
public class Problem25 extends ConsoleProgram {
	public void run(){
		double n = readInt("Give me the first number: ");
		double m = readInt("Give me the second number: ");
		double mult = n*m;
		for(int i = 1; i < n; i++){
			if(mult/i % n ==0){
				if(mult/i % m ==0){
					println(mult/i);
				}
			}
		}
		
	}

}

