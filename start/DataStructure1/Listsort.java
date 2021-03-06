package DataStructure1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Listsort {

	public static void main(String[] args) {
		List<student> list = new ArrayList<student>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String [] str = br.readLine().split(" ");
			String name = str[0];
			int year = Integer.parseInt(str[1]);
			int score = Integer.parseInt(str[2]);
			list.add(new student(name,year,score));
		}
		br.close();
	}
	
	Collections.sort(list);
	
	
	
	

}
