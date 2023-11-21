//50. შეყვანილ ტექსტში დათვალეთ სიტვყების რაოდენობა, ტოკენაიზერის საშუალებით. 
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice50 extends ConsoleProgram {
	int count;
	public void run(){
		String text = readLine("Input a text: ");
		StringTokenizer tokenizer = new StringTokenizer(text);
		while(tokenizer.hasMoreTokens()){
			count++;
		}
		println(count);
	}
}
