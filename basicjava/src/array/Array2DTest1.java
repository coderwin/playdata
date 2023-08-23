package array;

public class Array2DTest1 {
	
	public static void main(String[] args) {
		int[][] myarr = new int[3][2];
		myarr[0][0] = 100;
		
		
		for(int row = 0; row < myarr.length; row++) {
			for(int i=0; i < myarr[row].length; i++) {
				System.out.print(myarr[row][i] + "\t");
			}
			System.out.println();
		}
	}
}
