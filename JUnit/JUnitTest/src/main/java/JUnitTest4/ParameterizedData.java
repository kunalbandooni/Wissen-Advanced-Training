package JUnitTest4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

class addClass
{
	public int addNumbers(int a , int b) {
		return a + b;
	}
}

@RunWith(Parameterized.class)
public class ParameterizedData {
	private int firstNum;
	private int secondNum;
	private int expectedResult;
	private addClass addClassObj;
	
	public ParameterizedData(int f, int s, int r) {
		super();
		this.firstNum = f;
		this.secondNum = s;
		this.expectedResult = r;
	}
	
	@Before
	public void initialize() {
		addClassObj = new addClass();
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] {{1,2,3}, {11,22,33}, {111, 222, 333}});
	}
	
	@Test
	public void addNumbersTest() {
		int iResult = addClassObj.addNumbers(firstNum, secondNum);
		System.out.println("\n\nExecuting add numbers TestCase with\n First number: " + firstNum + "\n Second number: " + secondNum);
		System.out.println("Result : " + expectedResult);
		assertEquals(expectedResult, iResult);
	}
}