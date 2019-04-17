package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcaseadd {

	@Test
	public void test() {
		//fail("Not  yet implemented");
		jUnitFunction junit=new jUnitFunction();
		int result=junit.addNumbers(100,200);
		assertEquals(300,result);
	}

}
