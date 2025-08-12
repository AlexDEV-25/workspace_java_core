package base5;

public class String_Data_Type {
	public static void main(String[] args) {
		String a = "  hOAng van dUc   moI";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.trim());
		System.out.println(a.substring(5, 13));

		if (a.trim().toLowerCase().startsWith("hoang")) {
			System.out.println("moi moi");
		}
	}
}
