import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void testAdd() {
		assertEquals(12, new Math().add(8, 4));
	}

}
