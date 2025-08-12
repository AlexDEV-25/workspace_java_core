package base4;

public class Student extends Human {
	private String ten;
	private int tuoi;

	public Student(String ten, int tuoi, String sex) {
		super(sex);
		this.ten = ten;
		this.tuoi = tuoi;
	}

	public Student() {
		super();
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	@Override
	public String toString() {
		return "Student [ten=" + ten + ", tuoi=" + tuoi + ", tuoi=" + sex + "]";
	}
}
