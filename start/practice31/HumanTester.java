package practice31;
public class HumanTester {

	public static void main(String[] args) {
		Human gildong = new Human();
		Human chulsu = new Human();

		gildong.name="�浿";
		gildong.height= 170;
		gildong.weight=60;

		chulsu.name="ö��";
		chulsu.height= 166;
		chulsu.weight=72;

		System.out.println("�̸�:"+gildong.name);
		System.out.println("����:"+gildong.height);
		System.out.println("ü��:"+gildong.weight);
		System.out.println();
		System.out.println("�̸�:"+chulsu.name);
		System.out.println("����:"+chulsu.height);
		System.out.println("ü��:"+chulsu.weight);
	}

}
