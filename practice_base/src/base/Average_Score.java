package base;

import java.util.Scanner;

class DiemKhongAm extends Exception {
	public DiemKhongAm(String thongDiep) {
		super(thongDiep);
	}
}

public class Average_Score {

	public static float tinhDiemTB(float a, float b, float c) throws Exception, DiemKhongAm {
		if (a > 10 || b > 10 || c > 10) {
			throw new Exception("diem khong qua 10");

		}
		if (a < 0 || b < 0 || c < 0) {
			throw new DiemKhongAm("diem khong duoc am");

		}
		return (float) (a + b + c) / 3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, b, c, n;
		while (true) {
			try {
				a = sc.nextFloat();
				b = sc.nextFloat();
				c = sc.nextFloat();

				n = tinhDiemTB(a, b, c);
				if (n >= 9 && n <= 10) {
					System.out.println("gioi");
				} else if (n < 9 && n >= 7) {
					System.out.println("kha");
				} else {
					System.out.println("trung binh");
				}
				break;
			} catch (DiemKhongAm e) {
				System.out.println(e.getMessage());
				sc.nextLine();// xóa enter
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("loi roi vui long nhap lai");
				sc.nextLine();// xóa enter
			}
		}
		sc.close();

	}
}
