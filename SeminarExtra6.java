import acm.program.ConsoleProgram;
//1. კონსოლიდან იკითხეთ რიცხვები, მანამ სანამ შემოსული რიცხვი არ იქნება 0. 0-ის
//შემოსვლის შემდეგ დაბეჭდეთ შემოსული რიცხვების ჯამი.

public class SeminarExtra6 extends ConsoleProgram {
	private static final int GOLDEN_NUMBER = 0;
	public void run(){
		int sum =0;
		while(true){
			int number = readInt("Give me a number");
			if(number == GOLDEN_NUMBER) { break;}
					sum+= number;
		}
		println(sum);
		}

}
