import acm.program.ConsoleProgram;

//14.დაწერეთ პროგრამა რომელიც იპოვის და დაბეჭდავს 1000000 მდე ყველა მარტივ რიცხვს (Problem32)











public class midterm_pr14 extends ConsoleProgram{
	public void run(){
		boolean indicator = true;
		for(int i = 1; i < 20; i++){
			indicator = true;
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i % j == 0){
					indicator = false;
					break;
				}
			}
			if(indicator){	
				println(i);
			}
		}
	}
}

