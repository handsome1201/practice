package practice31;

public class HumanTester1 {

	public static void main(String[] args) {
		Human1 gildong = new Human1("길동", 170, 60);
		Human1 chulsu = new Human1("철수", 166,72);

		gildong.gainweight(3);
		chulsu.loseweight(5);

		System.out.println("이름:"+gildong.getname());
		System.out.println("신장:"+gildong.getheight());
		System.out.println("체중:"+gildong.getweight());
		System.out.println();
		System.out.println("이름:"+chulsu.getname());
		System.out.println("신장:"+chulsu.getheight());
		System.out.println("체중:"+chulsu.getweight());

	}

}
