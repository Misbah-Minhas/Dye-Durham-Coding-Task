package Sorting_Algorithm_Test_Suite;
import static org.junit.Assert.*;
import org.junit.Test;
import Sortting_Algorithm_Code.*;

public class Names_Test_Suite {
	Names names=new Names("Marin", "Alvarez");
	@Test
	public void testFirstNamePart() {
		assertEquals("Marin", names.getFirstNamePart());
	}
	@Test
	public void testSurNamePart() {
		assertEquals("Alvarez", names.getSurName());
	}
	@Test
	public void testWrongFirstName() {
		assertEquals("Amy", names.getFirstNamePart());
	}
	@Test
	public void testWrongSurName() {
		assertEquals("Zara", names.getSurName());
	}

}
