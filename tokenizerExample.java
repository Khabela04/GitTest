import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class tokenizerExample extends ConsoleProgram {
	public void run(){
		String name = "Saba Magaria";
		StringTokenizer tokenizer = new StringTokenizer(name, ".,");
		while(tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			name.concat(token);
//			println(name.concat(token));
			
		}
	}
}
// 50, 51, 52
