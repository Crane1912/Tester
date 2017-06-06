package TesterPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddString {

	@Test
	public void AddStringTester() {
		Calculations c1 = new Calculations();
		String result = c1.AddSttrings("Finn", " Balor");
		assertEquals("Finn Balor",result);
	}

}
