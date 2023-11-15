import acm.program.ConsoleProgram;
//32. დაწერეთ პროგრამა რომელიც იპოვის და დაბეჭდავს 1000000 მდე ყველა მერტივ რიცხვს 
public class Pr32 extends ConsoleProgram {
	private static final int NUM = 1000000;
	private int COUNT = 0;
	public void run(){
		for(int i = 0; i < NUM; i++){
			for(int j = 0; j < Math.sqrt(NUM); j++){
				if(i % j == 0){
					COUNT ++;
				}
			}
			if(COUNT < 2){
				println(i);
			}
		}
	}
}
