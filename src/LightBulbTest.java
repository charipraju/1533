import static org.junit.Assert.*;

import org.junit.Test;

public class LightBulbTest {

	@Test
	public void testForfail() {
		LightBulb b = new LightBulb();
		b.setWatte(60);
		assertEquals(60,b.getBulbWattage());
	}

}