package de.msgdavid;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest_tmp {

	private static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd");
		Assert.assertEquals(8.0, calc.add(3, 5), 0.0);
	}

	@Test
	public void testSub() {
		System.out.println("testSub");
		fail("Not yet implemented");
	}

	@Test
	public void testDiv() {
		System.out.println("testDiv");
		Assert.assertEquals(2, calc.div(3, 6), 0.0);
	}

	@Test
	public void testMulti() {
		System.out.println("testMulti");
		fail("Not yet implemented");
	}

}
