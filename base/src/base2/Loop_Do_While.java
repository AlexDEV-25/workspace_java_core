package base2;

import java.util.Scanner;

public class Loop_Do_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		do {
			i = sc.nextInt();
		} while (i != 1);
		sc.close();
	}
}
