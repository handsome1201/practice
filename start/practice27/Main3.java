package practice27;

public class Main3 {

	public static void main(String[] args) {
		int num=20;
		int count = 0;
		boolean result = false;     //num�� �������� ��, i�� ������ ��, count�� ������ �������� Ƚ��
		while(result != true) {
			for(int i = 1; i <=20 ; i++) {  //i�� 1~20���� ����
				if(num % i == 0)
					count++;    //������ ������������ count �߰�
			}
			if(count != 20) {//1~20�� �ϳ��� �� ������ ��������
				num++;  //���� ����
				count = 0;  //count �ʱ�ȭ
			}
			else if(count == 20)//1~20 � ���ε� ������ ������ ��
				result = true;  //result true��  while�� ����

		}
		System.out.println(num);
	}
}