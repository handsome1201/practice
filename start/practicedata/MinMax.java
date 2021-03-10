package practicedata;

public class MinMax {
	private int x,y,z;
	
	public static int tmin(int x, int y) {
		return x>=y ? (y):(x);
	}
	
	public static int tmax(int x, int y) {
		return x<=y ? (y):(x);
	}

	public static int min(int x, int y, int z) {
		int min=0;
		min=x;
		if(min>y) {
			min=y;
			if(min>z) {
				min=z;
			}
		}
		else if(min<y) {
			if(min>z)
				min=z;
		}
		else if(min==y) {
			if(min>z)
				min=z;
		}

		return min;
	}

	public static int max(int x, int y, int z) {
		int max=0;
		max=x;
		if(max<y) {
			max=y;
			if(max<z) {
				max=z;
			}
		}
		else if(max>y) {
			if(max<z)
				max=z;
		}
		else if(max==y) {
			if(max<z)
				max=z;
		}

		return max;
	}
	
	
}
