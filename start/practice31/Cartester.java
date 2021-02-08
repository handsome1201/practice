package practice31;

public class Cartester {

	public static void main(String[] args) {
		Car k3 = new Car("k3", "서울999-99", 1660, 1500, 3640, 40, 12);
		Car k5 = new Car("k8", "서울999-98", 1660, 1525, 3695, 41, 12);

		k3.spec();
		System.out.println();
		k5.spec();
	}

}
