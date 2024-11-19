package chapter08;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySortMain {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		array.add(new Student(2,"bbb",100));
		array.add(new Student(1,"aaa",50));
		array.add(new Student(4,"aaa",70));
		array.add(new Student(3,"aaa",80));
		
		Collections.sort(array);
		
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

}
