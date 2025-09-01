package model;

public class CounterModel {
	private int vaLue;

	public CounterModel() {
		this.vaLue = 0;
	}

	public int getVaLue() {
		return vaLue;
	}

	public void setVaLue(int vaLue) {
		this.vaLue = vaLue;
	}

	public void tangGt() {
		this.vaLue++;
	}

	public void giamGt() {
		this.vaLue--;
	}

	public void reSet() {
		this.vaLue = 0;
	}

}
