import acm.program.ConsoleProgram;
//58. (2018 წლის გამოცდის ამოცანა) 
//მატრიცას ეწოდება მაგიური თუკი ის კვადრატულია(n x n-ზე) და მასში არის ყველა რიცხვი 1-დან n^2-ის ჩათვლით. 
//თქვენი მიზანია დაწეროთ magicMatrix მეთოდი რომელიც შეამოწმებს არის თუ არა მატრიცა მაგიური
//და თუკი მაგიურია მაშინ დააბრუნებს true-ს თუ არა მაშინ false-ს.  

public class Problem58 extends ConsoleProgram {
	public void run(){
		int[][] matrix = new int[5][5];
		println(magicMatrix(matrix));
	}

	private boolean magicMatrix(int[][] matrix) {
		int[] result = new int[(matrix.length * matrix.length)-1];
		if(matrix.length == matrix[0].length){
			for(int i = 0; i < matrix.length; i++){
				for(int j = 0; j < matrix[0].length;j++){
					for(int l = 1; l < (matrix.length)*(matrix.length); l++){
						if(matrix[i][j] == l){
							if(result[l] == 0){
								result[l] = 1;
							}
						}
					}
				}
			}
			for(int i = 0; i < result.length; i++){
				if(result[i] == 0){
					return false;
				}
			}
		}
		return true;
	}
}
