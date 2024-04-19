package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompteBancaire {

	@Test
	void testDebiterSolde() {
		CompteBancaire cb = new CompteBancaire();
		assertEquals(10,cb.debiterSolde(5, 5));
	}

	@Test
	void testCrediterSolde() {
		CompteBancaire cb = new CompteBancaire();
		assertEquals(5,cb.crediterSolde(10, 5));
	}

	@Test
	void testGetSolde() {
		CompteBancaire cb = new CompteBancaire();
		assertEquals(0,cb.getSolde());
	}

	@Test
	void testDebiterSolde2() {
		CompteBancaire cb = new CompteBancaire();
		assertEquals(10,cb.debiterSolde(-5, 15));
	}

	@Test
	void testCrediterSolde2() {
		CompteBancaire cb = new CompteBancaire();
		assertEquals(-5,cb.crediterSolde(10, 15));
	}
}