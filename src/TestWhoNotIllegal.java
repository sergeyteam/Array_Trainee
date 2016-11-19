import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestWhoNotIllegal {

	private WhoNOTLegal who;

	@Before
	public void setUp() throws Exception {
		who = new WhoNOTLegal();
	}

	@After
	public void tearDown() throws Exception {
		who = null;
	}

	@Test(expected=MYarraysException.class)
	public void testForNULL() throws MYarraysException {
		who.validate(null);
	}
	
	@Test(expected=MYarraysException.class)
	public void testForRange() throws MYarraysException {
		who.validate(new int[2]);
	}
	
	@Test(expected=MYarraysException.class)
	public void testForMinus() throws MYarraysException {
		who.validate(new int[]{-1,0,1,2});
	}
	
	@Test
	public void test1()throws MYarraysException{
		assertArrayEquals(new int[]{0, 1, 1},who.aboutNums(new int[3]));
	}
	
	@Test
	public void test2()throws MYarraysException{
		assertArrayEquals(new int[]{0, 1, 1, 3, 1, 0, 1, 2, 1, 4, 1, 1, 1, 3, 1, 0, 1, 2, 1, 4},who.aboutNums(new int[20]));
	}
	
	@Test(timeout=100)
	public void test3()throws MYarraysException{
		assertArrayEquals(new int[]{0, 1, 1, 3, 1, 0, 1, 2, 1, 4, 1, 1, 1, 3, 1, 0, 1, 2, 1, 4, 1, 1, 1, 3, 1, 0, 1, 2, 1, 4, 1, 1, 1, 3, 1, 0, 1, 2, 1, 4, 1, 1, 1, 3, 1, 0, 1, 2, 1, 4, 1, 1, 1, 3, 1, 0, 1, 2, 1, 4, 1, 1, 1, 3, 1, 0, 1, 2, 1, 4, 1, 1, 1, 3, 1, 0, 1, 2, 1, 4, 1, 1, 1, 3, 1, 0, 1, 2, 1, 4, 1, 1, 1, 3, 1, 0, 1, 2, 1, 4},who.aboutNums(new int[100]));
	}

}
