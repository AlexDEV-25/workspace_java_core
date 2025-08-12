package base4;

public interface Animal {

	public void sound();

	public void run();

	default void sleep() {
		System.out.println("Zzzzzzzzzzz");
	}

}
