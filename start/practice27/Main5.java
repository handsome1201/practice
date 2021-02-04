package practice27;

public class Main5 {

	public static void main(String[] args) {
		int num=20;
		int count=0;
		boolean result = false;
		while(result != true) {
			for(int i=1; i<=20; i++){
				if(num%i==0) {
					count++;
				}
				if(count !=20) {
					num++;
					count=0;
				}
				else if(count==20) {
					result = true;
				}
			}
			System.out.println(num);
		}

	}

}
