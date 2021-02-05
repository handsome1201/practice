package practice28;

public class Main1 {

	public static void main(String[] args) {
		long []sosu = new long[10001];
		int count=0;
		int a=1;
		for(int i=3;i<104744;i++) {
			for(int j=i; j>1; j--) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==1) {
				sosu[a++]=i;
			}
			count=0;

		}
		System.out.println(sosu[10000]);

	}

}

