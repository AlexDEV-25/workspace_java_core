package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

// từ khóa this để ám chỉ thằng class đang đứng

public class CounterView extends JFrame {
	private CounterModel cTm;
	private JButton jB_Up, jB_Down, jB_Reset;
	private JLabel jL_Value;// dùng để xuất dữ liệu lên trên màn hình

	public CounterView() {
		this.cTm = new CounterModel();
		this.inti();// chỉ đơn giản là gọi 1 phương thức để khởi tạo ra cửa sổ
		this.setVisible(true);// đây mới là lúc tạo ra cửa sổ
	}

	private void inti() {
		this.setTitle("Count");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener ac = new CounterListener(this); // ActionListener sẽ được hiện thực thông qua CouterListener()

		this.jB_Up = new JButton("UP");
		this.jB_Up.addActionListener(ac);// khi nhấn cái nút này thì nó sẽ nhảy đến 1 cái sự kiện ac nào đó

		this.jB_Down = new JButton("Down");
		this.jB_Down.addActionListener(ac);// khi nhấn cái nút này thì nó sẽ nhảy đến 1 cái sự kiện ac nào đó

		this.jB_Reset = new JButton("Reset");
		this.jB_Reset.addActionListener(ac);// khi nhấn cái nút này thì nó sẽ nhảy đến 1 cái sự kiện ac nào đó

		jL_Value = new JLabel(this.cTm.getVaLue() + "", JLabel.CENTER);// JLaybel chỉ nhận vào text nên cần ""

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());// set các thành phần trong jPanel ở dạng BorderLayout
		jPanel.add(jB_Up, BorderLayout.WEST);
		jPanel.add(jL_Value, BorderLayout.CENTER);
		jPanel.add(jB_Down, BorderLayout.EAST);

		this.setLayout(new BorderLayout());// set thằng jPanel ở dạng BorderLayout trong cửa sổ to nhất

		this.add(jPanel, BorderLayout.CENTER);// thêm thằng jPanel vào chính giữ cửa sổ

		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new GridLayout());
		jPanel1.add(jB_Reset);
		this.add(jPanel1, BorderLayout.SOUTH);// thêm thằng jPanel vào chính giữ cửa sổ

	}

	public void tangSo() {
		this.cTm.tangGt();
		this.jL_Value.setText(this.cTm.getVaLue() + "");
	}

	public void giamSo() {
		this.cTm.giamGt();
		this.jL_Value.setText(this.cTm.getVaLue() + "");
	}

	public void reSetSo() {
		this.cTm.reSet();
		this.jL_Value.setText(this.cTm.getVaLue() + "");
	}

	public static void main(String[] args) {
		CounterModel cm = new CounterModel();
		System.out.println("ban dau : " + cm.getVaLue());
		cm.tangGt();
		cm.tangGt();
		cm.tangGt();
		System.out.println("sau tang : " + cm.getVaLue());
		cm.giamGt();
		System.out.println("sau giam : " + cm.getVaLue());
		cm.reSet();
		System.out.println("sau reset : " + cm.getVaLue());
		new CounterView();
	}
}
