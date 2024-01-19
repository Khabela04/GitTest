import java.util.ArrayList;

import acm.program.ConsoleProgram;

//60. კონსოლიდან შეგვყავს რიცხვები მანამ სანამ არ შეიყვანთ -1-ს, დაბეჭდეთ შეყვანილი რიცხვები შებრუნებული მიმდევრობით. 
public class Problem60 extends ConsoleProgram {
	public void run(){
		int n = readInt("Number: ");
		ArrayList <Integer> result = new ArrayList<Integer>();
		result.add(n);
		while(n != -1){
			n = readInt("Number: ");
			result.add(n);
		}
		for(int i = result.size()-2; i >= 0; i--){
			println(result.get(i));
		}
	}
}
