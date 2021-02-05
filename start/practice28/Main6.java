package practice28;

public class Main6 {

	public static void main(String[] args) {
		int count=0;
		long result=0;
		for(long i=3; i<2000000l; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
				if(count>1) {
					continue;
				}
			}
			if(count==1) {
				result+=i;
				count=0;
			}
		}
		System.out.println(result+2);
	}

}
