package practice31;

public class HumanTester1 {

	public static void main(String[] args) {
		Human1 gildong = new Human1("�浿", 170, 60);
		Human1 chulsu = new Human1("ö��", 166,72);

		gildong.gainweight(3);
		chulsu.loseweight(5);

		System.out.println("�̸�:"+gildong.getname());
		System.out.println("����:"+gildong.getheight());
		System.out.println("ü��:"+gildong.getweight());
		System.out.println();
		System.out.println("�̸�:"+chulsu.getname());
		System.out.println("����:"+chulsu.getheight());
		System.out.println("ü��:"+chulsu.getweight());

	}

}
