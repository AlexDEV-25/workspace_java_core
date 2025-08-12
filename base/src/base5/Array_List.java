package base5;

import java.util.ArrayList;

import base4.Student;

public class Array_List {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		Student s1 = new Student("duc", 20, "male");
		Student s2 = new Student("d", 20, "n");
		Student s3 = new Student("u", 20, "a");
		Student s4 = new Student("c", 20, "m");
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		System.out.println("=============================");
		for (Student s : a) {
			System.out.println(s.toString());
		}
		System.out.println("=============================");
		a.remove(2);
		for (Student s : a) {
			System.out.println(s.toString());
		}
		System.out.println("=============================");
		System.out.println(a.get(2));
		System.out.println("=============================");
		System.out.println(a.size());
//		a.clear();

	}
}
