import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//4. დაწერეთ მეთოდი რომელსაც გადაეცემა ინგლისური ტექსტი, და აბრუნებს ტექსტს, რომელიც არის საწყისი ტექსტი შეცვლილი ისე, რომ თითოეული სიყვა არის შებრუნებული.  
//კონსოლიდან შემოიყვანეთ ტექსტი და დაბეჭდეთ ამ მეთოდის მიერ დაბრუნებული შედეგი.
//ტექსტი შედგება მხოლოდ შემდეგი სიმბოლოებისგან: ინგლისური ასოები, მძიმე, წერტილი, space. (Practice04)



public class midterm_pr4 extends ConsoleProgram{
	public void run(){
		String blank = "";
		String text = readLine("Give me a text");
		String text1 = readLine("Give me your guess which word me be anagram of this ");
		StringTokenizer tokens = new StringTokenizer(text);
		char n = ' ';
		while(tokens.hasMoreTokens()){
			String word = tokens.nextToken();
			for(int i = 0; i < word.length(); i++){
				char charecter = word.charAt(word.length() - i - 1);
				if(charecter == ',' || charecter == '.'){
					n = charecter;
				}
				else{
				blank += charecter;
				}
			}	
			blank += (""+ n);
			n = 0;
			if(tokens.hasMoreTokens()){
				blank += " ";
			}
		}
		
		if(text1.equals(blank)){
			println("This words are anagrams");
		}else{
			println("This words aren't anagrams");
		}
		println(blank);
	}
}

