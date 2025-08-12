package base1;

import java.util.Scanner;

public class Nhap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.nextLine();
		System.out.println(a + "-----" + b);
		sc.close();
	}
}
