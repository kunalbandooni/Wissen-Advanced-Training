package JUnitTest.JUnitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class App 
{
	public int add(int a, int b){
	        return a + b;
	}

	@Test
	public void addTest1(){
	     App testobj = new App();
	     int result = testobj.add(10, 20);
	     
	     assertEquals(30, result);
	}
	
	@Ignore
	@Test
	public void addTest2() {
		App testobj = new App();
		int result = testobj.add(40, 50);
	     assertEquals(90, result);
	}
	
	@Test
	public void addTest3() {
		App testobj = new App();
		int result = testobj.add(20, 80);
	     assertEquals(100, result);
	}
}