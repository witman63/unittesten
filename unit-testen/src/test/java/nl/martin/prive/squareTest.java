package nl.martin.prive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		Arithmetic ar = new Arithmetic();
		int output = ar.square(5);
		assertEquals(25, output );
	}

}
