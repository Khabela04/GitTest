import acm.program.ConsoleProgram;

//2. კონსოლიდან შემოდის ტექსტი. დაბეჭდეთ True თუ ტექსტში არსებული ყველა lowercase ინგლისური ასო ზრდადობით არის დალაგებული, False თუ არაა.
//ტექსტში სხვა სიმბოლოებიც შეიძლება შეგხვდეთ და იმათ ყურადღება არ მიაქციოთ
public class PracticeProblem2 extends ConsoleProgram {
	public void run(){
		String text = readLine("Give me a text");
		for(int i = 1 ; i < text.length(); i++){
			char curChar =text.charAt(i);
			char prevChar = text.charAt(i -1);
			if(curChar < prevChar ){
				println(false);
				break;
			}
			if(i == text.length() - 1){
				println(true);
			}
		}
	}
}
