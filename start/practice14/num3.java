package practice14;

public class num3 {

	public static void main(String[] args) {
		human1 h = new human1("현제",181,73);
		human1 s = new human1("소희", 158,50);
		
		h.gainweight(1);
		s.lossweight(2);
		
		System.out.println("이름:" + h.getname());
		System.out.println("신장: "+h.getheight());
		System.out.println("체중: "+h.getweight());
		System.out.println();
		System.out.println("이름:" + s.getname());
		System.out.println("신장: "+s.getheight());
		System.out.println("체중: "+s.getweight());
	}

}
