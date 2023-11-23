//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,  ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram {
	public void run(){
		String text = readLine("Give me a text: ");
		for(int i = 0; i < text.length(); i++){
			char charecter = text.charAt(i);
				StringTokenizer tokenizer = new StringTokenizer(text, text);
				while(tokenizer.hasMoreTokens()){
					tokenizer.nextToken();
				}
		}
	}
}

