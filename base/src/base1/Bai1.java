package base1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		String ten;
		double diem;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap ten ");
		ten = sc.nextLine();
		System.out.print("nhap diem ");
		diem = sc.nextDouble();
		System.out.println("ten la " + ten + " diem la " + diem);
		sc.close();
	}
}
