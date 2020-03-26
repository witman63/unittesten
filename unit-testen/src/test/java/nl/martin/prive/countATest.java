package nl.martin.prive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		Arithmetic ar = new Arithmetic();
		int output =ar.countA("Arie bom barie");
		assertEquals(3, output);
	}

}
