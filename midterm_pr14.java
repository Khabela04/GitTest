import acm.program.ConsoleProgram;

//14.დაწერეთ პროგრამა რომელიც იპოვის და დაბეჭდავს 1000000 მდე ყველა მარტივ რიცხვს (Problem32)











public class midterm_pr14 extends ConsoleProgram{
	public void run(){
		boolean indicator = false;
		for(int i = 0; i < 20; i++){
			indicator = false;
			for(int j = 2; j < Math.sqrt(20); j++){
				if(i % j == 0){
					break;
				}
			}
				println(i);
			}
		}
	}

