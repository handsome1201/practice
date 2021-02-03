package practice26;

public class Main3 {

	public static void main(String[] args) {
		long so=0;
		for(long i=2; i<600851475143L; i++) {
			if(600851475143L%i==0) {
				for(long j=3; j<i; j++) {
					if(i%j !=0) {
						so=i;
					}
					System.out.println(so);
				}

			}

		}


	}
}
