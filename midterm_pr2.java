import acm.program.ConsoleProgram;

//კონსოლიდან შემოდის ტექსტი. დაბეჭდეთ True თუ ტექსტში არსებული ყველა lowercase ინგლისური ასო ზრდადობით არის დალაგებული, False თუ არაა.
//ტექსტში სხვა სიმბოლოებიც შეიძლება შეგხვდეთ და იმათ ყურადღება არ მიაქციოთ
public class midterm_pr2 extends ConsoleProgram{
	public void run(){
		String text = readLine("Give me a text");
		println(isAscending(text));
	}
	private boolean isAscending(String text){
		for(int i = 1; i < text.length(); i++){
			char curChar = text.charAt(i);
			char prevChar = text.charAt(i-1);
			if((curChar - 'a' < 32 && curChar - 'a' > 0) && (prevChar - 'a' < 32 && prevChar - 'a' > 0)){
				if(curChar < prevChar){
				return false;
			}
		}
			return true;
		}
	}
}
