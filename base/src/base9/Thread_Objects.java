package base9;

public class Thread_Objects extends Thread {

	public void run() {
		System.out.println("start thread");
		long sum = 0L;
		for (int i = 0; i < 10000000000L; i++) {
			sum += i;
		}
		System.out.println((double) sum / sum);
		System.out.println("end thread");
	}

	public static void main(String[] args) {
		int MAX = 4;
		for (int i = 0; i < MAX; i++) {
			(new Thread_Objects()).start();
		}
		System.out.println("finish");
	}
}
