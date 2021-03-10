package third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestDriver1 {

	public static void main(String[] args) throws java.lang.Exception{
		List<Student1> list = new ArrayList<Student1>();
		Scanner scr = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			String FirstName = scr.nextLine();
			int IdNumber = scr.nextInt();
			int ScoreNumber = scr.nextInt();
			list.add(new Student1(FirstName, IdNumber, ScoreNumber));
		}
		
		
		System.out.println("Testing with Comparable interface");
		System.out.println();
		Collections.sort(list);

		java.util.Iterator<Student1> iter = list.iterator();
		while(iter.hasNext()){
			Student1 str = (Student1)iter.next();
			System.out.println(str.name + ", "+ str.id+", "+str.score);
		}
		System.out.println();
		System.out.println("comparator interface");
		System.out.println();

		Comparator<Student1> myComparator = new Comparator<Student1>() {
			@Override
			public int compare(Student1 s1, Student1 s2) {
				return s2.getSCore() - s1.getSCore();
			}

		};

		Collections.sort(list, myComparator);

		iter = list.iterator();

		while(iter.hasNext()) {
			Student1 str = (Student1)iter.next();
			System.out.println(str.name + "," +str.id+ "," +str.score);
		}
		scr.close();
	}
}
