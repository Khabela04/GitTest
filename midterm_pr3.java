import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//3. დაწერეთ მეთოდი რომელსაც გადაეცემა ინგლისური ტექსტი, და აბრუნებს ტექსტს, რომელიც არის საწყისი ტექსტი შეცვლილი ისე, 
//რომ ყველა სიყვა დიდი ასოთი იწყებოდეს და სიტყვაში ყოველი შემდგომი ასო იყოს პატარა.  კონსოლიდან შემოიყვანეთ ტექსტი და 
//დაბეჭდეთ ამ მეთოდის მიერ დაბრუნებული შედეგი. 
//მაგ: “i have A pEN.” -> “I Have A Pen” (Practice03)
//Tags: String, Tokenizer, toLowerCase, toUpperCase


public class midterm_pr3 extends ConsoleProgram{
	public void run(){
		String text = readLine("Give me a text: ");  // saba magaria  
		String blank = "";
		StringTokenizer tokens = new StringTokenizer(text);
		while(tokens.hasMoreTokens()){
			 String txt = tokens.nextToken();
			for(int i = 0; i < txt.length(); i++){
				if(i == 0){
					blank += (""+txt.charAt(0)).toUpperCase();
				}else{
					blank += (""+txt.charAt(i)).toLowerCase();
				}
			}
			if(tokens.hasMoreTokens()){
				blank += " ";
			}
		}
		println(blank);
	}
}

