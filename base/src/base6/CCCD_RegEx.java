package base6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CCCD_RegEx {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^(?!\\d+$)\\w{8,20}$");
		Matcher matcher = pattern.matcher("Tryurcode4u");
		System.out.println("Input String matches regex - " + matcher.matches());
	}
}
