package base1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		float cd;
		float cr;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu dai chieu rong");
		cd = sc.nextFloat();
		cr = sc.nextFloat();
		System.out.println("dien tich la : " + (cd * cr));
		System.out.println("chu vi la : " + (cd + cr) * 2);
		System.out.println("canh dai hon : " + Math.max(cd, cr));
		sc.close();
	}
}
