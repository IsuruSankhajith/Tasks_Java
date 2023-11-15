package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import software.SimpleArithmetic;

class ArithDivTest {
	@Test
	public void testDivIntP() {
		assertEquals(9, SimpleArithmetic.divInt2no(27, 3), "error in divInt2no()");
		assertEquals(0, SimpleArithmetic.divInt2no(2, 8), "error in divInt2no()");
	}

	@Test
	public void testDivIntF() {
		assertNotEquals(3, SimpleArithmetic.divInt2no(27, 3), "error in divInt2no()");
	}

	@Test
	public void testDivIntByZero() {
		assertThrows(RuntimeException.class, () -> {
			SimpleArithmetic.divInt2no(5, 0);
		}); // expect an IllegalArgumentException
	}

	@Test
	public void testDivRealP() {
		assertEquals(0.666666, SimpleArithmetic.divReal2no(2, 3), 1e-6, "error in divInt2no()");
		assertEquals(0.222222, SimpleArithmetic.divReal2no(2, 9), 1e-6, "error in divInt2no()");
	}

	@Test
	public void testDivRealByZero() {
		assertThrows(RuntimeException.class, () -> {
			SimpleArithmetic.divInt2no(3, 0);
		}); // expect an IllegalArgumentException
	}

}
