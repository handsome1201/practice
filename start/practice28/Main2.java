package practice28;

public class Main2 {

	public static void main(String[] args) {
		int count=1;
		for(int i=3; ; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==10001) {
				System.out.println(i);
			}
		}

	}

}
