package base1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		float a;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap canh ");
		a = sc.nextFloat();
		System.out.println("the tich khoi lap phuong " + Math.pow(a, 3));
		sc.close();
	}
}
