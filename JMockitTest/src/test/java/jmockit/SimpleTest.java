package jmockit;

import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Test;

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
