package jmockit;

import org.junit.Test;
import junit.framework.TestCase;

public class SimpleTest {
	@Mocked
	private Simple mockSimple;

	@Test
	public void testGetStr() throws Exception {
		Simple simple = new Simple();
		System.out.println(simple.getStr());
	}

	@Test
	public void testGetStra() throws Exception {
		new NonStrictExpectations() {
			{
				mockSimple.getStr();
				result = "モックになりました。";
			}
		};
		System.out.println(mockSimple.getStr());
	}
}
