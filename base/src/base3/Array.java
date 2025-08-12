package base3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		String[] a = { "hoho", "hehe" };
		System.out.println("haha" + a[1]);
		System.out.println(Arrays.toString(a));

		// ===========================================
		int[] b = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ;");
		}
		sc.close();

	}
}
