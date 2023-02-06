import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class testCountLetterA {
	
	QuizOneJunit testObj;
	
	@Before
	public void setup() {
		testObj = new QuizOneJunit();
	}
	
	@Test
	public void testAssertEquals(){
		assertEquals(testObj.countLetterA("minimal"), 1);
	}
	
	@Test
	public void testAssertNotEquals() {
		assertNotEquals(testObj.countLetterA("animal"), 0);
	}
	
	@Test
	public void testNotNull() {
		assertNotNull(testObj.countLetterA("minimal"));
		}
}
