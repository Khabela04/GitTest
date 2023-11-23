//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,  ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram {
	public void run(){
		String text = readLine("Give me a text: ");
		StringTokenizer tokenizer = new StringTokenizer(text, "a");
		tokenizer = new StringTokenizer(tokenizer.nextToken(), "b");
		while(tokenizer.hasMoreTokens()){
			print(tokenizer.nextToken());
		}
	}
}

