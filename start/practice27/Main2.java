package practice27;

public class Main2 {
//소수 찾기
	public static void main(String[] args) {
		int count=0;
		int sum=1;
		for(int i=2; i<21; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==1) {
				sum=sum*i;
			}
			count=0;
		}
		System.out.println(sum);
	}

}
