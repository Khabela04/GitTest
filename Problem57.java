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
//		[saba]
		for(int l = 0; l < w2.length();l++){
			for(int k = 0; k < 26; k++){
				if(w1.charAt(l) == ('a' + k)){
						result2[k] += 1;
				}
			}
		}
//		[anas]
		String blank = "";
//		for(int i = 0; i < 26; i++){
//			blank+= result1[i];
//		}
//		println(blank);
		blank = "";
		for(int i = 0; i<26;i++){
			blank += result2[i];
		}
		println(blank);
		for(int n = 0; n < result1.length;n++){
			if(result1[n] != result2[n]){
				return false;
			}
		}
		return true;
	}
}
