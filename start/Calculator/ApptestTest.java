package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApptestTest {

	@Test
	public void add() {
		Apptest app = new Apptest();
		int result = app.add(2, 1);
		assertEquals(3,result);
	}

}
