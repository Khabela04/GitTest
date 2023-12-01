import acm.program.ConsoleProgram;

//ამოცანა 1. ლოგარითმი (15 ქულა)
//თქვენი ამოცანაა დაწეროთ მეთოდი რომელიც ლოგარითმს გამოითვლის. 
//შეგახსენებთ რომ ლოგარითმი n-ის ფუძით m არის რიცხვი რომელ ხარისხშიც უნდა ავიყვანოთ n
//იმისათვის რომ m მივიღოთ. ანუ, თუ
//n^x =m , მაშინ  xის მთელი ნაწილია შედეგი.
//n ^ x  > m
//log(5 ,25)  =2
//5, 26
//დაწერეთ მეთოდი log რომელსაც გადაეცემა 2 მთელი რიცხვი და რომელიც აბრუნებს ამ რიცხვებითვის ლოგარითმის მთელ ნაწილს.
//თქვენ არ გავთ უფლება გამოიყენოთ Math კლასი. შესაბამისად ვერ გამოიყენებთ მეთოდებს log, log10, log1p, pow და ა.შ.
//ჩათვალეთ, რომ m>n>0.











public class midterm2021_1 extends ConsoleProgram{
	public void run(){
		int m = 125;
		int n = 5;
		println(log(n, m));
	}
	private int log(int n, int m){
		int counter = 0;
		int log = 0;
		int prevN = 1;
		while(n <= m){	// 5, 125
			n = prevN *n;
			prevN = n;
			counter++;
		}
		return counter;
	}
}
