package TesterPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTester {

	@Test
	public void AddTester() {
		Calculations c1 = new Calculations();
		int result = c1.AddNumbers(5, 10);
		assertEquals(15,result);
	}

}
