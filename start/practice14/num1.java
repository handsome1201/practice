package practice14;

public class num1 {

	public static void main(String[] args) {
		node one = new node(10,20);
		node two = new node(30,40);
		node result = one.getcenter(two);
		System.out.println("x:"+result.getx()+" y:"+result.gety());

	}

}
