package practice29;

public class Main1 {

	public static void main(String[] args) {
		int []tran = new int[1000];
		tran[0]=1;
		int count=0;
		for(int i=1; i<tran.length; i++) {
			for(int j=1; j<=i; j++) {
				tran[i]=tran[i-1]+j;
			}
		}
		for(int i=1; i<tran.length; i++) {
			for(int j=1; j<=tran[i]/2; j++) {
				if(tran[i]%j==0) {
					count++;
				}
			}
			if(count==500) {
				System.out.println(tran[i]);
			}
		}

	}

}
