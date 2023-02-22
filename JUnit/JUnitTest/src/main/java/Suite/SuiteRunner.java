package Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import JUnitTest.JUnitTest.App;
import JUnitTest2.ExpectedException;
import JUnitTest3.TearDownFunction;
import JUnitTest4.ParameterizedData;

@RunWith(Suite.class)
@SuiteClasses({App.class, ExpectedException.class, TearDownFunction.class, ParameterizedData.class})

public class SuiteRunner {

}
