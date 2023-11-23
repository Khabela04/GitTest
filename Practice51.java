//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,  ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram {
	public int counter;
	public void run(){
		String text = readLine("Give me a text: ");
		for(int i = 0; i < text.length(); i++){
			char charecter = text.charAt(i);
			String myText = "" + charecter;
			if(charecterChecker(charecter, text)<1){
			StringTokenizer tokenizer = new StringTokenizer(text, myText);
			while(tokenizer.hasMoreTokens()){
				println(tokenizer.nextToken());
			}
		}
		}
		
	}

	private int charecterChecker(char charecter, String text) {
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == charecter){
				counter++;
			}
		}
		return counter;
		
	}
}


