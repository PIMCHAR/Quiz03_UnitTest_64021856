import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class testCheckTwoLetter {
	QuizOneJunit testObj;
	
	@Before
	public void setup() {
		testObj = new QuizOneJunit();
	}
	
	@Test
	public void testAssertTrue(){
		assertTrue(testObj.checkTwoLetter("aa"));
	}
	
	@Test
	public void testAsertFalse(){
		assertFalse(testObj.checkTwoLetter("saaa"));
	}
}
