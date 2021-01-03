package practice6;

public class num7 {

	public static void main(String[] args) {
		double [] x = new double[5];
		
		for(int i=0; i<x.length; i++) {
			x[i]=(i+1)*0.1;
			System.out.println("a["+i+"] = "+x[i]);
		}
	}

}
