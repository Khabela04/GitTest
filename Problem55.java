import acm.program.ConsoleProgram;
//55. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი,
//გაარკვიეთ შეყვანილი რიცხვები არის თუ არა ზრდადობით დალაგებული. 
//თუკი არის დაბეჭდეთ “sorted” თუ არა მაშინ დაბეჭდეთ “not sorted”. 
public class Problem55 extends ConsoleProgram {
	int[] numbers;
	public void run(){
		int number = 0;
		int n = readInt("Enter quantity of numbers: ");
		numbers = new int[n];
		for(int i = 0; i < n; i++){
			number = readInt("Give me a whole number: ");
			numbers[i] = number;
		}
		println(isSorted());
	}
	private String isSorted() {
		for(int i = 1; i < numbers.length; i++){
			if(numbers[i] < numbers[i-1]){
				return "not sorted";
			}
		}
		return "sorted";
	}
}