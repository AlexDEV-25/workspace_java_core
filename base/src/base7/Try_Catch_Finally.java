package base7;

import java.util.Scanner;

public class Try_Catch_Finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			System.out.println((float) 10 / x);
		} catch (Exception e) {
			System.out.println("loi");
		} finally {
			System.out.println("duc da den day");
		}
		sc.close();
	}
}
