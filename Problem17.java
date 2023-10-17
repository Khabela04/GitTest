import acm.program.ConsoleProgram;
//17. კონსოლიდან წაიკითხეთ ნამდვილი რიცხვი და დაბეჭდეთ მისი მთელი ნაწილი და მისი წილადი ნაწილი. 
//მაგალითად მომხმარებელმა თუ შეიყვანა 3.14 თქვენმა პროგრამამ უნდა დაბეჭდოს 3 და 0.14 
public class Problem17 extends ConsoleProgram {
	public void run(){
		double num = readDouble("Write a real number: ");
		int whole = (int) (num);
		double ratio =num-whole;
		println("Whole part of this number is "+whole+" and ratio part is "+ratio );
		
	}
}
