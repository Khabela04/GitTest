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
		boolean indicator = false;
		int counter = 0;
		StringTokenizer tokens = new StringTokenizer(text);
		StringTokenizer tokenson = new StringTokenizer(text1);
		char n = 0;
		while(tokens.hasMoreTokens()){
			String word1 = tokenson.nextToken();
			String word = tokens.nextToken();
			for(int i = 0; i < word.length(); i++){
				char charecter = word.charAt(word.length() - i - 1);
				char charecter1 = word.charAt(word.length() - i - 1);
				char charecter2 = word1.charAt(word1.length() - i - 1);
				if(charecter1 != charecter2){
					counter++;
				}

				if(charecter == ',' || charecter == '.'){
					n = charecter;
					indicator = true;
				}
				else{
				blank += charecter;
				}
			}	
			if(indicator){
				blank += (""+ n);
				n = 0;
			}
			indicator = false;
			if(tokens.hasMoreTokens()){
				blank += " ";
			}
		}
		if(counter > 1){
			println("there's no chance for change");
		}
		
		if(text1.equals(blank)){
			println("This words are anagrams");
		}else{
			println("This words aren't anagrams");
		}
//		println(blank);
	}
}

