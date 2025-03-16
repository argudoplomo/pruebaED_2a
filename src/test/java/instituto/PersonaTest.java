package instituto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testGetEdad1() {
		Persona p1 = new Persona(0, null, 'M', 16, 1, 2000);
		assertEquals(25, p1.getEdad());
	}

	@Test
	void testGetEdad2() {
		Persona p1 = new Persona(0, null, 'M', 26, 8, 2006);
		assertEquals(18, p1.getEdad());
	}

	
}
