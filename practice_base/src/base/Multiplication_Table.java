package base;

import java.util.Scanner;

public class Multiplication_Table {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("-----------");
		}
		System.out.println("nhap bang muon tinh 1-9 : ");
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			try {
				n = sc.nextInt();
				for (int j = 1; j <= 10; j++) {
					System.out.println(n + " * " + j + " = " + n * j);
				}
				break;
			} catch (Exception e) {
				System.out.println("loi roi vui long nhap lai");
				sc.nextLine();// xóa enter
			}
		}
		sc.close();
	}

}
