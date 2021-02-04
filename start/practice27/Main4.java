package practice27;

public class Main4 {

	public static void main(String[] args) {
		int plus=0;
		int square=0;
		int sum=0;
		for(int i=1; i<=100; i++) {
			plus=i*i+plus;
			square=i+square;
		}
		sum=square*square-plus;;
		System.out.println(sum);
	}

}
