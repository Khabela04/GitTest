import acm.program.ConsoleProgram;

//კონსოლიდან შემოგდით ვალიდური რომაული რიცხვეის შესაბამისი სტრინგები, მანამ არ შემოგივათ სიტყვა “quit”. 
//თითოეული რომაული რიცხვის სტრინგის წაკითხვის შემდეგ მომხმარებელს გამოუტანეთ ეგ რიცხვი intად.

public class StringsExtra2 extends ConsoleProgram {
	public void run(){
		String romanNum = "";
		int number = 0;
		while(!romanNum.equals("quit")){
			romanNum = readLine("Give me a Roman Number: ");
		for(int i = 0; i < romanNum.length(); i++){
			char charecter = romanNum.charAt(i);
			if(charecter == 'I'){
				if(i < romanNum.indexOf('V') || i < romanNum.indexOf('X')){
					number -= 1;
				}else{
					number += 1;
				}
			}
			if(charecter == 'V'){
				number += 5;
			}
			if(charecter == 'X'){
				number += 10;
			}
		}
		if(romanNum.equals("quit")){
			println("the end");
		}
		else{
		println(number);
		};
			
//			I, V, X
		}
	}
	}

