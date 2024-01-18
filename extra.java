import java.util.List;

import acm.program.ConsoleProgram;

//each_cons([1,2,3,4], 2)
//  #=> [[1,2], [2,3], [3,4]]
//
//each_cons([1,2,3,4], 3)
//  #=> [[1,2,3],[2,3,4]]
  
import java.util.ArrayList;
import java.util.List;


public class extra extends ConsoleProgram {
	public void run(){
		int [] list = new int[4];
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		list[3] = 4;
		eachCons(list,2);
	}
	public void eachCons(int [] x, int n){
		int l = x.length - n +1;
		int [][] result = new int[l][n];
		for(int i = 0; i < l; i++){
			int[] blank = new int[n];
			for(int j = 0; j < n; j++){
				result[i][j] = x[i+j];
			}
		}
		toString(result);
	}
	private void toString(int[][] result) {
		String blank = "[";
		for(int i = 0; i < result.length; i++){
			for(int j = 0; j < result[1].length; j++){
				blank += result[i][j];
				blank += ", ";
			}
			blank += "]";
			blank += "[";
		}
		blank += "]";
		println(blank);
	}
}

