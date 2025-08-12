package base5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		ArrayList<Double> aL = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		String aS;
		double nU;
		while (true) {
			System.out.println("nhap so thuc");
			nU = sc.nextDouble();
			aL.add(nU);
			System.out.println("nhan Y de tiep tuc N de thoat");
			String t = sc.nextLine();
			System.out.print(t);
			aS = sc.nextLine();
			if (aS.equalsIgnoreCase("n")) {
				break;
			}
		}
		double sU = 0;
		for (Double double1 : aL) {
			sU += double1;
		}
		System.out.println("tong bang " + sU);

		sc.close();
	}
}
