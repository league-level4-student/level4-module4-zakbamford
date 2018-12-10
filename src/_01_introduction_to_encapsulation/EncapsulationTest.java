package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class EncapsulationTest {
	EncapsulateTheData e = new EncapsulateTheData();

	@Test
	public void testItemsReceived() {
		e.setItemsReceived(-2);
		assertEquals(0, e.getItemsReceived());
	}

	@Test
	public void testDegreesTurned() {
		e.setDegreesTurned(90);
		e.setDegreesTurned(1000);
		assertEquals(90, e.getDegreesTurned());
	}

	@Test
	public void testNomenclature() {
		e.setNomenclature("");
		assertEquals(" ", e.getNomenclature());
	}

	@Test
	public void testMemberObj() {
		e.setMemberObj("hi");
		assertFalse(e.getMemberObj() instanceof String);
	}
}
