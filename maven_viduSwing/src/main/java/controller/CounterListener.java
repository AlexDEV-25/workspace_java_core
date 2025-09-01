package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener {
	private CounterView ctv;

	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("ban da nhan nut !");
		String src = e.getActionCommand(); // cho biết nút vừa nhấn là gì
		System.out.println("ban da nhan nut " + src);
		if (src.equalsIgnoreCase("Up")) {
			this.ctv.tangSo();
		} else if (src.equalsIgnoreCase("Down")) {
			this.ctv.giamSo();
		} else if (src.equalsIgnoreCase("Reset")) {
			this.ctv.reSetSo();
		}
	}

}
