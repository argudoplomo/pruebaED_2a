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

	@Test
	void testEqualsPersona1() {
		Persona p1 = new Persona(06334300, "David", 'M', 26, 8, 2006);
		Persona p2 = new Persona(06334300, "Argudo", 'M', 2, 8, 2005);
		assertEquals(true, p1.equals(p2));
	}
	
	@Test
	void testEqualsPersona2() {
		Persona p1 = new Persona(06334300, "David", 'M', 26, 8, 2006);
		Persona p2 = new Persona(06334301, "David", 'M', 26, 8, 2006);
		assertEquals(false, p1.equals(p2));
	}
}
