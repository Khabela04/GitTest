import acm.program.ConsoleProgram;

//კონსოლიდან შემოგდით ვალიდური რომაული რიცხვეის შესაბამისი სტრინგები, მანამ არ შემოგივათ სიტყვა “quit”. 
//თითოეული რომაული რიცხვის სტრინგის წაკითხვის შემდეგ მომხმარებელს გამოუტანეთ ეგ რიცხვი intად.

public class StringsExtra2 extends ConsoleProgram {
	public void run(){
		String romanNum = readLine("Give me a Roman Number: ");
		int number = 0;
		for(int i = 0; i < romanNum.length(); i++){
			char charecter = romanNum.charAt(i);
			if(charecter == 'I'){
				number += 1;
			}
			if(charecter == 'V'){
				number += 5;
			}
			if(charecter == 'X'){
				number += 10;
			}
		}
		println(number);
			
			
//			I, V, X
		}
	}

