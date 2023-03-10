package JUnitTest3;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TearDownFunction {
	public int add(int a, int b){
        return a + b;
	}
	
	// JUnit work starts...
	
	@BeforeClass
	public static void beforeAll() {
		System.out.println("INITIALIZING");
	}

	@Before
	public void beforeEachTest() {
		System.out.println("Before Test case");
	}
	
	@Test
	public void addTest1(){
		TearDownFunction testobj = new TearDownFunction();
		int result = testobj.add(10, 20);
		
		assertEquals(30, result);
	}
	
	@Test
	public void addTest2() {
		TearDownFunction testobj = new TearDownFunction();
		int result = testobj.add(40, 50);
		assertEquals(90, result);
	}
	
	@Test
	public void addTest3() {
		TearDownFunction testobj = new TearDownFunction();
		int result = testobj.add(20, 80);
		assertEquals(100, result);
	}
	
	@After
	public void afterEachTest() {
		System.out.println("After Test case");
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("DESTRUCTION");
	}
}