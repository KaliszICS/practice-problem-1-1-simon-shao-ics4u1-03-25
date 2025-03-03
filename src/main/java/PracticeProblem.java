public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int sum2D(int[][]arr2D){
		int sum = 0;
		for (int row = 0; row<arr2D.length;row++){
			for (int col = 0; col<arr2D[row].length;col++){
				sum +=arr2D[row][col];
			}
		
		}
		return sum;
	}

	public static int sumRow(int[][] arr2D1, int row){
		int sum = 0;
			for (int col = 0; col<arr2D1[row].length;col++){
				sum +=arr2D1[row][col];
			}
		return sum;
	}
public static int sumColumn(int[][] arr2D2, int col){
	int sum = 0;
		for (int row = 0; row<arr2D2.length;row++){
			sum +=arr2D2[row][col];
		}
	return sum;
}


}