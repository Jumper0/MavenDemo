package de.msgdavid;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(20, Calculator.add(8, 12), 0);
	}

	@Test
	public void testSub() {
		fail("Not yet implemented");
	}

	@Test
	public void testDiv1() {
		Assert.assertEquals(20, Calculator.div(12, 0), 0);

	}

	@Test
	public void testDiv2() {
		try {
			Calculator.div(12, 0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertEquals("ArithmeticException", e.getClass().getSimpleName());
//			Assert.assertEquals(20, Calculator.div(12, 0), 0);
		}

	}

	@Test
	public void testMulti() {
		fail("Not yet implemented");
	}

}
