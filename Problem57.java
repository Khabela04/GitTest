import acm.program.ConsoleProgram;

//57. დაწერეთ მეთოდი, რომელსაც გადაეცემა ორი სტრინგი და აბრუნებს true-ს თუკი ეს ორის სტრინგი ერთმანეთის ანაგრამაა, 
//ხოლო წინააღმდე შემთხვევაში აბრუნებს false-ს. 
//ჩათვალეთ,  რომ ორივე სტრინგი მხოლოდ ლათინური ალფავიტის პატარა ასოებისგან შედგება.  
//იმპლემენტაცია გააკეთეთ მასივების გამოყენებით შემდეგი ალგორითმით:
//თითოეული სიტყვისთვის დათვალეთ თითოეული სიმბოლოს რაოდენობა(‘a’-‘z’) და შეინახეთ მასივში. 
//შემდეგ შეადარეთ ერთმანეთს მასივები. 
public class Problem57 extends ConsoleProgram {
	public void run(){
		String word1 = readLine("Word1: ");
		String word2 = readLine("Word2: ");
		println(isAnagram(word1, word2));
	}
	private boolean isAnagram(String w1, String w2){
		int[] result1 = new int [26];
		int[] result2 = new int [26];
		for(int i = 0; i < w1.length();i++){
			for(int j = 0; j < 26; j++){
				if(w1.charAt(i) == ('a' + j)){
						result1[j] += 1;
				}
			}
		}
		for(int i = 0; i < w2.length();i++){
			for(int j = 0; j < 26; j++){
				if(w1.charAt(i) == ('a' + j)){
						result2[j] += 1;
				}
			}
		}
		for(int i = 0; i < result1.length;i++){
			if(result1[i] == result2[i]){
				return true;
			}
		}
		return false;
	}
}
