//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,  ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram {
	public void run(){
		String text = readLine("Give me a text: ");
		for(int i = 0; i < text.length(); i++){
			StringTokenizer tokenizer = new StringTokenizer(text, "" + text.charAt(i));
			while(tokenizer.hasMoreTokens()){
				if(text.indexOf(text.charAt(i)) == i){
					tokenizer.nextToken();
				}
				if(text.indexOf(text.charAt(i)) != i){
					println(tokenizer.nextToken());
				}
			}
		}
	}	
}


