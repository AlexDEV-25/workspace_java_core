package base2;

import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
		int tuoi;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap tuoi ");
		tuoi = sc.nextInt();
		if (tuoi < 16) {
			System.out.println("di tu");
		} else {
			System.out.println("an toan");
		}
		sc.close();
	}
}
