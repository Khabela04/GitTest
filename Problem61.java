import java.util.ArrayList;

import acm.program.ConsoleProgram;

//61. კონსოლიდან შეგვყავს რიცხვი m და n, შემდეგ n ცალი რიცხვი. პროგრამამ უნდა იპოვოს შეყვანილი რიცხვებიდან წყვილი რომელთა ჯამი არის m. 
public class Problem61 extends ConsoleProgram {
	public void run(){
		int m = readInt("m: ");
		int n = readInt("n: ");
		int l = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			l = readInt("Number: ");
			result.add(l);
		}
		int d = 0;
		for(int i = 0; i < result.size(); i++){
			d = m - result.get(i);
			for(int j = 0; j < result.size(); j++){
				if(result.get(j) == d){
					println(d);
					println(result.get(i));
				}
			}
		}
	}
}
