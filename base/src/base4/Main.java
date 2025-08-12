package base4;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setTen("duc");
		s1.setTuoi(21);
		s1.setSex("male");
		Student s2 = new Student("quynh", 21, "female");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		s1.an();
		s2.race();
		s1.sound();
		s2.run();

		// da hinh
		Human s3 = new Student("kien", 20, "female");
		System.out.println(s3.toString());
		s3.sleep();
	}
}
