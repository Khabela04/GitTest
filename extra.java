import acm.program.ConsoleProgram;

//each_cons([1,2,3,4], 2)
//  #=> [[1,2], [2,3], [3,4]]
//
//each_cons([1,2,3,4], 3)
//  #=> [[1,2,3],[2,3,4]]
  
public class extra extends ConsoleProgram  {
	public void run(){
		int [] myArray = new int [4];
		myArray[0] = 1;
		myArray[1] = 2;
		myArray[2] = 3;
		myArray[3] = 4;
		each_cons(myArray,2);
	}

	private void each_cons(int [] n, int m) {
		int x = n.length -(m-1);
		int [][] array = new int [x][m];
		int counter = 0;
		int count = 0;
		for(int i = 0; i < n.length; i++){
			counter++;
			if(counter == 1){
				n[i] = array[count][0];
				n[i+1] = array[count][1];
				count++;
				counter = 0;
			}
		}
		String blank = "";
		for(int j = 0; j < array.length; j++){
			blank+= array[j];
		}
		println(blank);
	}
}
