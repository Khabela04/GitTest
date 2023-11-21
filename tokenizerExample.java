import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class tokenizerExample extends ConsoleProgram {
	public void run(){
		String name = "Saba Magaria";
		StringTokenizer tokenizer = new StringTokenizer(name);
		while(tokenizer.hasMoreTokens()){
			println(tokenizer.nextToken());
		}
	}
}
