//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,  ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram {
	public void run(){
		String text = readLine("Give me a text: ");
		String blank = "";
		for(int i = 0; i < text.length(); i++){
			if(text.indexOf(text.charAt(i)) == i){
				println(text.charAt(i));
			text.concat(""+text.charAt(i));
			}
		}
		println(blank);
	}	
}


