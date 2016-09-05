import junit.framework.TestCase;

import org.junit.Test;

public class FooBarQixTest extends TestCase {

	private Main main;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		main = new Main();
	}

	@Test
	public void test() {
		assertEquals("1", main.extractWords(1));
		assertEquals("2", main.extractWords(2));
	}

	@Test
	public void testFoo() {
		assertEquals("Foo", main.extractWords(13));
	}

	@Test
	public void testBar() {
		assertEquals("Bar", main.extractWords(10));
	}

	@Test
	public void testQix() {
		assertEquals("Qix", main.extractWords(14));
		assertEquals("Qix", main.extractWords(17));
	}
	
	@Test
	public void testFooBar() {

	}

	@Test
	public void testBarFoo() {

	}

}
