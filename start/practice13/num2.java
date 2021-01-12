package practice13;

import java.util.Scanner;

public class num2 {

	static int min(int e, int r) {
		if(r>e) {
			return e;
		}
		else {
			return r;
		}

	}

	static int min(int e, int r, int t) {
		int min=0;
		min=e;
		if(min>t) {
			min=t;
		}
		if(min>r) {
			min=r;
		}
		return min;
	}

	static int min(int[] n) {
		int min=n[0];
		for(int i=1; i<n.length; i++) {
			if(min>n[i]) {
				min=n[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("x값: ");
		int x = a.nextInt();
		System.out.print("y값: ");
		int y = a.nextInt();
		System.out.print("z값: ");
		int z = a.nextInt();
		
		System.out.print("배열 a의 요소 수: ");
		int o = a.nextInt();
		int [] u = new int[o];
		
		for(int i=0; i<u.length; i++) {
			System.out.print("a["+i+"]= ");
			u[i] = a.nextInt();
		}
		
		System.out.println("x,y의 최솟값은 "+min(x,y)+"입니다.");
		System.out.println("x,y,z의 최솟값은 "+min(x,y,z)+"입니다.");
		System.out.println("배열 a의 최솟값은"+min(u)+"입니다.");
		

	}

}
