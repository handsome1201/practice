package practice8;

import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int [][] n = new int[4][3];
		int [][] m = new int[3][4];
		int [][] o = new int[4][4];
		
		System.out.println("���a�� ��Ҹ� �Է��ϼ���.");
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("n["+i+"]["+j+"]:");
				n[i][j]=a.nextInt();
			}
		}
		
		System.out.println("��� b�� ��Ҹ� �Է��ϼ���.");
	
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("m["+i+"]["+j+"]:");
				m[i][j]=a.nextInt();
			}
		}
		
		System.out.println("��� a�� b�� �� ");

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				for(int k=0; k<3; k++) {
					o[i][j]=n[i][k]*m[k][j];
				}
			}
		}
		for(int i=0; i<4; i++) {
			System.out.println();
			for(int j=0; j<4; j++) {
				System.out.print(o[i][j]+"  ");
			}
		}
	}

}
