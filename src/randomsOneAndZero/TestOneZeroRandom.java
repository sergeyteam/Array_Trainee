package randomsOneAndZero;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOneZeroRandom {

	private OneZeroRandoms rand;

	@Before
	public void setUp(){
		rand = new OneZeroRandoms();
	}

	@After
	public void tearDown() throws Exception {
		rand = null;
	}

	@Test(expected=OneZeroRandomException.class)
	public void testValidateToNull() throws OneZeroRandomException {
		rand.validate(null);
	}
	
	@Test(expected=OneZeroRandomException.class)
	public void testValidateToLenth() throws OneZeroRandomException {
		rand.validate(new int[2]);
	}
	
	@Test
	public void testOneAndZero() throws OneZeroRandomException {
		assertArrayEquals(new int[]{1,0,1}, rand.oneAndZero(new int[3]));
	}

	

}
