package JUnitTest2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class UserException extends Exception
{
	/**
	 * User given Exception...
	 */
	private static final long serialVersionUID = 1L;
	UserException(){	}
	UserException(String msg){
		super(msg);
	}
}

public class ExpectedException
{
	public String add(int a, int b) throws UserException{
		int sum = a + b;
		if(sum > 100)
			throw new UserException("Sum greater than 100");
		return "No";
	}

	@Test(expected=UserException.class)
	public void addTest1() throws UserException{
		ExpectedException testobj = new ExpectedException();
	     
	    assertEquals("Yes", testobj.add(100, 20));
	}
}