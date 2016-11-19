package polindrom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPolindrom {
	
	private Polindrom pol;
	
	@Before
	public void setUp() {
		pol = new Polindrom();
	}

	@After
	public void tearDown() throws Exception {
		pol = null;
	}

	
	@Test(expected=PolindromException.class)
	public void testValidateToNULL() throws PolindromException {
		pol.validate(null);
	}
	
	@Test(expected=PolindromException.class)
	public void testValidateToLength() throws PolindromException {
		pol.validate(new int[2]);
	}
	
	@Test(expected=PolindromException.class)
	public void testValidateToEVEN() throws PolindromException {
		pol.validate(new int[4]);
	}
	
	@Test
	public void testOneIsPolindrom() throws PolindromException {
		Assert.assertArrayEquals(new int[]{0,1,0}, pol.isPolindrom(new int[3]));
	}
	
	@Test
	public void testTwoIsPolindrom() throws PolindromException {
		Assert.assertArrayEquals(new int[]{0, 1, 2, 1, 0}, pol.isPolindrom(new int[5]));
	}

}
