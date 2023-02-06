import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class testSquare {
	QuizOneJunit testObj;
	
	@Before
	public void setup() {
		testObj = new QuizOneJunit();
	}
	
	@Test
	public void testAssertEquals(){
		assertEquals(testObj.square(4), 16);
	}
	
	@Test
	public void testAssertNotEquals() {
		assertNotEquals(testObj.square(2), 0);
	}
}
