package practice14;

public class num3 {

	public static void main(String[] args) {
		human1 h = new human1("����",181,73);
		human1 s = new human1("����", 158,50);
		
		h.gainweight(1);
		s.lossweight(2);
		
		System.out.println("�̸�:" + h.getname());
		System.out.println("����: "+h.getheight());
		System.out.println("ü��: "+h.getweight());
		System.out.println();
		System.out.println("�̸�:" + s.getname());
		System.out.println("����: "+s.getheight());
		System.out.println("ü��: "+s.getweight());
	}

}
