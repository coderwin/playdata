package array;

public class Array3DTest {

	public static void main(String[] args) {
		
		int[][][] myarr = new int[3][2][2];
		
		for(int i = 0; i < myarr.length; i++) {
		     for(int j = 0; j < myarr[i].length; j++) {

			     for(int k = 0; k < myarr[i][j].length; k++) {
			       System.out.print( myarr[i][j][k]);
			     }
			     System.out.print(" ");
		     }
		     System.out.println();
		}

	}

}
