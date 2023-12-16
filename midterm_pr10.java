import acm.program.ConsoleProgram;

//10. დაწერეთ მეთოდი, რომელსაც გადმოეცემა რიცხვი და აბრუნებს ამ რიცხვის კენტ ადგილას მყოფი ციფრთა ჯამი 
//უდრის თუ არა ლუწ ადგილას მდგომ ციფრთა ჯამს.
//მაგ: 1232 -> true  1234 -> false (Practice10)









public class midterm_pr10 extends ConsoleProgram{
	public void run(){
		int number = readInt("Give me a number");
		String num = "" + number;
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i < num.length(); i+=2){
			char charecter = num.charAt(i);
			int oddNumber = charecter - '1' + 1;
			oddSum += oddNumber;
		}
		for(int j = 1; j < num.length(); j+=2){
			char charecter = num.charAt(j);
			int evenNumber = charecter - '1' + 1;
			evenSum += evenNumber;
		}
		println(oddSum == evenSum);
		
	}
}
