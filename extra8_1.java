import acm.program.ConsoleProgram;

//დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში
//ყველაზე ხშირ ასოს. გაითვალისწინეთ, რომ სიტყვაში “Init”  ასო ‘i’ გვხვდება ორჯერ ( დიდი და პატარა ასოებიც უნდა ჩათვალოთ). 
//პუნქტუაციის სიმბოლოები, ციფრები, სფეისი და ა.შ ასო არ არის.

public class extra8_1 extends ConsoleProgram{
	public void run(){
		String text = "Initnn";
		println(oftenUsed(text));
	}
	private char oftenUsed(String text){
		int maximum = 0;
		char maxChar = 'a';
		for(int i = 0; i < text.length(); i++){
			char charecter = text.charAt(i);
			if(counter(text, charecter) > maximum){
				maxChar = charecter;
				maximum = counter(text, charecter);
			}
		}
		return maxChar;
	}
	private int counter(String text, char Charecter){
		int counter1 = 0;
		for(int i = 0; i < text.length(); i++){
			if(Charecter  == text.charAt(i) || Charecter == text.charAt(i) - 'A' + 'a'|| Charecter == text.charAt(i) - 'a' + 'A'){
				counter1++;
			}
		}
		return counter1;
	}
}

