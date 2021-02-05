package practice28;

public class Main5 {
	public static void main(String[] args) {
		int result = 0;
		int b = 0;
		int c = 0;
		double a = 0;
		for(int i=1; i<500; i++) {
			b=i;
			a=(double)1000*(500-b)/(1000-b);
			if((int)a==a) {
				break;
			}
			c=1000-(int)a-b;

		}
		result=(int)a*b*c;
		System.out.println(result);

	}
}
