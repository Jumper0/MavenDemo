package de.msgdavid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest_tmp {
	private static final Logger logger = LogManager.getLogger(CalculatorDemo.class);

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
		Assert.assertEquals(8.0, calc.add(3, 5), 0.0);
		logger.info("Test 'Add' erfolgreich!");
	}

	@Test
	public void testSub() {
		Assert.assertEquals(2.0, calc.sub(5, 3), 0.0);
		logger.info("Test 'Sub' erfolgreich!");
	}

	@Test
	public void testDiv() {
		Assert.assertEquals(2, calc.div(6, 3), 0.0);
		logger.info("Test 'Div' erfolgreich!");
	}

	@Test
	public void testMulti() {
		Assert.assertEquals(15,calc.multi(3, 5),0);
		logger.info("Test 'Multi' erfolgreich!");
	}

	@Test
	public void testSqrt(){
		Assert.assertEquals(7,calc.sqrt(49),0);
		logger.info("Test 'Sqrt' erfolgreich!");
	}

	@Test
	public void testPow(){
		Assert.assertEquals(4,calc.pow(2,2),0);
		logger.info("Test 'Pow' erfolgreich!");
	}

	@Test
	public void testMod(){
		Assert.assertEquals(2, calc.mod(10, 4), 0);
		logger.info("Test 'Mod' erfolgreich!");
	}

}
