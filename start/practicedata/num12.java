package practicedata;

public class num12 {

	public static void main(String[] args) {
		wearable[] w = new wearable[2];
		w[0]=new Headphone();
		w[1]=new WearableComputer();

		for(int i=0; i<w.length; i++) {
			w[i].puton();
		}
		for(int i=0; i<w.length; i++) {
			w[i].putoff();
		}
	}

}
