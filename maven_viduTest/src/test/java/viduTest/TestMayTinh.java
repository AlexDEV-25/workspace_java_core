package viduTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MayTinh;

public class TestMayTinh {

	@Test
	public void test() {
		assertEquals(15, MayTinh.sum(10, 5), 0.01);
	}

}
