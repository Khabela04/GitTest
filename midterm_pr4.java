import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//4. დაწერეთ მეთოდი რომელსაც გადაეცემა ინგლისური ტექსტი, და აბრუნებს ტექსტს, რომელიც არის საწყისი ტექსტი შეცვლილი ისე, რომ თითოეული სიყვა არის შებრუნებული.  
//კონსოლიდან შემოიყვანეთ ტექსტი და დაბეჭდეთ ამ მეთოდის მიერ დაბრუნებული შედეგი.
//ტექსტი შედგება მხოლოდ შემდეგი სიმბოლოებისგან: ინგლისური ასოები, მძიმე, წერტილი, space. (Practice04)



public class midterm_pr4 extends ConsoleProgram{
	public void run(){
		String text = readLine("Give me a text");
		StringTokenizer tokens = new StringTokenizer(text, " ,.");
		String blank = "";
		while(tokens.hasMoreTokens()){
			String word = tokens.nextToken();
			for(int i = 0; i < word.length(); i++){
				char charecter = word.charAt(word.length() - i - 1);
				blank += charecter;
			}
			if(tokens.hasMoreTokens()){
				blank += " ";
			}
		}
		println(blank);
	}
}

