package base2;

public class Function {

	public static void ptb1(int a, int b) {
		if (a == 0 && b != 0) {
			System.out.println("phuong tring vo nghiem");
		} else if (a == 0 && b == 0) {
			System.out.println("phuong trinh vo so nhiem");
		} else {
			System.out.println("phuong trinh co nghiem x = " + (-(float) b / a));
		}
	}

	public static void main(String[] args) {
		ptb1(4, 2);
	}
}
