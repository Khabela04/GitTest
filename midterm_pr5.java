import acm.program.ConsoleProgram;
//13. დაწერეთ მეთოდი, რომელსაც გადაეცემა ნატურალური რიცხვი
//და აბრუნებს შეიძლება თუ არა ეს რიცხვი წარმოვადგინოთ რომელიმე ორი სხვა ნატურალური  რიცხვის კვადრატების ჯამის სახით
//მაგ: 26 - > true (5^2 + 1^2) 30 -> false (Practice13)










public class midterm_pr5 extends ConsoleProgram{
	public void run(){
		int num = readInt("Give me a number: ");
		for(int i =1; i < num; i++){
			if(isSquare(i)){
				println(isSquare(num-1));
			}
		}
	}
	private boolean isSquare(double i){
		for(double j = 1; j <= i; j++){
			if(j*j == i){
				return true;
			}
		}
		return false;
	}
}