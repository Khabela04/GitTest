//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,  ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram {
	public void run(){
		String text = readLine("Give me a text: ");
		StringTokenizer tokenizer = new StringTokenizer(text, "a");
		char charecter = text.charAt(1);
		println(charecter);
		int n = (charecter - 'a');
		String name = (String)("assa" + n);
		print(name);
//;		while(tokenizer.hasMoreTokens()){
//			print(tokenizer.nextToken());
//		}
//		println(tokenizer.countTokens());
//		if(tokenizer.countTokens()> 1){
//			while(tokenizer.hasMoreTokens())
//		}
	}
}


