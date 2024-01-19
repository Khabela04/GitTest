import acm.program.ConsoleProgram;
//59. (2018 წლის გამოცდის ამოცანა) 
//გადმოგეცემათ nxm-ზე მატრიცა რომელშიც მხოლოდ 0-ები და 1-ები წერია. მეთოდმა უნდა დააბრუნოს ამ მატრიცის ყველაზე დიდი ქვემართკუთხედის 
//ზომა(ელემენტების რაოდენობა) რომელიც მხოლოდ 1-ებისგან შედგება. 
//მაგალითად: 
//01100100 
//01111100 
//00111100 
//00111100 
//ამ მატრიცაში ყველაზე დიდი შიდა მართკუთხედი, რომელიც სულ ერთიანებისგან შედგება არის 12 ზომის: 
//01100100 
//01111100 
//00111100 
//00111100 
//შესაბამისად ამ მატრიცაზე მეთოდმა უნდა დააბრუნოს 12. ჩათვალეთ რომ გადმოცემულ მატრიცაში ერთი უჯრა მაინც იქნება რომელშიც წერია 1. 

public class Problem59 extends ConsoleProgram{
	public void run(){
		println(bigRect());
	}
	private int bigRect(){
		int [][] ar = {
				{0, 1, 1, 0},
				{1, 1, 1, 1},
				{0, 1, 1, 0}};
		int Maxproduct = 0;
		for(int i1 = 0; i1 < ar.length; i1++){
			for(int j1 = 0; j1 < ar[0].length; j1++){
				// coordinates of first i and j
				for(int i2 = i1; i2 < ar.length; i2++){
					for(int j2 = j1; j2<ar[0].length; j2++){
						if(hasOnlyOnes(ar, i1, j1, i2, j2)){
							int curprod = (i2-i1)*(j2-j1);
							Maxproduct = Math.max(curprod,Maxproduct );
						}
					}
				}
			}
		}
		return Maxproduct;
	}
	private boolean hasOnlyOnes(int[][] ar, int i1, int j1, int i2, int j2) {
		for(int i = i1; i < i2; i++){
			for(int j = j1; j < j2; j++){
				if(ar[i][j] == 0){
					return false;
				}
			}
		}
		return true;
	}
}
