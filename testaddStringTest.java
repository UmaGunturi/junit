package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddStringTest {

	@Test
	public void test() {
		//fail("Not  yet implemented");
		jUnitFunction junit1=new jUnitFunction();
		String result=junit1.addStrings("Sushmita", "Gunturi");
		assertEquals("SushmitaGunturi",result);
	}

}
