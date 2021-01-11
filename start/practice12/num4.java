package practice12;

public class num4 {
	static boolean addmatrix(int[][]x , int[][]y, int[][]z) {
		if(x.length !=y.length || y.length != z.length) {
			return false;
		}
		for(int i =0; i<x.length; i++) {
			if(x[i].length !=y[i].length || y[i].length != z[i].length) {
				return false;
			}
		}
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}



		return true;
	}


	static void print(int[][] n) {
		for(int i=0; i<n.length; i++) {
			System.out.println();
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
		}
	}
	public static void main(String[] args) {
		int a[][] = {{1,2,3}, {4,5,6}};
		int b[][] = {{6,3,4}, {5,1,2}};
		int [][] c = new int[2][3];

		if(addmatrix(a,b,c)) {
			System.out.println("행렬 a: ");
			print(a);
			System.out.println();
			System.out.println();
			System.out.println("행렬 b: ");
			print(b);
			System.out.println();
			System.out.println();
			System.out.println("행렬c: ");
			print(c);
		}

	}


}
