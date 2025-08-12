package base4;

public class Human extends Race implements Animal {
	protected String sex;

	public Human(String sex) {
		this.sex = sex;
	}

	public Human() {

	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void an() {
		System.out.println("nhom nhoam");
	}

	@Override
	public void race() {
		System.out.println("Homo sapiens");

	}

	@Override
	public void sound() {
		System.out.println("AGHHHHHHHHHHHHHHHHHHHHHHHHHH");

	}

	@Override
	public void run() {
		System.out.println("vu vu");

	}

}
