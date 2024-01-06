import acm.program.ConsoleProgram;

//54. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი,
//იპოვეთ და დაბეჭდეთ ამ რიცხვებს შორის ორი მაქსიმალური რიცხვი. 
public class Problem54 extends ConsoleProgram {
	int[] numbers;
	int maximum1 = 0;
	int maximum2 = 0;
	public void run(){
		int number = 0;
		int n = readInt("Enter quantity of numbers I will get: ");
		numbers = new int[n];
		for(int i = 0; i < n; i++){
			number = readInt("Enter a whole number");
			numbers[i] = number;
		}
		maximums();
		print( maximum1);
		print(", "+maximum2);
	}
	private void maximums() {
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] > maximum1){
				maximum1 = numbers[i];
			}
		}
		for(int j = 0; j < numbers.length; j++){
			if(numbers[j] != maximum1){
				if(numbers[j] > maximum2){
					maximum2 = numbers[j];
				}
			}
		}
	}
}
