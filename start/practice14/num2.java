package practice14;

public class num2 {

	public static void main(String[] args) {

		human h = new human();
		human s = new human();

		h.name = "현제";
		h.height = 181;
		h.weight = 73;

		s.name = "소희";
		s.height = 155;
		s.weight = 50;

		System.out.println("이름: "+ h.name);
		System.out.println("신장: "+ h.height);
		System.out.println("체중: "+ h.weight);
		System.out.println();
		System.out.println();
		System.out.println("이름: "+ s.name);
		System.out.println("신장: "+ s.height);
		System.out.println("체중: "+ s.weight);

	}

}
