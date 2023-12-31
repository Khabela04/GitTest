import acm.program.ConsoleProgram;

//49. დაწერეთ stringToInteger მეთოდი, რომელსაც გადაეცემა სტრინგი და აბრუნებს მთელ რიცხვს.  
//ჩათვალეთ, რომ გადაცემული სტრინგი მხოლოდ ციფრებისგან შედგება და არ იწყება 0-ით.  მაგალითად “234” გადაცემის შემთხვევაში მეთოდმა უნდა დააბრუნოს 234.
//ასევე ჩათვალეთ,  რომ დაბრუნებული მნიშვნელობა დადებითია და ეტევა int-ში. 
public class Practice49 extends ConsoleProgram {
	int prev;
	int finalNum;
	public void run(){
		String txt = readLine("Give me a number: ");
		stringToInteger(txt);
		
	}

	private int stringToInteger(String txt) {
		for(int i = 0; i < txt.length(); i++){
			char charecter = txt.charAt(i);
			int num = (charecter - '0') ;
			finalNum = prev * 10 + num;
			prev = finalNum;
		}
		println(finalNum);
		return 0;
	}
}
