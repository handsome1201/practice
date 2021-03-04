package practicedata;

public class num6 {

	public static int search(int[] a, int target) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==target)
				return i;
		}
		return target;

	}

	public static void main(String[] args) {
		int[] a = {66,44,99,33,55,22,88,77};
		System.out.println(search(a,55));
	}

}
