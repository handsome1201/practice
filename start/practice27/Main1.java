package practice27;

public class Main1 {

	public static void main(String[] args) {
		int daeching=0;
		int []big = new int[810000];
		for(int i=100; i<1000; i++) {
			for(int j=100; j<1000; j++) {

				daeching=i*j;

				int one=0;
				int ten=0;
				int hundred=0;
				int thousand=0;
				int tenthousand=0;
				int hundredthousand=0;
				hundredthousand=daeching/100000;
				tenthousand=daeching/10000-hundredthousand*10;
				thousand=daeching/1000-hundredthousand*100-tenthousand*10;
				hundred=(daeching%1000)/100;
				ten=(daeching%100)/10;
				one=daeching%10;
				if(one==hundredthousand  && ten==tenthousand && thousand==hundred) {
					for(int k=1; k<810000; k++) {
						big[i]=daeching;
						if(big[0]<big[i]) {
							big[0]=big[i];
						}
					}

				}
			}
		}
		System.out.println(big[0]);
	}

}

