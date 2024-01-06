import acm.program.ConsoleProgram;

//56. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, 
//დაალაგეთ რიცხვები ზრდადობით და დაბეჭდეთ.
public class Problem56 extends ConsoleProgram {
	int[] numbers;
	int[] sortedNums;
	public void run(){
		int n = readInt("Number of whole nums: ");
		int number = 0;
		numbers = new int[n];
		for(int i = 0; i < n; i++){
			number = readInt("Give me a whole number: ");
			numbers[i] = number;
		}
		sortedNumbers();
	}
	private void sortedNumbers() {
		int counter = 0;
		String blank = "";
		sortedNums = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] > numbers[j]){
					counter++;
				}
			}
			sortedNums[counter] = numbers[i];
			counter = 0;
		}
		for(int n = 0; n < sortedNums.length; n++){
			blank+=sortedNums[n];
		}
		println(blank);
	}
}
