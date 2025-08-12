package base6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatKhau_RexEx {
	/*
	 * it nhat 8 ki tu
	 * 
	 */
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d{8,}");
		Matcher matcher = pattern.matcher("11111888");
		System.out.println("Input String matches regex - " + matcher.matches());
	}
}
